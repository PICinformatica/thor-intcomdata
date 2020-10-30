
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_STAGIONALE_RICORRENTEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_STAGIONALE_RICORRENTEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAG_RIC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_INIZIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_FINE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_STAGIONALE_RICORRENTEType", propOrder = {
    "stagric",
    "dtinizio",
    "dtfine"
})
public class TISTAGIONALERICORRENTEType {

    @XmlElement(name = "STAG_RIC", required = true)
    protected String stagric;
    @XmlElement(name = "DT_INIZIO", required = true)
    protected String dtinizio;
    @XmlElement(name = "DT_FINE", required = true)
    protected String dtfine;

    /**
     * Recupera il valore della proprietà stagric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAGRIC() {
        return stagric;
    }

    /**
     * Imposta il valore della proprietà stagric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAGRIC(String value) {
        this.stagric = value;
    }

    /**
     * Recupera il valore della proprietà dtinizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTINIZIO() {
        return dtinizio;
    }

    /**
     * Imposta il valore della proprietà dtinizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTINIZIO(String value) {
        this.dtinizio = value;
    }

    /**
     * Recupera il valore della proprietà dtfine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTFINE() {
        return dtfine;
    }

    /**
     * Imposta il valore della proprietà dtfine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTFINE(String value) {
        this.dtfine = value;
    }

}
