
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DATI_TECNICI_PREVENTIVOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DATI_TECNICI_PREVENTIVOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREVENTIVO" type="{}T_I_PREVENTIVOType"/>
 *         &lt;element name="DATA_INVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERIODO_VALIDITA_MESI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ELEMENTI_NECESSARI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENTAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEMPI_AUTORIZZAZIONI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOD_ACCETT_PREVENTIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTANZA_CABINA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUOVA_CABINA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RADD_QTA_DISTANZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_PREV_INTERVENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FATTIBILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_TENTATIVI">
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
@XmlType(name = "T_I_DATI_TECNICI_PREVENTIVOType", propOrder = {
    "preventivo",
    "datainvio",
    "datarichiesta",
    "periodovaliditamesi",
    "tipo",
    "elementinecessari",
    "documentazione",
    "tempiautorizzazioni",
    "modaccettpreventivo",
    "distanzacabina",
    "nuovacabina",
    "raddqtadistanza",
    "dataprevintervento",
    "fattibilita",
    "numerotentativi"
})
public class TIDATITECNICIPREVENTIVOType {

    @XmlElement(name = "PREVENTIVO", required = true)
    protected TIPREVENTIVOType preventivo;
    @XmlElement(name = "DATA_INVIO", required = true)
    protected String datainvio;
    @XmlElement(name = "DATA_RICHIESTA", required = true)
    protected String datarichiesta;
    @XmlElement(name = "PERIODO_VALIDITA_MESI", required = true)
    protected String periodovaliditamesi;
    @XmlElement(name = "TIPO", required = true)
    protected String tipo;
    @XmlElement(name = "ELEMENTI_NECESSARI", required = true)
    protected String elementinecessari;
    @XmlElement(name = "DOCUMENTAZIONE", required = true)
    protected String documentazione;
    @XmlElement(name = "TEMPI_AUTORIZZAZIONI", required = true)
    protected String tempiautorizzazioni;
    @XmlElement(name = "MOD_ACCETT_PREVENTIVO", required = true)
    protected String modaccettpreventivo;
    @XmlElement(name = "DISTANZA_CABINA", required = true)
    protected String distanzacabina;
    @XmlElement(name = "NUOVA_CABINA", required = true)
    protected String nuovacabina;
    @XmlElement(name = "RADD_QTA_DISTANZA", required = true)
    protected String raddqtadistanza;
    @XmlElement(name = "DATA_PREV_INTERVENTO", required = true)
    protected String dataprevintervento;
    @XmlElement(name = "FATTIBILITA", required = true)
    protected String fattibilita;
    @XmlElement(name = "NUMERO_TENTATIVI", required = true)
    protected String numerotentativi;

    /**
     * Recupera il valore della proprietà preventivo.
     * 
     * @return
     *     possible object is
     *     {@link TIPREVENTIVOType }
     *     
     */
    public TIPREVENTIVOType getPREVENTIVO() {
        return preventivo;
    }

    /**
     * Imposta il valore della proprietà preventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPREVENTIVOType }
     *     
     */
    public void setPREVENTIVO(TIPREVENTIVOType value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della proprietà datainvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINVIO() {
        return datainvio;
    }

    /**
     * Imposta il valore della proprietà datainvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINVIO(String value) {
        this.datainvio = value;
    }

    /**
     * Recupera il valore della proprietà datarichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARICHIESTA() {
        return datarichiesta;
    }

    /**
     * Imposta il valore della proprietà datarichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARICHIESTA(String value) {
        this.datarichiesta = value;
    }

    /**
     * Recupera il valore della proprietà periodovaliditamesi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODOVALIDITAMESI() {
        return periodovaliditamesi;
    }

    /**
     * Imposta il valore della proprietà periodovaliditamesi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODOVALIDITAMESI(String value) {
        this.periodovaliditamesi = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà elementinecessari.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTINECESSARI() {
        return elementinecessari;
    }

    /**
     * Imposta il valore della proprietà elementinecessari.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTINECESSARI(String value) {
        this.elementinecessari = value;
    }

    /**
     * Recupera il valore della proprietà documentazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTAZIONE() {
        return documentazione;
    }

    /**
     * Imposta il valore della proprietà documentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTAZIONE(String value) {
        this.documentazione = value;
    }

    /**
     * Recupera il valore della proprietà tempiautorizzazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPIAUTORIZZAZIONI() {
        return tempiautorizzazioni;
    }

    /**
     * Imposta il valore della proprietà tempiautorizzazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPIAUTORIZZAZIONI(String value) {
        this.tempiautorizzazioni = value;
    }

    /**
     * Recupera il valore della proprietà modaccettpreventivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODACCETTPREVENTIVO() {
        return modaccettpreventivo;
    }

    /**
     * Imposta il valore della proprietà modaccettpreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODACCETTPREVENTIVO(String value) {
        this.modaccettpreventivo = value;
    }

    /**
     * Recupera il valore della proprietà distanzacabina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTANZACABINA() {
        return distanzacabina;
    }

    /**
     * Imposta il valore della proprietà distanzacabina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTANZACABINA(String value) {
        this.distanzacabina = value;
    }

    /**
     * Recupera il valore della proprietà nuovacabina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUOVACABINA() {
        return nuovacabina;
    }

    /**
     * Imposta il valore della proprietà nuovacabina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUOVACABINA(String value) {
        this.nuovacabina = value;
    }

    /**
     * Recupera il valore della proprietà raddqtadistanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADDQTADISTANZA() {
        return raddqtadistanza;
    }

    /**
     * Imposta il valore della proprietà raddqtadistanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADDQTADISTANZA(String value) {
        this.raddqtadistanza = value;
    }

    /**
     * Recupera il valore della proprietà dataprevintervento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAPREVINTERVENTO() {
        return dataprevintervento;
    }

    /**
     * Imposta il valore della proprietà dataprevintervento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAPREVINTERVENTO(String value) {
        this.dataprevintervento = value;
    }

    /**
     * Recupera il valore della proprietà fattibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFATTIBILITA() {
        return fattibilita;
    }

    /**
     * Imposta il valore della proprietà fattibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFATTIBILITA(String value) {
        this.fattibilita = value;
    }

    /**
     * Recupera il valore della proprietà numerotentativi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTENTATIVI() {
        return numerotentativi;
    }

    /**
     * Imposta il valore della proprietà numerotentativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTENTATIVI(String value) {
        this.numerotentativi = value;
    }

}
