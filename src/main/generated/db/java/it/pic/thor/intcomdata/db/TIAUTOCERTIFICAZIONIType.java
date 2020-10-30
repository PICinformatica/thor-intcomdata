
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_AUTOCERTIFICAZIONIType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_AUTOCERTIFICAZIONIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATTO_CONNESSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISTANZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOLLEVAMENTO_PERSONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STIPULA_CONTRATTO_FORNITURA">
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
@XmlType(name = "T_I_AUTOCERTIFICAZIONIType", propOrder = {
    "contrattoconnessione",
    "istanza",
    "sollevamentopersone",
    "stipulacontrattofornitura"
})
public class TIAUTOCERTIFICAZIONIType {

    @XmlElement(name = "CONTRATTO_CONNESSIONE", required = true)
    protected String contrattoconnessione;
    @XmlElement(name = "ISTANZA", required = true)
    protected String istanza;
    @XmlElement(name = "SOLLEVAMENTO_PERSONE", required = true)
    protected String sollevamentopersone;
    @XmlElement(name = "STIPULA_CONTRATTO_FORNITURA", required = true)
    protected String stipulacontrattofornitura;

    /**
     * Recupera il valore della proprietà contrattoconnessione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRATTOCONNESSIONE() {
        return contrattoconnessione;
    }

    /**
     * Imposta il valore della proprietà contrattoconnessione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRATTOCONNESSIONE(String value) {
        this.contrattoconnessione = value;
    }

    /**
     * Recupera il valore della proprietà istanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTANZA() {
        return istanza;
    }

    /**
     * Imposta il valore della proprietà istanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTANZA(String value) {
        this.istanza = value;
    }

    /**
     * Recupera il valore della proprietà sollevamentopersone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLLEVAMENTOPERSONE() {
        return sollevamentopersone;
    }

    /**
     * Imposta il valore della proprietà sollevamentopersone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLLEVAMENTOPERSONE(String value) {
        this.sollevamentopersone = value;
    }

    /**
     * Recupera il valore della proprietà stipulacontrattofornitura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTIPULACONTRATTOFORNITURA() {
        return stipulacontrattofornitura;
    }

    /**
     * Imposta il valore della proprietà stipulacontrattofornitura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTIPULACONTRATTOFORNITURA(String value) {
        this.stipulacontrattofornitura = value;
    }

}
