
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per T_I_CUTOFFType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_CUTOFFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESTINATARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTILITY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAX_RICHIESTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_RICHIESTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_DESTINATARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATED">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AZIONI_UTENTE" type="{}T_I_AZIONE_UTENTEType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PRIMA_RIGA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORMATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SEPARATORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID_TEMPLATE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LINK_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_SELECTED">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_DECORRENZA">
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
 *         &lt;element name="RAGIONE_SOCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PORTALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CRITICO">
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
@XmlType(name = "T_I_CUTOFFType", propOrder = {
    "id",
    "destinatario",
    "servizio",
    "utility",
    "maxrichieste",
    "numerorichieste",
    "stato",
    "tipodestinatario",
    "created",
    "azioniutente",
    "primariga",
    "formato",
    "separatore",
    "idtemplate",
    "flusso",
    "linkfile",
    "utente",
    "flagselected",
    "datadecorrenza",
    "email",
    "ragionesociale",
    "portale",
    "critico"
})
public class TICUTOFFType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "DESTINATARIO", required = true)
    protected String destinatario;
    @XmlElement(name = "SERVIZIO", required = true)
    protected String servizio;
    @XmlElement(name = "UTILITY", required = true)
    protected String utility;
    @XmlElement(name = "MAX_RICHIESTE", required = true)
    protected String maxrichieste;
    @XmlElement(name = "NUMERO_RICHIESTE", required = true)
    protected String numerorichieste;
    @XmlElement(name = "STATO", required = true)
    protected String stato;
    @XmlElement(name = "TIPO_DESTINATARIO", required = true)
    protected String tipodestinatario;
    @XmlElement(name = "CREATED", required = true)
    protected String created;
    @XmlElementWrapper(name = "AZIONI_UTENTE")
    @XmlElement(name = "T_I_AZIONE_UTENTE")
    protected List<TIAZIONEUTENTEType> azioniutente;
    @XmlElement(name = "PRIMA_RIGA", required = true)
    protected String primariga;
    @XmlElement(name = "FORMATO", required = true)
    protected String formato;
    @XmlElement(name = "SEPARATORE", required = true)
    protected String separatore;
    @XmlElement(name = "ID_TEMPLATE", required = true)
    protected String idtemplate;
    @XmlElement(name = "FLUSSO", required = true)
    protected String flusso;
    @XmlElement(name = "LINK_FILE", required = true)
    protected String linkfile;
    @XmlElement(name = "UTENTE", required = true)
    protected String utente;
    @XmlElement(name = "FLAG_SELECTED", required = true)
    protected String flagselected;
    @XmlElement(name = "DATA_DECORRENZA", required = true)
    protected String datadecorrenza;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;
    @XmlElement(name = "RAGIONE_SOCIALE", required = true)
    protected String ragionesociale;
    @XmlElement(name = "PORTALE", required = true)
    protected String portale;
    @XmlElement(name = "CRITICO", required = true)
    protected String critico;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATARIO() {
        return destinatario;
    }

    /**
     * Imposta il valore della proprietà destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATARIO(String value) {
        this.destinatario = value;
    }

    /**
     * Recupera il valore della proprietà servizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVIZIO() {
        return servizio;
    }

    /**
     * Imposta il valore della proprietà servizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVIZIO(String value) {
        this.servizio = value;
    }

    /**
     * Recupera il valore della proprietà utility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTILITY() {
        return utility;
    }

    /**
     * Imposta il valore della proprietà utility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTILITY(String value) {
        this.utility = value;
    }

    /**
     * Recupera il valore della proprietà maxrichieste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXRICHIESTE() {
        return maxrichieste;
    }

    /**
     * Imposta il valore della proprietà maxrichieste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXRICHIESTE(String value) {
        this.maxrichieste = value;
    }

    /**
     * Recupera il valore della proprietà numerorichieste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERORICHIESTE() {
        return numerorichieste;
    }

    /**
     * Imposta il valore della proprietà numerorichieste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERORICHIESTE(String value) {
        this.numerorichieste = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATO() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATO(String value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà tipodestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODESTINATARIO() {
        return tipodestinatario;
    }

    /**
     * Imposta il valore della proprietà tipodestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODESTINATARIO(String value) {
        this.tipodestinatario = value;
    }

    /**
     * Recupera il valore della proprietà created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATED() {
        return created;
    }

    /**
     * Imposta il valore della proprietà created.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATED(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the azioniutente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the azioniutente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAZIONIUTENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIAZIONEUTENTEType }
     * 
     * 
     */
    public List<TIAZIONEUTENTEType> getAZIONIUTENTE() {
        if (azioniutente == null) {
            azioniutente = new ArrayList<TIAZIONEUTENTEType>();
        }
        return this.azioniutente;
    }

    /**
     * Recupera il valore della proprietà primariga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARIGA() {
        return primariga;
    }

    /**
     * Imposta il valore della proprietà primariga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARIGA(String value) {
        this.primariga = value;
    }

    /**
     * Recupera il valore della proprietà formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATO() {
        return formato;
    }

    /**
     * Imposta il valore della proprietà formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATO(String value) {
        this.formato = value;
    }

    /**
     * Recupera il valore della proprietà separatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEPARATORE() {
        return separatore;
    }

    /**
     * Imposta il valore della proprietà separatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEPARATORE(String value) {
        this.separatore = value;
    }

    /**
     * Recupera il valore della proprietà idtemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTEMPLATE() {
        return idtemplate;
    }

    /**
     * Imposta il valore della proprietà idtemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTEMPLATE(String value) {
        this.idtemplate = value;
    }

    /**
     * Recupera il valore della proprietà flusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLUSSO() {
        return flusso;
    }

    /**
     * Imposta il valore della proprietà flusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLUSSO(String value) {
        this.flusso = value;
    }

    /**
     * Recupera il valore della proprietà linkfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKFILE() {
        return linkfile;
    }

    /**
     * Imposta il valore della proprietà linkfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKFILE(String value) {
        this.linkfile = value;
    }

    /**
     * Recupera il valore della proprietà utente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTE() {
        return utente;
    }

    /**
     * Imposta il valore della proprietà utente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTENTE(String value) {
        this.utente = value;
    }

    /**
     * Recupera il valore della proprietà flagselected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGSELECTED() {
        return flagselected;
    }

    /**
     * Imposta il valore della proprietà flagselected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGSELECTED(String value) {
        this.flagselected = value;
    }

    /**
     * Recupera il valore della proprietà datadecorrenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADECORRENZA() {
        return datadecorrenza;
    }

    /**
     * Imposta il valore della proprietà datadecorrenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADECORRENZA(String value) {
        this.datadecorrenza = value;
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
     * Recupera il valore della proprietà portale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTALE() {
        return portale;
    }

    /**
     * Imposta il valore della proprietà portale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTALE(String value) {
        this.portale = value;
    }

    /**
     * Recupera il valore della proprietà critico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITICO() {
        return critico;
    }

    /**
     * Imposta il valore della proprietà critico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITICO(String value) {
        this.critico = value;
    }

}
