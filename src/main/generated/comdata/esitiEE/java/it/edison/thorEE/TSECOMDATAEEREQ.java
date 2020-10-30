
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TSE_COMDATA_EE_REQ complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TSE_COMDATA_EE_REQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tracking" type="{http://thor.edison.it}Tracking" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ammissibilita" type="{http://thor.edison.it}Ammissibilita" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="esito" type="{http://thor.edison.it}Esito" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataEsecuzioneLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="preventivo" type="{http://thor.edison.it}DatiTecniciPreventivo" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="testoPredeterminabilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="codiceRintracciabilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="tipologiaIntervento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="rifQuesiti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="datiTecniciRichiesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="potenza" type="{http://thor.edison.it}Potenza" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="tensione" type="{http://thor.edison.it}Tensione" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="stagionaleRicorrente" type="{http://thor.edison.it}StagionaleRicorrente" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="misuratore" type="{http://thor.edison.it}DatiTecniciLetturaEE" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="sostituzioneMisuratore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="misuratoreRimosso" type="{http://thor.edison.it}DatiTecniciLetturaEE" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="cliente" type="{http://thor.edison.it}Cliente" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="datiCommerciali" type="{http://thor.edison.it}DatiCommerciali" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSE_COMDATA_EE_REQ", propOrder = {
    "tracking",
    "ammissibilita",
    "esito",
    "dataEsecuzioneLavoro",
    "preventivo",
    "testoPredeterminabilita",
    "codiceRintracciabilita",
    "tipologiaIntervento",
    "pod",
    "rifQuesiti",
    "datiTecniciRichiesti",
    "note",
    "potenza",
    "tensione",
    "stagionaleRicorrente",
    "misuratore",
    "sostituzioneMisuratore",
    "misuratoreRimosso",
    "cliente",
    "datiCommerciali"
})
public class TSECOMDATAEEREQ {

    @XmlElement(namespace = "")
    protected it.edison.thorEE.Tracking tracking;
    @XmlElement(namespace = "")
    protected it.edison.thorEE.Ammissibilita ammissibilita;
    @XmlElement(namespace = "")
    protected it.edison.thorEE.Esito esito;
    @XmlElement(namespace = "")
    protected String dataEsecuzioneLavoro;
    @XmlElement(namespace = "")
    protected it.edison.thorEE.DatiTecniciPreventivo preventivo;
    @XmlElement(namespace = "")
    protected String testoPredeterminabilita;
    @XmlElement(namespace = "")
    protected String codiceRintracciabilita;
    @XmlElement(namespace = "")
    protected String tipologiaIntervento;
    @XmlElement(namespace = "")
    protected String pod;
    @XmlElement(namespace = "")
    protected String rifQuesiti;
    @XmlElement(namespace = "")
    protected String datiTecniciRichiesti;
    @XmlElement(namespace = "")
    protected String note;
    @XmlElement(namespace = "")
    protected Potenza potenza;
    @XmlElement(namespace = "")
    protected Tensione tensione;
    @XmlElement(namespace = "")
    protected StagionaleRicorrente stagionaleRicorrente;
    @XmlElement(namespace = "")
    protected DatiTecniciLetturaEE misuratore;
    @XmlElement(namespace = "")
    protected String sostituzioneMisuratore;
    @XmlElement(namespace = "")
    protected DatiTecniciLetturaEE misuratoreRimosso;
    @XmlElement(namespace = "")
    protected Cliente cliente;
    @XmlElement(namespace = "")
    protected DatiCommerciali datiCommerciali;

    /**
     * Recupera il valore della proprietà tracking.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.Tracking }
     *     
     */
    public it.edison.thorEE.Tracking getTracking() {
        return tracking;
    }

    /**
     * Imposta il valore della proprietà tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.Tracking }
     *     
     */
    public void setTracking(Tracking value) {
        this.tracking = value;
    }

    /**
     * Recupera il valore della proprietà ammissibilita.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.Ammissibilita }
     *     
     */
    public it.edison.thorEE.Ammissibilita getAmmissibilita() {
        return ammissibilita;
    }

    /**
     * Imposta il valore della proprietà ammissibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.Ammissibilita }
     *     
     */
    public void setAmmissibilita(Ammissibilita value) {
        this.ammissibilita = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.Esito }
     *     
     */
    public it.edison.thorEE.Esito getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.Esito }
     *     
     */
    public void setEsito(Esito value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà dataEsecuzioneLavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEsecuzioneLavoro() {
        return dataEsecuzioneLavoro;
    }

    /**
     * Imposta il valore della proprietà dataEsecuzioneLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEsecuzioneLavoro(String value) {
        this.dataEsecuzioneLavoro = value;
    }

    /**
     * Recupera il valore della proprietà preventivo.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.DatiTecniciPreventivo }
     *     
     */
    public it.edison.thorEE.DatiTecniciPreventivo getPreventivo() {
        return preventivo;
    }

    /**
     * Imposta il valore della proprietà preventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.DatiTecniciPreventivo }
     *     
     */
    public void setPreventivo(DatiTecniciPreventivo value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della proprietà testoPredeterminabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestoPredeterminabilita() {
        return testoPredeterminabilita;
    }

    /**
     * Imposta il valore della proprietà testoPredeterminabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestoPredeterminabilita(String value) {
        this.testoPredeterminabilita = value;
    }

    /**
     * Recupera il valore della proprietà codiceRintracciabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRintracciabilita() {
        return codiceRintracciabilita;
    }

    /**
     * Imposta il valore della proprietà codiceRintracciabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRintracciabilita(String value) {
        this.codiceRintracciabilita = value;
    }

    /**
     * Recupera il valore della proprietà tipologiaIntervento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiaIntervento() {
        return tipologiaIntervento;
    }

    /**
     * Imposta il valore della proprietà tipologiaIntervento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiaIntervento(String value) {
        this.tipologiaIntervento = value;
    }

    /**
     * Recupera il valore della proprietà pod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPod() {
        return pod;
    }

    /**
     * Imposta il valore della proprietà pod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPod(String value) {
        this.pod = value;
    }

    /**
     * Recupera il valore della proprietà rifQuesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRifQuesiti() {
        return rifQuesiti;
    }

    /**
     * Imposta il valore della proprietà rifQuesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRifQuesiti(String value) {
        this.rifQuesiti = value;
    }

    /**
     * Recupera il valore della proprietà datiTecniciRichiesti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatiTecniciRichiesti() {
        return datiTecniciRichiesti;
    }

    /**
     * Imposta il valore della proprietà datiTecniciRichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatiTecniciRichiesti(String value) {
        this.datiTecniciRichiesti = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà potenza.
     * 
     * @return
     *     possible object is
     *     {@link Potenza }
     *     
     */
    public Potenza getPotenza() {
        return potenza;
    }

    /**
     * Imposta il valore della proprietà potenza.
     * 
     * @param value
     *     allowed object is
     *     {@link Potenza }
     *     
     */
    public void setPotenza(Potenza value) {
        this.potenza = value;
    }

    /**
     * Recupera il valore della proprietà tensione.
     * 
     * @return
     *     possible object is
     *     {@link Tensione }
     *     
     */
    public Tensione getTensione() {
        return tensione;
    }

    /**
     * Imposta il valore della proprietà tensione.
     * 
     * @param value
     *     allowed object is
     *     {@link Tensione }
     *     
     */
    public void setTensione(Tensione value) {
        this.tensione = value;
    }

    /**
     * Recupera il valore della proprietà stagionaleRicorrente.
     * 
     * @return
     *     possible object is
     *     {@link StagionaleRicorrente }
     *     
     */
    public StagionaleRicorrente getStagionaleRicorrente() {
        return stagionaleRicorrente;
    }

    /**
     * Imposta il valore della proprietà stagionaleRicorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link StagionaleRicorrente }
     *     
     */
    public void setStagionaleRicorrente(StagionaleRicorrente value) {
        this.stagionaleRicorrente = value;
    }

    /**
     * Recupera il valore della proprietà misuratore.
     * 
     * @return
     *     possible object is
     *     {@link DatiTecniciLetturaEE }
     *     
     */
    public DatiTecniciLetturaEE getMisuratore() {
        return misuratore;
    }

    /**
     * Imposta il valore della proprietà misuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiTecniciLetturaEE }
     *     
     */
    public void setMisuratore(DatiTecniciLetturaEE value) {
        this.misuratore = value;
    }

    /**
     * Recupera il valore della proprietà sostituzioneMisuratore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSostituzioneMisuratore() {
        return sostituzioneMisuratore;
    }

    /**
     * Imposta il valore della proprietà sostituzioneMisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSostituzioneMisuratore(String value) {
        this.sostituzioneMisuratore = value;
    }

    /**
     * Recupera il valore della proprietà misuratoreRimosso.
     * 
     * @return
     *     possible object is
     *     {@link DatiTecniciLetturaEE }
     *     
     */
    public DatiTecniciLetturaEE getMisuratoreRimosso() {
        return misuratoreRimosso;
    }

    /**
     * Imposta il valore della proprietà misuratoreRimosso.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiTecniciLetturaEE }
     *     
     */
    public void setMisuratoreRimosso(DatiTecniciLetturaEE value) {
        this.misuratoreRimosso = value;
    }

    /**
     * Recupera il valore della proprietà cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Imposta il valore della proprietà cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Recupera il valore della proprietà datiCommerciali.
     * 
     * @return
     *     possible object is
     *     {@link DatiCommerciali }
     *     
     */
    public DatiCommerciali getDatiCommerciali() {
        return datiCommerciali;
    }

    /**
     * Imposta il valore della proprietà datiCommerciali.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiCommerciali }
     *     
     */
    public void setDatiCommerciali(DatiCommerciali value) {
        this.datiCommerciali = value;
    }

}
