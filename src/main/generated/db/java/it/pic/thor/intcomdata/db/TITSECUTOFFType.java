
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per T_I_TSE_CUTOFFType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_CUTOFFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LISTA_CUTOFF" type="{}T_I_CUTOFFType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_TSE_CUTOFFType", propOrder = {
    "listacutoff"
})
public class TITSECUTOFFType {

    @XmlElementWrapper(name = "LISTA_CUTOFF")
    @XmlElement(name = "T_I_CUTOFF")
    protected List<TICUTOFFType> listacutoff;

    /**
     * Gets the value of the listacutoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listacutoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTACUTOFF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TICUTOFFType }
     * 
     * 
     */
    public List<TICUTOFFType> getLISTACUTOFF() {
        if (listacutoff == null) {
            listacutoff = new ArrayList<TICUTOFFType>();
        }
        return this.listacutoff;
    }

}
