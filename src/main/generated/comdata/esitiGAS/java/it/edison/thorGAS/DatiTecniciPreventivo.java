
package it.edison.thorGAS;

import it.edison.thorGAS.Preventivo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD> <STYLE type=text/css> p{margin:0px;}</STYLE> </HEAD> <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Contiene le informazioni del preventivo e gli eventuali dati tecnici</BODY></HTML>
 * 
 * <p>Classe Java per DatiTecniciPreventivo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiTecniciPreventivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preventivo" type="{http://thor.edison.it}Preventivo" minOccurs="0"/&gt;
 *         &lt;element name="dataInvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodoValiditaMesi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="elementiNecessari" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tempiAutorizzazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modalitaAccettazionePreventivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distanzaCabina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuovaCabina" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="raddQtaDistanza" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="dataPrevistaIntervento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fattibilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroTentativi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTecniciPreventivo", propOrder = {
    "preventivo",
    "dataInvio",
    "dataRichiesta",
    "periodoValiditaMesi",
    "tipo",
    "elementiNecessari",
    "documentazione",
    "tempiAutorizzazioni",
    "modalitaAccettazionePreventivo",
    "distanzaCabina",
    "nuovaCabina",
    "raddQtaDistanza",
    "dataPrevistaIntervento",
    "fattibilita",
    "numeroTentativi"
})
public class DatiTecniciPreventivo {

    @XmlElement(namespace = "http://thor.edison.it")
    protected it.edison.thorGAS.Preventivo preventivo;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String dataInvio;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String dataRichiesta;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String periodoValiditaMesi;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String tipo;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String elementiNecessari;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String documentazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String tempiAutorizzazioni;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String modalitaAccettazionePreventivo;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String distanzaCabina;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String nuovaCabina;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String raddQtaDistanza;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String dataPrevistaIntervento;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String fattibilita;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String numeroTentativi;

    /**
     * Recupera il valore della proprietà preventivo.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorGAS.Preventivo }
     *     
     */
    public it.edison.thorGAS.Preventivo getPreventivo() {
        return preventivo;
    }

    /**
     * Imposta il valore della proprietà preventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorGAS.Preventivo }
     *     
     */
    public void setPreventivo(Preventivo value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della proprietà dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della proprietà dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvio(String value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della proprietà dataRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRichiesta() {
        return dataRichiesta;
    }

    /**
     * Imposta il valore della proprietà dataRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRichiesta(String value) {
        this.dataRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà periodoValiditaMesi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoValiditaMesi() {
        return periodoValiditaMesi;
    }

    /**
     * Imposta il valore della proprietà periodoValiditaMesi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoValiditaMesi(String value) {
        this.periodoValiditaMesi = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
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
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà elementiNecessari.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementiNecessari() {
        return elementiNecessari;
    }

    /**
     * Imposta il valore della proprietà elementiNecessari.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementiNecessari(String value) {
        this.elementiNecessari = value;
    }

    /**
     * Recupera il valore della proprietà documentazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentazione() {
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
    public void setDocumentazione(String value) {
        this.documentazione = value;
    }

    /**
     * Recupera il valore della proprietà tempiAutorizzazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempiAutorizzazioni() {
        return tempiAutorizzazioni;
    }

    /**
     * Imposta il valore della proprietà tempiAutorizzazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempiAutorizzazioni(String value) {
        this.tempiAutorizzazioni = value;
    }

    /**
     * Recupera il valore della proprietà modalitaAccettazionePreventivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalitaAccettazionePreventivo() {
        return modalitaAccettazionePreventivo;
    }

    /**
     * Imposta il valore della proprietà modalitaAccettazionePreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalitaAccettazionePreventivo(String value) {
        this.modalitaAccettazionePreventivo = value;
    }

    /**
     * Recupera il valore della proprietà distanzaCabina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanzaCabina() {
        return distanzaCabina;
    }

    /**
     * Imposta il valore della proprietà distanzaCabina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanzaCabina(String value) {
        this.distanzaCabina = value;
    }

    /**
     * Recupera il valore della proprietà nuovaCabina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuovaCabina() {
        return nuovaCabina;
    }

    /**
     * Imposta il valore della proprietà nuovaCabina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuovaCabina(String value) {
        this.nuovaCabina = value;
    }

    /**
     * Recupera il valore della proprietà raddQtaDistanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaddQtaDistanza() {
        return raddQtaDistanza;
    }

    /**
     * Imposta il valore della proprietà raddQtaDistanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaddQtaDistanza(String value) {
        this.raddQtaDistanza = value;
    }

    /**
     * Recupera il valore della proprietà dataPrevistaIntervento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrevistaIntervento() {
        return dataPrevistaIntervento;
    }

    /**
     * Imposta il valore della proprietà dataPrevistaIntervento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrevistaIntervento(String value) {
        this.dataPrevistaIntervento = value;
    }

    /**
     * Recupera il valore della proprietà fattibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFattibilita() {
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
    public void setFattibilita(String value) {
        this.fattibilita = value;
    }

    /**
     * Recupera il valore della proprietà numeroTentativi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTentativi() {
        return numeroTentativi;
    }

    /**
     * Imposta il valore della proprietà numeroTentativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTentativi(String value) {
        this.numeroTentativi = value;
    }

}
