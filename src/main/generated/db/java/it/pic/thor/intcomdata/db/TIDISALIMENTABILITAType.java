
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DISALIMENTABILITAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DISALIMENTABILITAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DISALIMENTABILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CATEGORIA_DISALIMENTABILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTOCERTIFICAZIONE_ASL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEFONO_PREAVVISO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTOCERTIFICAZ_LIBERATORIA">
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
@XmlType(name = "T_I_DISALIMENTABILITAType", propOrder = {
    "disalimentabile",
    "categoriadisalimentabilita",
    "autocertificazioneasl",
    "telefonopreavviso",
    "autocertificazliberatoria"
})
public class TIDISALIMENTABILITAType {

    @XmlElement(name = "DISALIMENTABILE", required = true)
    protected String disalimentabile;
    @XmlElement(name = "CATEGORIA_DISALIMENTABILITA", required = true)
    protected String categoriadisalimentabilita;
    @XmlElement(name = "AUTOCERTIFICAZIONE_ASL", required = true)
    protected String autocertificazioneasl;
    @XmlElement(name = "TELEFONO_PREAVVISO", required = true)
    protected String telefonopreavviso;
    @XmlElement(name = "AUTOCERTIFICAZ_LIBERATORIA", required = true)
    protected String autocertificazliberatoria;

    /**
     * Recupera il valore della proprietà disalimentabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALIMENTABILE() {
        return disalimentabile;
    }

    /**
     * Imposta il valore della proprietà disalimentabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALIMENTABILE(String value) {
        this.disalimentabile = value;
    }

    /**
     * Recupera il valore della proprietà categoriadisalimentabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIADISALIMENTABILITA() {
        return categoriadisalimentabilita;
    }

    /**
     * Imposta il valore della proprietà categoriadisalimentabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIADISALIMENTABILITA(String value) {
        this.categoriadisalimentabilita = value;
    }

    /**
     * Recupera il valore della proprietà autocertificazioneasl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOCERTIFICAZIONEASL() {
        return autocertificazioneasl;
    }

    /**
     * Imposta il valore della proprietà autocertificazioneasl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOCERTIFICAZIONEASL(String value) {
        this.autocertificazioneasl = value;
    }

    /**
     * Recupera il valore della proprietà telefonopreavviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOPREAVVISO() {
        return telefonopreavviso;
    }

    /**
     * Imposta il valore della proprietà telefonopreavviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOPREAVVISO(String value) {
        this.telefonopreavviso = value;
    }

    /**
     * Recupera il valore della proprietà autocertificazliberatoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOCERTIFICAZLIBERATORIA() {
        return autocertificazliberatoria;
    }

    /**
     * Imposta il valore della proprietà autocertificazliberatoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOCERTIFICAZLIBERATORIA(String value) {
        this.autocertificazliberatoria = value;
    }

}
