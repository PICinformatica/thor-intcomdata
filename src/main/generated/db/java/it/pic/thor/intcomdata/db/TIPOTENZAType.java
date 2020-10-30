
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_POTENZAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_POTENZAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPEGNATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISPONIBILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FRANCHIGIA">
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
@XmlType(name = "T_I_POTENZAType", propOrder = {
    "impegnata",
    "disponibile",
    "franchigia"
})
public class TIPOTENZAType {

    @XmlElement(name = "IMPEGNATA", required = true)
    protected String impegnata;
    @XmlElement(name = "DISPONIBILE", required = true)
    protected String disponibile;
    @XmlElement(name = "FRANCHIGIA", required = true)
    protected String franchigia;

    /**
     * Recupera il valore della proprietà impegnata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPEGNATA() {
        return impegnata;
    }

    /**
     * Imposta il valore della proprietà impegnata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPEGNATA(String value) {
        this.impegnata = value;
    }

    /**
     * Recupera il valore della proprietà disponibile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPONIBILE() {
        return disponibile;
    }

    /**
     * Imposta il valore della proprietà disponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPONIBILE(String value) {
        this.disponibile = value;
    }

    /**
     * Recupera il valore della proprietà franchigia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRANCHIGIA() {
        return franchigia;
    }

    /**
     * Imposta il valore della proprietà franchigia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRANCHIGIA(String value) {
        this.franchigia = value;
    }

}
