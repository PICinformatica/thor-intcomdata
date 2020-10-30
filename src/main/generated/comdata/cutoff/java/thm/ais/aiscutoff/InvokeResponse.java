
package thm.ais.aiscutoff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorCutOff.TSECUTOFF;


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
 *         &lt;element name="Lista_CutOff" type="{http://thor.edison.it}TSE_CUTOFF"/&gt;
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
    "listaCutOff"
})
@XmlRootElement(name = "invokeResponse")
public class InvokeResponse {

    @XmlElement(name = "Lista_CutOff", required = true, nillable = true)
    protected TSECUTOFF listaCutOff;

    /**
     * Recupera il valore della proprietà listaCutOff.
     * 
     * @return
     *     possible object is
     *     {@link TSECUTOFF }
     *     
     */
    public TSECUTOFF getListaCutOff() {
        return listaCutOff;
    }

    /**
     * Imposta il valore della proprietà listaCutOff.
     * 
     * @param value
     *     allowed object is
     *     {@link TSECUTOFF }
     *     
     */
    public void setListaCutOff(TSECUTOFF value) {
        this.listaCutOff = value;
    }

}
