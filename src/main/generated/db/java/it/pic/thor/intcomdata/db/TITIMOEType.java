
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TIMOEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TIMOEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESENZA_CMOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATE_SOSPENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOSPESO_MOROSITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATE_SWITCH">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_SALVAGARDIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ULTIMA_RICH_SOSPENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ULTIMA_SOSPENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RISOLUZIONE_CONTRATTUALE">
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
@XmlType(name = "T_I_TIMOEType", propOrder = {
    "presenzacmor",
    "datesospensione",
    "sospesomorosita",
    "dateswitch",
    "datasalvagardia",
    "dataultimarichsospensione",
    "dataultimasospensione",
    "risoluzionecontrattuale"
})
public class TITIMOEType {

    @XmlElement(name = "PRESENZA_CMOR", required = true)
    protected String presenzacmor;
    @XmlElement(name = "DATE_SOSPENSIONE", required = true)
    protected String datesospensione;
    @XmlElement(name = "SOSPESO_MOROSITA", required = true)
    protected String sospesomorosita;
    @XmlElement(name = "DATE_SWITCH", required = true)
    protected String dateswitch;
    @XmlElement(name = "DATA_SALVAGARDIA", required = true)
    protected String datasalvagardia;
    @XmlElement(name = "DATA_ULTIMA_RICH_SOSPENSIONE", required = true)
    protected String dataultimarichsospensione;
    @XmlElement(name = "DATA_ULTIMA_SOSPENSIONE", required = true)
    protected String dataultimasospensione;
    @XmlElement(name = "RISOLUZIONE_CONTRATTUALE", required = true)
    protected String risoluzionecontrattuale;

    /**
     * Recupera il valore della proprietà presenzacmor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESENZACMOR() {
        return presenzacmor;
    }

    /**
     * Imposta il valore della proprietà presenzacmor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESENZACMOR(String value) {
        this.presenzacmor = value;
    }

    /**
     * Recupera il valore della proprietà datesospensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATESOSPENSIONE() {
        return datesospensione;
    }

    /**
     * Imposta il valore della proprietà datesospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATESOSPENSIONE(String value) {
        this.datesospensione = value;
    }

    /**
     * Recupera il valore della proprietà sospesomorosita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSPESOMOROSITA() {
        return sospesomorosita;
    }

    /**
     * Imposta il valore della proprietà sospesomorosita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSPESOMOROSITA(String value) {
        this.sospesomorosita = value;
    }

    /**
     * Recupera il valore della proprietà dateswitch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATESWITCH() {
        return dateswitch;
    }

    /**
     * Imposta il valore della proprietà dateswitch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATESWITCH(String value) {
        this.dateswitch = value;
    }

    /**
     * Recupera il valore della proprietà datasalvagardia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASALVAGARDIA() {
        return datasalvagardia;
    }

    /**
     * Imposta il valore della proprietà datasalvagardia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASALVAGARDIA(String value) {
        this.datasalvagardia = value;
    }

    /**
     * Recupera il valore della proprietà dataultimarichsospensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAULTIMARICHSOSPENSIONE() {
        return dataultimarichsospensione;
    }

    /**
     * Imposta il valore della proprietà dataultimarichsospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAULTIMARICHSOSPENSIONE(String value) {
        this.dataultimarichsospensione = value;
    }

    /**
     * Recupera il valore della proprietà dataultimasospensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAULTIMASOSPENSIONE() {
        return dataultimasospensione;
    }

    /**
     * Imposta il valore della proprietà dataultimasospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAULTIMASOSPENSIONE(String value) {
        this.dataultimasospensione = value;
    }

    /**
     * Recupera il valore della proprietà risoluzionecontrattuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRISOLUZIONECONTRATTUALE() {
        return risoluzionecontrattuale;
    }

    /**
     * Imposta il valore della proprietà risoluzionecontrattuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRISOLUZIONECONTRATTUALE(String value) {
        this.risoluzionecontrattuale = value;
    }

}
