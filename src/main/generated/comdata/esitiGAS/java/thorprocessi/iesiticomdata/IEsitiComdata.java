package thorprocessi.iesiticomdata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://THORProcessi/IEsitiComdata", name = "IEsitiComdata")
@XmlSeeAlso({ObjectFactory.class, it.edison.thorGAS.ObjectFactory.class})
public interface IEsitiComdata {

    @WebMethod
    @RequestWrapper(localName = "esiti", targetNamespace = "http://THORProcessi/IEsitiComdata", className = "thorprocessi.iesiticomdata.Esiti")
    @ResponseWrapper(localName = "esitiResponse", targetNamespace = "http://THORProcessi/IEsitiComdata", className = "thorprocessi.iesiticomdata.EsitiResponse")
    @WebResult(name = "tse_comdata_gas_resp", targetNamespace = "")
    public it.edison.thorGAS.TSECOMDATAGASRESP esiti(

        @WebParam(name = "tse_comdata_gas_req", targetNamespace = "")
        it.edison.thorGAS.TSECOMDATAGASREQ tseComdataGasReq
    );
}