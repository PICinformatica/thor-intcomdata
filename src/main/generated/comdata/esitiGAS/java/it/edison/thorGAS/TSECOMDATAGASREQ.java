
package it.edison.thorGAS;

import it.edison.thorGAS.Ammissibilita;
import it.edison.thorGAS.DatiTecniciPreventivo;
import it.edison.thorGAS.Esito;
import it.edison.thorGAS.Tracking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TSE_COMDATA_GAS_REQ complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TSE_COMDATA_GAS_REQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tracking" type="{http://thor.edison.it}Tracking" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ammissibilita" type="{http://thor.edison.it}Ammissibilita" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="esito" type="{http://thor.edison.it}Esito" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="misuratore" type="{http://thor.edison.it}Misuratore" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="convertitore" type="{http://thor.edison.it}Misuratore" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pdrInterrotti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pdrRipristinati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pdrCodice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="preventivo" type="{http://thor.edison.it}DatiTecniciPreventivo" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="documentazione" type="{http://thor.edison.it}Documentazione" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataEsecuzioneLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pdrCodiceRemi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="pdrStato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="indirizzoFornitura" type="{http://thor.edison.it}Indirizzo" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="nuovoMisuratore" type="{http://thor.edison.it}Misuratore" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="nuovoConvertitore" type="{http://thor.edison.it}Misuratore" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="datiTecniciRichiesti" type="{http://thor.edison.it}DatiTecnici" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="riferimentoPreventivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="attiAutorizzativi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="fattibilitaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="numeroTentativi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="datiVerifica" type="{http://thor.edison.it}Verifica" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="annullamento" type="{http://thor.edison.it}Annullamento" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataMaxConf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="riferimentoRispQuesiti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="installazioneMisuratore" type="{http://thor.edison.it}BooleanType" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="installazioneContatore" type="{http://thor.edison.it}BooleanType" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSE_COMDATA_GAS_REQ", propOrder = {
    "tracking",
    "ammissibilita",
    "esito",
    "misuratore",
    "convertitore",
    "pdrInterrotti",
    "pdrRipristinati",
    "pdrCodice",
    "note",
    "preventivo",
    "documentazione",
    "dataEsecuzioneLavoro",
    "pdrCodiceRemi",
    "pdrStato",
    "indirizzoFornitura",
    "nuovoMisuratore",
    "nuovoConvertitore",
    "datiTecniciRichiesti",
    "riferimentoPreventivo",
    "attiAutorizzativi",
    "fattibilitaTecnica",
    "numeroTentativi",
    "datiVerifica",
    "annullamento",
    "dataMaxConf",
    "riferimentoRispQuesiti",
    "installazioneMisuratore",
    "installazioneContatore"
})
public class TSECOMDATAGASREQ {

    protected it.edison.thorGAS.Tracking tracking;
    protected it.edison.thorGAS.Ammissibilita ammissibilita;
    protected it.edison.thorGAS.Esito esito;
    protected Misuratore misuratore;
    protected Misuratore convertitore;
    protected String pdrInterrotti;
    protected String pdrRipristinati;
    protected String pdrCodice;
    protected String note;
    protected it.edison.thorGAS.DatiTecniciPreventivo preventivo;
    protected Documentazione documentazione;
    protected String dataEsecuzioneLavoro;
    protected String pdrCodiceRemi;
    protected String pdrStato;
    protected Indirizzo indirizzoFornitura;
    protected Misuratore nuovoMisuratore;
    protected Misuratore nuovoConvertitore;
    protected DatiTecnici datiTecniciRichiesti;
    protected String riferimentoPreventivo;
    protected String attiAutorizzativi;
    protected String fattibilitaTecnica;
    protected String numeroTentativi;
    protected Verifica datiVerifica;
    protected Annullamento annullamento;
    protected String dataMaxConf;
    protected String riferimentoRispQuesiti;
    protected String installazioneMisuratore;
    protected String installazioneContatore;

    /**
     * Recupera il valore della propriet?? tracking.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorGAS.Tracking }
     *     
     */
    public it.edison.thorGAS.Tracking getTracking() {
        return tracking;
    }

    /**
     * Imposta il valore della propriet?? tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorGAS.Tracking }
     *     
     */
    public void setTracking(Tracking value) {
        this.tracking = value;
    }

    /**
     * Recupera il valore della propriet?? ammissibilita.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorGAS.Ammissibilita }
     *     
     */
    public it.edison.thorGAS.Ammissibilita getAmmissibilita() {
        return ammissibilita;
    }

    /**
     * Imposta il valore della propriet?? ammissibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorGAS.Ammissibilita }
     *     
     */
    public void setAmmissibilita(Ammissibilita value) {
        this.ammissibilita = value;
    }

    /**
     * Recupera il valore della propriet?? esito.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorGAS.Esito }
     *     
     */
    public it.edison.thorGAS.Esito getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della propriet?? esito.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorGAS.Esito }
     *     
     */
    public void setEsito(Esito value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della propriet?? misuratore.
     * 
     * @return
     *     possible object is
     *     {@link Misuratore }
     *     
     */
    public Misuratore getMisuratore() {
        return misuratore;
    }

    /**
     * Imposta il valore della propriet?? misuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link Misuratore }
     *     
     */
    public void setMisuratore(Misuratore value) {
        this.misuratore = value;
    }

    /**
     * Recupera il valore della propriet?? convertitore.
     * 
     * @return
     *     possible object is
     *     {@link Misuratore }
     *     
     */
    public Misuratore getConvertitore() {
        return convertitore;
    }

    /**
     * Imposta il valore della propriet?? convertitore.
     * 
     * @param value
     *     allowed object is
     *     {@link Misuratore }
     *     
     */
    public void setConvertitore(Misuratore value) {
        this.convertitore = value;
    }

    /**
     * Recupera il valore della propriet?? pdrInterrotti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrInterrotti() {
        return pdrInterrotti;
    }

    /**
     * Imposta il valore della propriet?? pdrInterrotti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrInterrotti(String value) {
        this.pdrInterrotti = value;
    }

    /**
     * Recupera il valore della propriet?? pdrRipristinati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrRipristinati() {
        return pdrRipristinati;
    }

    /**
     * Imposta il valore della propriet?? pdrRipristinati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrRipristinati(String value) {
        this.pdrRipristinati = value;
    }

    /**
     * Recupera il valore della propriet?? pdrCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrCodice() {
        return pdrCodice;
    }

    /**
     * Imposta il valore della propriet?? pdrCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrCodice(String value) {
        this.pdrCodice = value;
    }

    /**
     * Recupera il valore della propriet?? note.
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
     * Imposta il valore della propriet?? note.
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
     * Recupera il valore della propriet?? preventivo.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorGAS.DatiTecniciPreventivo }
     *     
     */
    public it.edison.thorGAS.DatiTecniciPreventivo getPreventivo() {
        return preventivo;
    }

    /**
     * Imposta il valore della propriet?? preventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorGAS.DatiTecniciPreventivo }
     *     
     */
    public void setPreventivo(DatiTecniciPreventivo value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della propriet?? documentazione.
     * 
     * @return
     *     possible object is
     *     {@link Documentazione }
     *     
     */
    public Documentazione getDocumentazione() {
        return documentazione;
    }

    /**
     * Imposta il valore della propriet?? documentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentazione }
     *     
     */
    public void setDocumentazione(Documentazione value) {
        this.documentazione = value;
    }

    /**
     * Recupera il valore della propriet?? dataEsecuzioneLavoro.
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
     * Imposta il valore della propriet?? dataEsecuzioneLavoro.
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
     * Recupera il valore della propriet?? pdrCodiceRemi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrCodiceRemi() {
        return pdrCodiceRemi;
    }

    /**
     * Imposta il valore della propriet?? pdrCodiceRemi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrCodiceRemi(String value) {
        this.pdrCodiceRemi = value;
    }

    /**
     * Recupera il valore della propriet?? pdrStato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrStato() {
        return pdrStato;
    }

    /**
     * Imposta il valore della propriet?? pdrStato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrStato(String value) {
        this.pdrStato = value;
    }

    /**
     * Recupera il valore della propriet?? indirizzoFornitura.
     * 
     * @return
     *     possible object is
     *     {@link Indirizzo }
     *     
     */
    public Indirizzo getIndirizzoFornitura() {
        return indirizzoFornitura;
    }

    /**
     * Imposta il valore della propriet?? indirizzoFornitura.
     * 
     * @param value
     *     allowed object is
     *     {@link Indirizzo }
     *     
     */
    public void setIndirizzoFornitura(Indirizzo value) {
        this.indirizzoFornitura = value;
    }

    /**
     * Recupera il valore della propriet?? nuovoMisuratore.
     * 
     * @return
     *     possible object is
     *     {@link Misuratore }
     *     
     */
    public Misuratore getNuovoMisuratore() {
        return nuovoMisuratore;
    }

    /**
     * Imposta il valore della propriet?? nuovoMisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link Misuratore }
     *     
     */
    public void setNuovoMisuratore(Misuratore value) {
        this.nuovoMisuratore = value;
    }

    /**
     * Recupera il valore della propriet?? nuovoConvertitore.
     * 
     * @return
     *     possible object is
     *     {@link Misuratore }
     *     
     */
    public Misuratore getNuovoConvertitore() {
        return nuovoConvertitore;
    }

    /**
     * Imposta il valore della propriet?? nuovoConvertitore.
     * 
     * @param value
     *     allowed object is
     *     {@link Misuratore }
     *     
     */
    public void setNuovoConvertitore(Misuratore value) {
        this.nuovoConvertitore = value;
    }

    /**
     * Recupera il valore della propriet?? datiTecniciRichiesti.
     * 
     * @return
     *     possible object is
     *     {@link DatiTecnici }
     *     
     */
    public DatiTecnici getDatiTecniciRichiesti() {
        return datiTecniciRichiesti;
    }

    /**
     * Imposta il valore della propriet?? datiTecniciRichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiTecnici }
     *     
     */
    public void setDatiTecniciRichiesti(DatiTecnici value) {
        this.datiTecniciRichiesti = value;
    }

    /**
     * Recupera il valore della propriet?? riferimentoPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimentoPreventivo() {
        return riferimentoPreventivo;
    }

    /**
     * Imposta il valore della propriet?? riferimentoPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimentoPreventivo(String value) {
        this.riferimentoPreventivo = value;
    }

    /**
     * Recupera il valore della propriet?? attiAutorizzativi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttiAutorizzativi() {
        return attiAutorizzativi;
    }

    /**
     * Imposta il valore della propriet?? attiAutorizzativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttiAutorizzativi(String value) {
        this.attiAutorizzativi = value;
    }

    /**
     * Recupera il valore della propriet?? fattibilitaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFattibilitaTecnica() {
        return fattibilitaTecnica;
    }

    /**
     * Imposta il valore della propriet?? fattibilitaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFattibilitaTecnica(String value) {
        this.fattibilitaTecnica = value;
    }

    /**
     * Recupera il valore della propriet?? numeroTentativi.
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
     * Imposta il valore della propriet?? numeroTentativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTentativi(String value) {
        this.numeroTentativi = value;
    }

    /**
     * Recupera il valore della propriet?? datiVerifica.
     * 
     * @return
     *     possible object is
     *     {@link Verifica }
     *     
     */
    public Verifica getDatiVerifica() {
        return datiVerifica;
    }

    /**
     * Imposta il valore della propriet?? datiVerifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Verifica }
     *     
     */
    public void setDatiVerifica(Verifica value) {
        this.datiVerifica = value;
    }

    /**
     * Recupera il valore della propriet?? annullamento.
     * 
     * @return
     *     possible object is
     *     {@link Annullamento }
     *     
     */
    public Annullamento getAnnullamento() {
        return annullamento;
    }

    /**
     * Imposta il valore della propriet?? annullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Annullamento }
     *     
     */
    public void setAnnullamento(Annullamento value) {
        this.annullamento = value;
    }

    /**
     * Recupera il valore della propriet?? dataMaxConf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaxConf() {
        return dataMaxConf;
    }

    /**
     * Imposta il valore della propriet?? dataMaxConf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaxConf(String value) {
        this.dataMaxConf = value;
    }

    /**
     * Recupera il valore della propriet?? riferimentoRispQuesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimentoRispQuesiti() {
        return riferimentoRispQuesiti;
    }

    /**
     * Imposta il valore della propriet?? riferimentoRispQuesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimentoRispQuesiti(String value) {
        this.riferimentoRispQuesiti = value;
    }

    /**
     * Recupera il valore della propriet?? installazioneMisuratore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallazioneMisuratore() {
        return installazioneMisuratore;
    }

    /**
     * Imposta il valore della propriet?? installazioneMisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallazioneMisuratore(String value) {
        this.installazioneMisuratore = value;
    }

    /**
     * Recupera il valore della propriet?? installazioneContatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallazioneContatore() {
        return installazioneContatore;
    }

    /**
     * Imposta il valore della propriet?? installazioneContatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallazioneContatore(String value) {
        this.installazioneContatore = value;
    }

}
