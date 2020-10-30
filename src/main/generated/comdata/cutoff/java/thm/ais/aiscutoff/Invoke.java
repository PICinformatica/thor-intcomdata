
package thm.ais.aiscutoff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.edison.thorCutOff.CutOff;


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
 *         &lt;element name="CutOff" type="{http://thor.edison.it}CutOff"/&gt;
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
    "cutOff"
})
@XmlRootElement(name = "invoke")
public class Invoke {

    @XmlElement(name = "CutOff", required = true, nillable = true)
    protected CutOff cutOff;

    /**
     * Recupera il valore della proprietà cutOff.
     * 
     * @return
     *     possible object is
     *     {@link CutOff }
     *     
     */
    public CutOff getCutOff() {
        return cutOff;
    }

    /**
     * Imposta il valore della proprietà cutOff.
     * 
     * @param value
     *     allowed object is
     *     {@link CutOff }
     *     
     */
    public void setCutOff(CutOff value) {
        this.cutOff = value;
    }

}
