
package it.edison.thorCutOff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per TSE_CUTOFF complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TSE_CUTOFF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cutOff" type="{http://thor.edison.it}CutOff" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSE_CUTOFF", propOrder = {
    "cutOff"
})
public class TSECUTOFF {

    @XmlElement(namespace = "http://thor.edison.it")
    protected List<CutOff> cutOff;

    /**
     * Gets the value of the cutOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutOff }
     * 
     * 
     */
    public List<CutOff> getCutOff() {
        if (cutOff == null) {
            cutOff = new ArrayList<CutOff>();
        }
        return this.cutOff;
    }

}
