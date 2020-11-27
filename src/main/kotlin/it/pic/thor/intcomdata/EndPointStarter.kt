package it.pic.thor.intcomdata

import it.pic.thor.intcomdata.wsutils.CXFMessageLogger
import it.pic.thor.intcomdata.wsutils.WSUtils
import org.apache.cxf.Bus
import org.apache.cxf.jaxws.EndpointImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class EndPointStarter(
        private val bus: Bus,
        private val cutOff: ComdataCutOff,
        private val esitiGAS: EsitiGAS,
        private val esitiEE: EsitiEE
) {

    @Bean
    fun endpointEsitiEE(messageLogger: CXFMessageLogger): EndpointImpl {
        val endpoint = EndpointImpl(bus, esitiEE)
        endpoint.publish("/esiti_ee")
        WSUtils.addLogging(endpoint, messageLogger)
        return endpoint
    }

    @Bean
    fun endpointEsitiGas(messageLogger: CXFMessageLogger): EndpointImpl {
        val endpoint = EndpointImpl(bus, esitiGAS)
        endpoint.publish("/esiti_gas")
        WSUtils.addLogging(endpoint, messageLogger)
        return endpoint
    }

    @Bean
    fun endpointCutoff(messageLogger: CXFMessageLogger): EndpointImpl {
        val endpoint = EndpointImpl(bus, cutOff)
        endpoint.publish("/cutoff")
        WSUtils.addLogging(endpoint, messageLogger)
        return endpoint
    }
}
