package it.pic.thor.intcomdata

import it.edison.thorGAS.TSECOMDATAGASREQ
import it.edison.thorGAS.TSECOMDATAGASRESP
import it.pic.thor.intcomdata.db.EsitiController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import thorprocessi.iesiticomdata.IEsitiComdata
import thorprocessi.iesiticomdata.ObjectFactory
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService
import javax.xml.bind.annotation.XmlSeeAlso
import javax.xml.ws.RequestWrapper
import javax.xml.ws.ResponseWrapper

@WebService(targetNamespace = "http://THORProcessi/IEsitiComdata", name = "IEsitiComdata")
@XmlSeeAlso(ObjectFactory::class, it.edison.thorGAS.ObjectFactory::class)
@Component
class EsitiGAS : IEsitiComdata {
    @Autowired lateinit var controller: EsitiController

    @WebMethod
    @RequestWrapper(localName = "esiti", targetNamespace = "http://THORProcessi/IEsitiComdata", className = "thorprocessi.iesiticomdata.Esiti")
    @ResponseWrapper(localName = "esitiResponse", targetNamespace = "http://THORProcessi/IEsitiComdata", className = "thorprocessi.iesiticomdata.EsitiResponse")
    @WebResult(name = "tse_comdata_gas_resp")
    override fun esiti(@WebParam(name = "tse_comdata_gas_req") input: TSECOMDATAGASREQ): TSECOMDATAGASRESP {
        return controller.esitiGas(input)
    }
}
