
package thorprocessi.iesiticomdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorGAS.TSECOMDATAGASRESP;


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
 *         &lt;element name="tse_comdata_gas_resp" type="{http://thor.edison.it}TSE_COMDATA_GAS_RESP"/&gt;
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
    "tseComdataGasResp"
})
@XmlRootElement(name = "esitiResponse")
public class EsitiResponse {

    @XmlElement(name = "tse_comdata_gas_resp", required = true, nillable = true)
    protected TSECOMDATAGASRESP tseComdataGasResp;

    /**
     * Recupera il valore della proprietà tseComdataGasResp.
     * 
     * @return
     *     possible object is
     *     {@link TSECOMDATAGASRESP }
     *     
     */
    public TSECOMDATAGASRESP getTseComdataGasResp() {
        return tseComdataGasResp;
    }

    /**
     * Imposta il valore della proprietà tseComdataGasResp.
     * 
     * @param value
     *     allowed object is
     *     {@link TSECOMDATAGASRESP }
     *     
     */
    public void setTseComdataGasResp(TSECOMDATAGASRESP value) {
        this.tseComdataGasResp = value;
    }

}
