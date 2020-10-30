
package thorprocessi.iesiticomdataee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorEE.TSECOMDATAEERESP;


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
 *         &lt;element name="TSE_COMDATA_EE_RESP" type="{http://thor.edison.it}TSE_COMDATA_EE_RESP"/&gt;
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
    "tsecomdataeeresp"
})
@XmlRootElement(name = "esitiResponse")
public class EsitiResponse {

    @XmlElement(name = "TSE_COMDATA_EE_RESP", required = true, nillable = true)
    protected TSECOMDATAEERESP tsecomdataeeresp;

    /**
     * Recupera il valore della proprietà tsecomdataeeresp.
     * 
     * @return
     *     possible object is
     *     {@link TSECOMDATAEERESP }
     *     
     */
    public TSECOMDATAEERESP getTSECOMDATAEERESP() {
        return tsecomdataeeresp;
    }

    /**
     * Imposta il valore della proprietà tsecomdataeeresp.
     * 
     * @param value
     *     allowed object is
     *     {@link TSECOMDATAEERESP }
     *     
     */
    public void setTSECOMDATAEERESP(TSECOMDATAEERESP value) {
        this.tsecomdataeeresp = value;
    }

}
