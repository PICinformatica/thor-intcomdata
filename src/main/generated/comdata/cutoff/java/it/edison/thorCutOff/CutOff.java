
package it.edison.thorCutOff;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per CutOff complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CutOff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxRichieste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroRichieste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="azioniUtente" type="{http://thor.edison.it}Azione" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaRiga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="separatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flusso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dataDecorrenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RagioneSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Portale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="critico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOff", propOrder = {
    "id",
    "destinatario",
    "servizio",
    "utility",
    "maxRichieste",
    "numeroRichieste",
    "stato",
    "tipoDestinatario",
    "created",
    "azioniUtente",
    "primaRiga",
    "formato",
    "separatore",
    "idTemplate",
    "flusso",
    "linkFile",
    "utente",
    "flagSelected",
    "dataDecorrenza",
    "email",
    "ragioneSociale",
    "portale",
    "critico"
})
public class CutOff {

    protected String id;
    protected String destinatario;
    protected String servizio;
    protected String utility;
    protected String maxRichieste;
    protected String numeroRichieste;
    protected String stato;
    protected String tipoDestinatario;
    protected String created;
    protected List<Azione> azioniUtente;
    protected String primaRiga;
    protected String formato;
    protected String separatore;
    protected String idTemplate;
    protected String flusso;
    protected String linkFile;
    protected String utente;
    protected Boolean flagSelected;
    protected String dataDecorrenza;
    protected String email;
    @XmlElement(name = "RagioneSociale")
    protected String ragioneSociale;
    @XmlElement(name = "Portale")
    protected String portale;
    protected String critico;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getId() {
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
    public void setId(String value) {
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
    @WebMethod
    public String getDestinatario() {
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
    public void setDestinatario(String value) {
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
    @WebMethod
    public String getServizio() {
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
    public void setServizio(String value) {
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
    @WebMethod
    public String getUtility() {
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
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Recupera il valore della proprietà maxRichieste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getMaxRichieste() {
        return maxRichieste;
    }

    /**
     * Imposta il valore della proprietà maxRichieste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRichieste(String value) {
        this.maxRichieste = value;
    }

    /**
     * Recupera il valore della proprietà numeroRichieste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getNumeroRichieste() {
        return numeroRichieste;
    }

    /**
     * Imposta il valore della proprietà numeroRichieste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRichieste(String value) {
        this.numeroRichieste = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getStato() {
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
    public void setStato(String value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà tipoDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getTipoDestinatario() {
        return tipoDestinatario;
    }

    /**
     * Imposta il valore della proprietà tipoDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDestinatario(String value) {
        this.tipoDestinatario = value;
    }

    /**
     * Recupera il valore della proprietà created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getCreated() {
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
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the azioniUtente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the azioniUtente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAzioniUtente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Azione }
     * 
     * 
     */
    public List<Azione> getAzioniUtente() {
        if (azioniUtente == null) {
            azioniUtente = new ArrayList<Azione>();
        }
        return this.azioniUtente;
    }

    /**
     * Recupera il valore della proprietà primaRiga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getPrimaRiga() {
        return primaRiga;
    }

    /**
     * Imposta il valore della proprietà primaRiga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaRiga(String value) {
        this.primaRiga = value;
    }

    /**
     * Recupera il valore della proprietà formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getFormato() {
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
    public void setFormato(String value) {
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
    @WebMethod
    public String getSeparatore() {
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
    public void setSeparatore(String value) {
        this.separatore = value;
    }

    /**
     * Recupera il valore della proprietà idTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getIdTemplate() {
        return idTemplate;
    }

    /**
     * Imposta il valore della proprietà idTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTemplate(String value) {
        this.idTemplate = value;
    }

    /**
     * Recupera il valore della proprietà flusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getFlusso() {
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
    public void setFlusso(String value) {
        this.flusso = value;
    }

    /**
     * Recupera il valore della proprietà linkFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getLinkFile() {
        return linkFile;
    }

    /**
     * Imposta il valore della proprietà linkFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkFile(String value) {
        this.linkFile = value;
    }

    /**
     * Recupera il valore della proprietà utente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getUtente() {
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
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Recupera il valore della proprietà flagSelected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagSelected() {
        return flagSelected;
    }

    /**
     * Imposta il valore della proprietà flagSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagSelected(Boolean value) {
        this.flagSelected = value;
    }

    /**
     * Recupera il valore della proprietà dataDecorrenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getDataDecorrenza() {
        return dataDecorrenza;
    }

    /**
     * Imposta il valore della proprietà dataDecorrenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDecorrenza(String value) {
        this.dataDecorrenza = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getEmail() {
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
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà ragioneSociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    /**
     * Imposta il valore della proprietà ragioneSociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagioneSociale(String value) {
        this.ragioneSociale = value;
    }

    /**
     * Recupera il valore della proprietà portale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @WebMethod
    public String getPortale() {
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
    public void setPortale(String value) {
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
    @WebMethod
    public String getCritico() {
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
    public void setCritico(String value) {
        this.critico = value;
    }

}
