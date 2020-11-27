package it.pic.thor.intcomdata

import it.edison.thorEE.TSECOMDATAEEREQ
import it.edison.thorEE.TSECOMDATAEERESP
import it.pic.thor.intcomdata.db.EsitiController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import thorprocessi.iesiticomdataee.IEsitiComdataEE
import thorprocessi.iesiticomdataee.ObjectFactory
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService
import javax.xml.bind.annotation.XmlSeeAlso
import javax.xml.ws.RequestWrapper
import javax.xml.ws.ResponseWrapper

@WebService(targetNamespace = "http://THORProcessi/IEsitiComdataEE", name = "IEsitiComdataEE")
@XmlSeeAlso(ObjectFactory::class, it.edison.thorEE.ObjectFactory::class)
@Component
class EsitiEE : IEsitiComdataEE {
    @Autowired lateinit var controller: EsitiController

    @WebMethod
    @RequestWrapper(localName = "esiti", targetNamespace = "http://THORProcessi/IEsitiComdataEE", className = "thorprocessi.iesiticomdataee.Esiti")
    @ResponseWrapper(localName = "esitiResponse", targetNamespace = "http://THORProcessi/IEsitiComdataEE", className = "thorprocessi.iesiticomdataee.EsitiResponse")
    @WebResult(name = "TSE_COMDATA_EE_RESP")
    override fun esiti(@WebParam(name = "TSE_COMDATA_EE_REQ") input: TSECOMDATAEEREQ): TSECOMDATAEERESP {
        return controller.esitiEE(input)
    }
}
