
package thorprocessi.iesiticomdataee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorEE.TSECOMDATAEEREQ;


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
 *         &lt;element name="TSE_COMDATA_EE_REQ" type="{http://thor.edison.it}TSE_COMDATA_EE_REQ"/&gt;
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
    "tsecomdataeereq"
})
@XmlRootElement(name = "esiti")
public class Esiti {

    @XmlElement(name = "TSE_COMDATA_EE_REQ", required = true, nillable = true)
    protected TSECOMDATAEEREQ tsecomdataeereq;

    /**
     * Recupera il valore della proprietà tsecomdataeereq.
     * 
     * @return
     *     possible object is
     *     {@link TSECOMDATAEEREQ }
     *     
     */
    public TSECOMDATAEEREQ getTSECOMDATAEEREQ() {
        return tsecomdataeereq;
    }

    /**
     * Imposta il valore della proprietà tsecomdataeereq.
     * 
     * @param value
     *     allowed object is
     *     {@link TSECOMDATAEEREQ }
     *     
     */
    public void setTSECOMDATAEEREQ(TSECOMDATAEEREQ value) {
        this.tsecomdataeereq = value;
    }

}
