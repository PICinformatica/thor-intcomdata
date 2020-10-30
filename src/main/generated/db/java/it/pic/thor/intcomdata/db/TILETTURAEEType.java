
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_LETTURA_EEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_LETTURA_EEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MATRICOLA_ATTIVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATRICOLA_REATTIVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATRICOLA_POTENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATTIVA_F1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATTIVA_F2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATTIVA_F3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REATTIVA_F1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REATTIVA_F2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REATTIVA_F3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_F1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_F2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_F3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA">
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
@XmlType(name = "T_I_LETTURA_EEType", propOrder = {
    "matricolaattiva",
    "matricolareattiva",
    "matricolapotenza",
    "attivaf1",
    "attivaf2",
    "attivaf3",
    "reattivaf1",
    "reattivaf2",
    "reattivaf3",
    "potenzaf1",
    "potenzaf2",
    "potenzaf3",
    "data",
    "tipologia"
})
public class TILETTURAEEType {

    @XmlElement(name = "MATRICOLA_ATTIVA", required = true)
    protected String matricolaattiva;
    @XmlElement(name = "MATRICOLA_REATTIVA", required = true)
    protected String matricolareattiva;
    @XmlElement(name = "MATRICOLA_POTENZA", required = true)
    protected String matricolapotenza;
    @XmlElement(name = "ATTIVA_F1", required = true)
    protected String attivaf1;
    @XmlElement(name = "ATTIVA_F2", required = true)
    protected String attivaf2;
    @XmlElement(name = "ATTIVA_F3", required = true)
    protected String attivaf3;
    @XmlElement(name = "REATTIVA_F1", required = true)
    protected String reattivaf1;
    @XmlElement(name = "REATTIVA_F2", required = true)
    protected String reattivaf2;
    @XmlElement(name = "REATTIVA_F3", required = true)
    protected String reattivaf3;
    @XmlElement(name = "POTENZA_F1", required = true)
    protected String potenzaf1;
    @XmlElement(name = "POTENZA_F2", required = true)
    protected String potenzaf2;
    @XmlElement(name = "POTENZA_F3", required = true)
    protected String potenzaf3;
    @XmlElement(name = "DATA", required = true)
    protected String data;
    @XmlElement(name = "TIPOLOGIA", required = true)
    protected String tipologia;

    /**
     * Recupera il valore della proprietà matricolaattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATRICOLAATTIVA() {
        return matricolaattiva;
    }

    /**
     * Imposta il valore della proprietà matricolaattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATRICOLAATTIVA(String value) {
        this.matricolaattiva = value;
    }

    /**
     * Recupera il valore della proprietà matricolareattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATRICOLAREATTIVA() {
        return matricolareattiva;
    }

    /**
     * Imposta il valore della proprietà matricolareattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATRICOLAREATTIVA(String value) {
        this.matricolareattiva = value;
    }

    /**
     * Recupera il valore della proprietà matricolapotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATRICOLAPOTENZA() {
        return matricolapotenza;
    }

    /**
     * Imposta il valore della proprietà matricolapotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATRICOLAPOTENZA(String value) {
        this.matricolapotenza = value;
    }

    /**
     * Recupera il valore della proprietà attivaf1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTIVAF1() {
        return attivaf1;
    }

    /**
     * Imposta il valore della proprietà attivaf1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTIVAF1(String value) {
        this.attivaf1 = value;
    }

    /**
     * Recupera il valore della proprietà attivaf2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTIVAF2() {
        return attivaf2;
    }

    /**
     * Imposta il valore della proprietà attivaf2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTIVAF2(String value) {
        this.attivaf2 = value;
    }

    /**
     * Recupera il valore della proprietà attivaf3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTIVAF3() {
        return attivaf3;
    }

    /**
     * Imposta il valore della proprietà attivaf3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTIVAF3(String value) {
        this.attivaf3 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaf1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREATTIVAF1() {
        return reattivaf1;
    }

    /**
     * Imposta il valore della proprietà reattivaf1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREATTIVAF1(String value) {
        this.reattivaf1 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaf2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREATTIVAF2() {
        return reattivaf2;
    }

    /**
     * Imposta il valore della proprietà reattivaf2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREATTIVAF2(String value) {
        this.reattivaf2 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaf3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREATTIVAF3() {
        return reattivaf3;
    }

    /**
     * Imposta il valore della proprietà reattivaf3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREATTIVAF3(String value) {
        this.reattivaf3 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaf1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZAF1() {
        return potenzaf1;
    }

    /**
     * Imposta il valore della proprietà potenzaf1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZAF1(String value) {
        this.potenzaf1 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaf2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZAF2() {
        return potenzaf2;
    }

    /**
     * Imposta il valore della proprietà potenzaf2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZAF2(String value) {
        this.potenzaf2 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaf3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZAF3() {
        return potenzaf3;
    }

    /**
     * Imposta il valore della proprietà potenzaf3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZAF3(String value) {
        this.potenzaf3 = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATA() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATA(String value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIA() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIA(String value) {
        this.tipologia = value;
    }

}
