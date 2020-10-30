
package thorprocessi.iesiticomdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorGAS.TSECOMDATAGASREQ;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tse_comdata_gas_req" type="{http://thor.edison.it}TSE_COMDATA_GAS_REQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tseComdataGasReq"
})
@XmlRootElement(name = "esiti")
public class Esiti {

    @XmlElement(name = "tse_comdata_gas_req", required = true, nillable = true)
    protected TSECOMDATAGASREQ tseComdataGasReq;

    /**
     * Recupera il valore della proprietà tseComdataGasReq.
     * 
     * @return
     *     possible object is
     *     {@link TSECOMDATAGASREQ }
     *     
     */
    public TSECOMDATAGASREQ getTseComdataGasReq() {
        return tseComdataGasReq;
    }

    /**
     * Imposta il valore della proprietà tseComdataGasReq.
     * 
     * @param value
     *     allowed object is
     *     {@link TSECOMDATAGASREQ }
     *     
     */
    public void setTseComdataGasReq(TSECOMDATAGASREQ value) {
        this.tseComdataGasReq = value;
    }

}
