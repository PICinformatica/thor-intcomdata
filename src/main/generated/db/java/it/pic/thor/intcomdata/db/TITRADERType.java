
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TRADERType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TRADERType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PT_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RAGIONE_SOCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMAIL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
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
@XmlType(name = "T_I_TRADERType", propOrder = {
    "ptiva",
    "ragionesociale",
    "email"
})
public class TITRADERType {

    @XmlElement(name = "PT_IVA", required = true)
    protected String ptiva;
    @XmlElement(name = "RAGIONE_SOCIALE", required = true)
    protected String ragionesociale;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;

    /**
     * Recupera il valore della proprietà ptiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIVA() {
        return ptiva;
    }

    /**
     * Imposta il valore della proprietà ptiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIVA(String value) {
        this.ptiva = value;
    }

    /**
     * Recupera il valore della proprietà ragionesociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAGIONESOCIALE() {
        return ragionesociale;
    }

    /**
     * Imposta il valore della proprietà ragionesociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAGIONESOCIALE(String value) {
        this.ragionesociale = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

}
