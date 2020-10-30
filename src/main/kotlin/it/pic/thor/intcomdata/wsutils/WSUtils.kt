package it.pic.thor.intcomdata.wsutils

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor
import org.apache.cxf.endpoint.Client
import org.apache.cxf.ext.logging.LoggingInInterceptor
import org.apache.cxf.ext.logging.LoggingOutInterceptor
import org.apache.cxf.ext.logging.event.LogEvent
import org.apache.cxf.ext.logging.event.LogEventSender
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.interceptor.InterceptorProvider
import org.apache.cxf.phase.Phase
import org.apache.cxf.transport.http.HTTPConduit
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import org.w3c.dom.Node
import java.io.StringReader
import java.io.StringWriter
import javax.xml.soap.SOAPException
import javax.xml.soap.SOAPMessage
import javax.xml.transform.OutputKeys
import javax.xml.transform.Source
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource

interface CXFMessageLogger : LogEventSender {
}

@Component
class DbCXFMessageLogger(val jdbcTemplate: JdbcTemplate) : CXFMessageLogger {
    val log = LoggerFactory.getLogger(this.javaClass)

    override fun send(event: LogEvent?) {
        if (event == null) {
            log.warn("Event shouldn't be null", Exception("the event shouldn't be null"))
            return
        }

        val payload = if (event.contentType.startsWith("text/xml")) {
            try {
                prettyXml(event.payload)
            } catch (e: Exception) {
                // probabilmente invio chunked
                event.payload
            }
        } else {
            event.payload
        }

        log.info("""
            
                <type>${event.type}<type>
                <fullContentFile>${event.fullContentFile}<fullContentFile>
                <headers>${event.headers}<headers>
                <portName>${event.portName}<portName>
                <portTypeName>${event.portTypeName}<portTypeName>
                <serviceName>${event.serviceName}<serviceName>
                <address>${event.address}<address>
                <contentType>${event.contentType}<contentType>
                <encoding>${event.encoding}<encoding>
                <exchangeId>${event.exchangeId}<exchangeId>
                <httpMethod>${event.httpMethod}<httpMethod>
                <messageId>${event.messageId}<messageId>
                <operationName>${event.operationName}<operationName>
                <principal>${event.principal}<principal>
                <responseCode>${event.responseCode}<responseCode>
                <payload>
                ${payload.take(32000)}
                </payload>
        """.trimIndent()
        )

        jdbcTemplate.update(
                """insert into THOR_COMDATA.MESSAGES
          (type, address, port_name, port_type_name, payload, headers, service_name, content_type
          , encoding, exchange_id, http_method, message_id, operation_name, principal, response_code
          ) values 
          (?, ?, ?, ?, ?, ?, ?, ?
          , ?, ?, ?, ?, ?, ?, ?
          )
        """.trimIndent(),
                event.type.toString(),
                event.address,
                event.portName.toString(),
                event.portTypeName.toString(),
                payload,
                event.headers.toString(),
                event.serviceName.toString(),
                event.contentType,
                event.encoding,
                event.exchangeId,
                event.httpMethod,
                event.messageId,
                event.operationName,
                event.principal,
                event.responseCode
        )
    }
    private fun prettyXml(input: String): String {
        try {
            val xmlInput: Source = StreamSource(StringReader(input))
            val stringWriter = StringWriter()
            val xmlOutput = StreamResult(stringWriter)
            val transformerFactory: TransformerFactory = TransformerFactory.newInstance()
            transformerFactory.setAttribute("indent-number", 4)
            val transformer: Transformer = transformerFactory.newTransformer()
            transformer.setOutputProperty(OutputKeys.INDENT, "yes")
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes")
            transformer.transform(xmlInput, xmlOutput)
            return xmlOutput.writer.toString()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}

object WSUtils {
    /**
     * log dei messaggi in uscita e in entrata sulla tabella
     */
    fun addLogging(clientOrServer: InterceptorProvider, logger: CXFMessageLogger) {
        clientOrServer.outInterceptors.add(LoggingOutInterceptor(logger).apply { this.limit = -1 })
        clientOrServer.inInterceptors.add(LoggingInInterceptor(logger).apply { this.limit = -1})
        clientOrServer.outFaultInterceptors.add(LoggingOutInterceptor(logger).apply { this.limit = -1})
        clientOrServer.inFaultInterceptors.add(LoggingInInterceptor(logger).apply { this.limit = -1})
    }

    fun setTimeout(client: Client) {
        val http = client.conduit as HTTPConduit
        http.client.receiveTimeout = (1000L * 180)
        http.client.connectionTimeout = (1000L * 30)
    }

    fun disableChunking(client: Client) {
        val http = client.conduit as HTTPConduit
        http.client.isAllowChunking = false
    }

    /**
     * eliminiamo tutti i tag vuoti o null
     */
    fun removeEmptyNodes(client: Client) {
        client.outInterceptors.add(SAAJOutInterceptor())
        client.outInterceptors.add(SOAPCleanerInterceptor())
    }
}

class SOAPCleanerInterceptor : AbstractSoapInterceptor(Phase.USER_PROTOCOL) {
    init {
        addAfter(SAAJOutInterceptor::javaClass.name)
    }

    override fun handleMessage(message: SoapMessage?) {
        try {
            if (message == null) {
                return
            }

            val sm: SOAPMessage? = message.getContent(SOAPMessage::class.java)

            if (sm == null) {
                throw RuntimeException("You must add the SAAJOutInterceptor to the chain")
            }

            while (removeEmptyNodes(sm.soapBody.firstChild) > 0) {
                // remove until no more empty
            }
        } catch (e: SOAPException) {
            throw Fault(e)
        }
    }

    private fun removeEmptyNodes(node: Node?): Int {
        var counter = 0
        if (node == null) {
            return 0
        }
        val list = node.childNodes
        for (i in 0 until list.length) {
            counter += removeEmptyNodes(list.item(i))
        }
        val emptyElement = (node.nodeType == Node.ELEMENT_NODE && node.childNodes.length == 0)
        val emptyText = (node.nodeType == Node.TEXT_NODE && node.nodeValue.trim().isEmpty())
        if (emptyElement || emptyText) {
            counter++
            node.parentNode.removeChild(node)
        }
        return counter
    }

}
