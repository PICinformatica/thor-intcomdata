package it.pic.thor.intcomdata.db

import java.io.ByteArrayInputStream
import java.io.StringWriter
import java.nio.charset.StandardCharsets
import javax.xml.bind.*
import javax.xml.namespace.QName
import javax.xml.transform.stream.StreamSource

object DbTypeToXmlMapper {

    fun xmlToTseCutoff(xml: String): TITSECUTOFFType {
        return try {
            val jaxbContext = JAXBContext.newInstance(TITSECUTOFFType::class.java)
            val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
            val input = ByteArrayInputStream(xml.toByteArray(StandardCharsets.UTF_8))
            val root = jaxbUnmarshaller.unmarshal(StreamSource(input), TITSECUTOFFType::class.java)
            root.value
        } catch (e: JAXBException) {
            throw RuntimeException(e)
        }
    }

    fun xmlToTseResponseEE(xml: String): TITSEEEALLType {
        return try {
            val jaxbContext = JAXBContext.newInstance(TITSEEEALLType::class.java)
            val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
            val input = ByteArrayInputStream(xml.toByteArray(StandardCharsets.UTF_8))
            val root = jaxbUnmarshaller.unmarshal(StreamSource(input), TITSEEEALLType::class.java)
            root.value
        } catch (e: JAXBException) {
            throw RuntimeException(e)
        }
    }

    fun xmlToTseResponseGas(xml: String): TITSEGASALLType {
        return try {
            val jaxbContext = JAXBContext.newInstance(TITSEGASALLType::class.java)
            val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
            val input = ByteArrayInputStream(xml.toByteArray(StandardCharsets.UTF_8))
            val root = jaxbUnmarshaller.unmarshal(StreamSource(input), TITSEGASALLType::class.java)
            root.value
        } catch (e: JAXBException) {
            throw RuntimeException(e)
        }
    }

    inline fun <reified T> toXml(x: T, dbTypeName: String): String {
        return try {
            val jaxbContext = JAXBContext.newInstance(T::class.java)
            val jaxbMarshaller = jaxbContext.createMarshaller()
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
            val sw = StringWriter()
            val root = JAXBElement(QName("", dbTypeName), T::class.java, null, x);
            jaxbMarshaller.marshal(root, sw)
            sw.toString()
        } catch (e: JAXBException) {
            throw RuntimeException(e)
        }
    }
}
