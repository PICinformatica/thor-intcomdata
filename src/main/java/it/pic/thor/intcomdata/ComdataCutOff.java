package it.pic.thor.intcomdata;

import it.edison.thorCutOff.CutOff;
import it.edison.thorCutOff.TSECUTOFF;
import it.edison.thorEE.ObjectFactory;
import it.pic.thor.intcomdata.db.DbCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thm.ais.aiscutoff.AISCutOff;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://THM/AIS/AISCutOff", name = "AISCutOff")
@XmlSeeAlso({ObjectFactory.class, thm.ais.aiscutoff.ObjectFactory.class})
@Component
public class ComdataCutOff implements AISCutOff {
    @Autowired private DbCaller controller;

    @WebMethod
    @RequestWrapper(localName = "invoke", targetNamespace = "http://THM/AIS/AISCutOff", className = "thm.ais.aiscutoff.Invoke")
    @ResponseWrapper(localName = "invokeResponse", targetNamespace = "http://THM/AIS/AISCutOff", className = "thm.ais.aiscutoff.InvokeResponse")
    @WebResult(name = "Lista_CutOff")
    @Override
    public TSECUTOFF invoke(@WebParam(name = "CutOff") CutOff cutOff)
    {
        return controller.comdataCutoff(cutOff);
    }
}
