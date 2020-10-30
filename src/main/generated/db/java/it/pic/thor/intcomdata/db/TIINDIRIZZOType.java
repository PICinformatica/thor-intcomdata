
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_INDIRIZZOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_INDIRIZZOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOPONIMO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CIVICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESTENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISTAT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMUNE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROVINCIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SCALA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PIANO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INTERNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FRAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALTRO">
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
@XmlType(name = "T_I_INDIRIZZOType", propOrder = {
    "toponimo",
    "via",
    "civico",
    "estensione",
    "cap",
    "istat",
    "comune",
    "provincia",
    "scala",
    "piano",
    "interno",
    "frazione",
    "presso",
    "nazione",
    "altro"
})
public class TIINDIRIZZOType {

    @XmlElement(name = "TOPONIMO", required = true)
    protected String toponimo;
    @XmlElement(name = "VIA", required = true)
    protected String via;
    @XmlElement(name = "CIVICO", required = true)
    protected String civico;
    @XmlElement(name = "ESTENSIONE", required = true)
    protected String estensione;
    @XmlElement(name = "CAP", required = true)
    protected String cap;
    @XmlElement(name = "ISTAT", required = true)
    protected String istat;
    @XmlElement(name = "COMUNE", required = true)
    protected String comune;
    @XmlElement(name = "PROVINCIA", required = true)
    protected String provincia;
    @XmlElement(name = "SCALA", required = true)
    protected String scala;
    @XmlElement(name = "PIANO", required = true)
    protected String piano;
    @XmlElement(name = "INTERNO", required = true)
    protected String interno;
    @XmlElement(name = "FRAZIONE", required = true)
    protected String frazione;
    @XmlElement(name = "PRESSO", required = true)
    protected String presso;
    @XmlElement(name = "NAZIONE", required = true)
    protected String nazione;
    @XmlElement(name = "ALTRO", required = true)
    protected String altro;

    /**
     * Recupera il valore della proprietà toponimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOPONIMO() {
        return toponimo;
    }

    /**
     * Imposta il valore della proprietà toponimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOPONIMO(String value) {
        this.toponimo = value;
    }

    /**
     * Recupera il valore della proprietà via.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIA() {
        return via;
    }

    /**
     * Imposta il valore della proprietà via.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIA(String value) {
        this.via = value;
    }

    /**
     * Recupera il valore della proprietà civico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIVICO() {
        return civico;
    }

    /**
     * Imposta il valore della proprietà civico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIVICO(String value) {
        this.civico = value;
    }

    /**
     * Recupera il valore della proprietà estensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTENSIONE() {
        return estensione;
    }

    /**
     * Imposta il valore della proprietà estensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTENSIONE(String value) {
        this.estensione = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà istat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTAT() {
        return istat;
    }

    /**
     * Imposta il valore della proprietà istat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTAT(String value) {
        this.istat = value;
    }

    /**
     * Recupera il valore della proprietà comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMUNE() {
        return comune;
    }

    /**
     * Imposta il valore della proprietà comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMUNE(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà scala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCALA() {
        return scala;
    }

    /**
     * Imposta il valore della proprietà scala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCALA(String value) {
        this.scala = value;
    }

    /**
     * Recupera il valore della proprietà piano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIANO() {
        return piano;
    }

    /**
     * Imposta il valore della proprietà piano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIANO(String value) {
        this.piano = value;
    }

    /**
     * Recupera il valore della proprietà interno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERNO() {
        return interno;
    }

    /**
     * Imposta il valore della proprietà interno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERNO(String value) {
        this.interno = value;
    }

    /**
     * Recupera il valore della proprietà frazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRAZIONE() {
        return frazione;
    }

    /**
     * Imposta il valore della proprietà frazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRAZIONE(String value) {
        this.frazione = value;
    }

    /**
     * Recupera il valore della proprietà presso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESSO() {
        return presso;
    }

    /**
     * Imposta il valore della proprietà presso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESSO(String value) {
        this.presso = value;
    }

    /**
     * Recupera il valore della proprietà nazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZIONE() {
        return nazione;
    }

    /**
     * Imposta il valore della proprietà nazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZIONE(String value) {
        this.nazione = value;
    }

    /**
     * Recupera il valore della proprietà altro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTRO() {
        return altro;
    }

    /**
     * Imposta il valore della proprietà altro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTRO(String value) {
        this.altro = value;
    }

}
