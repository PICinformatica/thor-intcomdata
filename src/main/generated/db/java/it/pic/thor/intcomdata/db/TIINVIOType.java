
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_INVIOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_INVIOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOTIVAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_INVIO">
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
@XmlType(name = "T_I_INVIOType", propOrder = {
    "idinvio",
    "esito",
    "causale",
    "motivazione",
    "dtinvio"
})
public class TIINVIOType {

    @XmlElement(name = "ID_INVIO", required = true)
    protected String idinvio;
    @XmlElement(name = "ESITO", required = true)
    protected String esito;
    @XmlElement(name = "CAUSALE", required = true)
    protected String causale;
    @XmlElement(name = "MOTIVAZIONE", required = true)
    protected String motivazione;
    @XmlElement(name = "DT_INVIO", required = true)
    protected String dtinvio;

    /**
     * Recupera il valore della proprietà idinvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDINVIO() {
        return idinvio;
    }

    /**
     * Imposta il valore della proprietà idinvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDINVIO(String value) {
        this.idinvio = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESITO() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESITO(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà causale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSALE() {
        return causale;
    }

    /**
     * Imposta il valore della proprietà causale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSALE(String value) {
        this.causale = value;
    }

    /**
     * Recupera il valore della proprietà motivazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVAZIONE() {
        return motivazione;
    }

    /**
     * Imposta il valore della proprietà motivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVAZIONE(String value) {
        this.motivazione = value;
    }

    /**
     * Recupera il valore della proprietà dtinvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTINVIO() {
        return dtinvio;
    }

    /**
     * Imposta il valore della proprietà dtinvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTINVIO(String value) {
        this.dtinvio = value;
    }

}
