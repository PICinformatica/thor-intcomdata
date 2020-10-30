
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TENSIONEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TENSIONEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALIMENTAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FASE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MONO_TRIFASE">
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
@XmlType(name = "T_I_TENSIONEType", propOrder = {
    "alimentazione",
    "fase",
    "monotrifase"
})
public class TITENSIONEType {

    @XmlElement(name = "ALIMENTAZIONE", required = true)
    protected String alimentazione;
    @XmlElement(name = "FASE", required = true)
    protected String fase;
    @XmlElement(name = "MONO_TRIFASE", required = true)
    protected String monotrifase;

    /**
     * Recupera il valore della proprietà alimentazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIMENTAZIONE() {
        return alimentazione;
    }

    /**
     * Imposta il valore della proprietà alimentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIMENTAZIONE(String value) {
        this.alimentazione = value;
    }

    /**
     * Recupera il valore della proprietà fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASE() {
        return fase;
    }

    /**
     * Imposta il valore della proprietà fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASE(String value) {
        this.fase = value;
    }

    /**
     * Recupera il valore della proprietà monotrifase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONOTRIFASE() {
        return monotrifase;
    }

    /**
     * Imposta il valore della proprietà monotrifase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONOTRIFASE(String value) {
        this.monotrifase = value;
    }

}
