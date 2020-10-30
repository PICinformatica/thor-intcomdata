
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_GAS_OUT_REQType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_GAS_OUT_REQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRACKING" type="{}T_I_TRACKINGType"/>
 *         &lt;element name="CLIENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_ESAZIONE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_USCENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_BENEFICIARIO" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="INDIRIZZO_FORNITURA" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_CLIENTE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_ESAZIONE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_IMMOBILE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_BENEFICIARIO" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_SEDE_LEGALE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="PDR_CODICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_CD_PROFILO_PRELIEVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_CD_REMI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RILEVANZA_CONTINUITA_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_VOLTURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_DATI_NON_CONFORMI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_FATTURAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRIORITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUOVO_TENTATIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APPUNTAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PROTOCOLLO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_RECLAMO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUALIFICA_CLIENTE_FINALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESPONSABILE_IMPIANTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESPONSABILE_IMPIANTO_TELEF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOMINATIVO_UTILIZZATORE_FINAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRECHECK">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIRETTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_AGGIORNAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERIODO_COMPETENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_CESSAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAPACITA_CONTRATTUALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_INVIO_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONFERMA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_RICEZIONE_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_DECORRENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_ACCETTAZIONE_PREVENTIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_VENDITA" type="{}T_I_DATI_VENDITAType"/>
 *         &lt;element name="DATI_TECNICI" type="{}T_I_DATI_TECNICIType"/>
 *         &lt;element name="MISURATORE" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="CONVERTITORE" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="MISURATORE_CLIENTE" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="ALLEGATO" type="{}T_I_ALLEGATOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="APPUNTAMENTO_CLIENTE" type="{}T_I_APPUNTAMENTOType"/>
 *         &lt;element name="ANNULLAMENTO" type="{}T_I_ANNULLAMENTOType"/>
 *         &lt;element name="RECESSO" type="{}T_I_RECESSOType"/>
 *         &lt;element name="CONTESTAZIONE" type="{}T_I_CONTESTAZIONEType"/>
 *         &lt;element name="RESIDENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACCESSO_FUI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_FORNITURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SETTORE_MERCEOLOGICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PT_IVA_CC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLIENTE_REFERENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="AGEVOLAZIONI_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AGEVOLAZIONI_ALTRO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALTRE_IMP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACCESSO_FUI_RICHIEDENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_PRECHECK">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOTIVAZIONE_MODIFICA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REFERENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_VALIDITA_RESIDENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_UFFICIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGAMENTO_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_PRESTAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISALIMENTABILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRATTAMENTO_SETTLEMENT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BONUS" type="{}T_I_BONUSType"/>
 *         &lt;element name="IMPORTO_MOROSITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INSTALLAZIONE_CORRETTORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRIBUTI" type="{}T_I_TRIBUTI_GASType"/>
 *         &lt;element name="CODICE_CONTRATTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REVOCA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACQUISTO_CREDITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_RISOLUZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="P_IVA_UTENTE_BILANCIAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGGETTO_DI_VENDITA" type="{}T_I_SOGGETTO_DI_VENDITAType"/>
 *         &lt;element name="CODICE_GESTORE_PROCESSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_NOTIFICA">
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
@XmlType(name = "T_I_TSE_GAS_OUT_REQType", propOrder = {
    "tracking",
    "cliente",
    "clienteesazione",
    "clienteuscente",
    "clientebeneficiario",
    "indirizzofornitura",
    "indirizzocliente",
    "indirizzoesazione",
    "indirizzoimmobile",
    "indirizzobeneficiario",
    "indirizzosedelegale",
    "pdrcodice",
    "pdrtipo",
    "pdrcdprofiloprelievo",
    "pdrcdremi",
    "rilevanzacontinuitacliente",
    "tipologiavoltura",
    "flagdatinonconformi",
    "datifatturazione",
    "priorita",
    "nuovotentativo",
    "appuntamento",
    "cdprotocollo",
    "cdreclamo",
    "note",
    "qualificaclientefinale",
    "responsabileimpianto",
    "responsabileimpiantotelef",
    "nominativoutilizzatorefinal",
    "precheck",
    "diretto",
    "dtaggiornamento",
    "periodocompetenza",
    "cdcessazione",
    "capacitacontrattuale",
    "flaginviodl",
    "conferma",
    "dtricezionerichiesta",
    "dtdecorrenza",
    "dtaccettazionepreventivo",
    "dativendita",
    "datitecnici",
    "misuratore",
    "convertitore",
    "misuratorecliente",
    "allegato",
    "appuntamentocliente",
    "annullamento",
    "recesso",
    "contestazione",
    "residenza",
    "accessofui",
    "tipofornitura",
    "settoremerceologico",
    "ptivacc",
    "clientereferente",
    "agevolazioniiva",
    "agevolazionialtro",
    "altreimp",
    "accessofuirichiedente",
    "cdpraticaprecheck",
    "motivazionemodifica",
    "tipologiarichiesta",
    "referente",
    "datavaliditaresidenza",
    "codiceufficio",
    "pagamentoiva",
    "codiceprestazione",
    "disalimentabilita",
    "trattamentosettlement",
    "bonus",
    "importomorosita",
    "installazionecorrettore",
    "tributi",
    "codicecontratto",
    "revoca",
    "acquistocredito",
    "tipologiarisoluzione",
    "pivautentebilanciamento",
    "soggettodivendita",
    "codicegestoreprocesso",
    "tiponotifica"
})
public class TITSEGASOUTREQType {

    @XmlElement(name = "TRACKING", required = true)
    protected TITRACKINGType tracking;
    @XmlElement(name = "CLIENTE", required = true)
    protected TICLIENTEType cliente;
    @XmlElement(name = "CLIENTE_ESAZIONE", required = true)
    protected TICLIENTEType clienteesazione;
    @XmlElement(name = "CLIENTE_USCENTE", required = true)
    protected TICLIENTEType clienteuscente;
    @XmlElement(name = "CLIENTE_BENEFICIARIO", required = true)
    protected TICLIENTEType clientebeneficiario;
    @XmlElement(name = "INDIRIZZO_FORNITURA", required = true)
    protected TIINDIRIZZOType indirizzofornitura;
    @XmlElement(name = "INDIRIZZO_CLIENTE", required = true)
    protected TIINDIRIZZOType indirizzocliente;
    @XmlElement(name = "INDIRIZZO_ESAZIONE", required = true)
    protected TIINDIRIZZOType indirizzoesazione;
    @XmlElement(name = "INDIRIZZO_IMMOBILE", required = true)
    protected TIINDIRIZZOType indirizzoimmobile;
    @XmlElement(name = "INDIRIZZO_BENEFICIARIO", required = true)
    protected TIINDIRIZZOType indirizzobeneficiario;
    @XmlElement(name = "INDIRIZZO_SEDE_LEGALE", required = true)
    protected TIINDIRIZZOType indirizzosedelegale;
    @XmlElement(name = "PDR_CODICE", required = true)
    protected String pdrcodice;
    @XmlElement(name = "PDR_TIPO", required = true)
    protected String pdrtipo;
    @XmlElement(name = "PDR_CD_PROFILO_PRELIEVO", required = true)
    protected String pdrcdprofiloprelievo;
    @XmlElement(name = "PDR_CD_REMI", required = true)
    protected String pdrcdremi;
    @XmlElement(name = "RILEVANZA_CONTINUITA_CLIENTE", required = true)
    protected String rilevanzacontinuitacliente;
    @XmlElement(name = "TIPOLOGIA_VOLTURA", required = true)
    protected String tipologiavoltura;
    @XmlElement(name = "FLAG_DATI_NON_CONFORMI", required = true)
    protected String flagdatinonconformi;
    @XmlElement(name = "DATI_FATTURAZIONE", required = true)
    protected String datifatturazione;
    @XmlElement(name = "PRIORITA", required = true)
    protected String priorita;
    @XmlElement(name = "NUOVO_TENTATIVO", required = true)
    protected String nuovotentativo;
    @XmlElement(name = "APPUNTAMENTO", required = true)
    protected String appuntamento;
    @XmlElement(name = "CD_PROTOCOLLO", required = true)
    protected String cdprotocollo;
    @XmlElement(name = "CD_RECLAMO", required = true)
    protected String cdreclamo;
    @XmlElement(name = "NOTE", required = true)
    protected String note;
    @XmlElement(name = "QUALIFICA_CLIENTE_FINALE", required = true)
    protected String qualificaclientefinale;
    @XmlElement(name = "RESPONSABILE_IMPIANTO", required = true)
    protected String responsabileimpianto;
    @XmlElement(name = "RESPONSABILE_IMPIANTO_TELEF", required = true)
    protected String responsabileimpiantotelef;
    @XmlElement(name = "NOMINATIVO_UTILIZZATORE_FINAL", required = true)
    protected String nominativoutilizzatorefinal;
    @XmlElement(name = "PRECHECK", required = true)
    protected String precheck;
    @XmlElement(name = "DIRETTO", required = true)
    protected String diretto;
    @XmlElement(name = "DT_AGGIORNAMENTO", required = true)
    protected String dtaggiornamento;
    @XmlElement(name = "PERIODO_COMPETENZA", required = true)
    protected String periodocompetenza;
    @XmlElement(name = "CD_CESSAZIONE", required = true)
    protected String cdcessazione;
    @XmlElement(name = "CAPACITA_CONTRATTUALE", required = true)
    protected String capacitacontrattuale;
    @XmlElement(name = "FLAG_INVIO_DL", required = true)
    protected String flaginviodl;
    @XmlElement(name = "CONFERMA", required = true)
    protected String conferma;
    @XmlElement(name = "DT_RICEZIONE_RICHIESTA", required = true)
    protected String dtricezionerichiesta;
    @XmlElement(name = "DT_DECORRENZA", required = true)
    protected String dtdecorrenza;
    @XmlElement(name = "DT_ACCETTAZIONE_PREVENTIVO", required = true)
    protected String dtaccettazionepreventivo;
    @XmlElement(name = "DATI_VENDITA", required = true)
    protected TIDATIVENDITAType dativendita;
    @XmlElement(name = "DATI_TECNICI", required = true)
    protected TIDATITECNICIType datitecnici;
    @XmlElement(name = "MISURATORE", required = true)
    protected TILETTURAGASType misuratore;
    @XmlElement(name = "CONVERTITORE", required = true)
    protected TILETTURAGASType convertitore;
    @XmlElement(name = "MISURATORE_CLIENTE", required = true)
    protected TILETTURAGASType misuratorecliente;
    @XmlElement(name = "ALLEGATO")
    protected List<TIALLEGATOType> allegato;
    @XmlElement(name = "APPUNTAMENTO_CLIENTE", required = true)
    protected TIAPPUNTAMENTOType appuntamentocliente;
    @XmlElement(name = "ANNULLAMENTO", required = true)
    protected TIANNULLAMENTOType annullamento;
    @XmlElement(name = "RECESSO", required = true)
    protected TIRECESSOType recesso;
    @XmlElement(name = "CONTESTAZIONE", required = true)
    protected TICONTESTAZIONEType contestazione;
    @XmlElement(name = "RESIDENZA", required = true)
    protected String residenza;
    @XmlElement(name = "ACCESSO_FUI", required = true)
    protected String accessofui;
    @XmlElement(name = "TIPO_FORNITURA", required = true)
    protected String tipofornitura;
    @XmlElement(name = "SETTORE_MERCEOLOGICO", required = true)
    protected String settoremerceologico;
    @XmlElement(name = "PT_IVA_CC", required = true)
    protected String ptivacc;
    @XmlElement(name = "CLIENTE_REFERENTE", required = true)
    protected TICLIENTEType clientereferente;
    @XmlElement(name = "AGEVOLAZIONI_IVA", required = true)
    protected String agevolazioniiva;
    @XmlElement(name = "AGEVOLAZIONI_ALTRO", required = true)
    protected String agevolazionialtro;
    @XmlElement(name = "ALTRE_IMP", required = true)
    protected String altreimp;
    @XmlElement(name = "ACCESSO_FUI_RICHIEDENTE", required = true)
    protected String accessofuirichiedente;
    @XmlElement(name = "CD_PRATICA_PRECHECK", required = true)
    protected String cdpraticaprecheck;
    @XmlElement(name = "MOTIVAZIONE_MODIFICA", required = true)
    protected String motivazionemodifica;
    @XmlElement(name = "TIPOLOGIA_RICHIESTA", required = true)
    protected String tipologiarichiesta;
    @XmlElement(name = "REFERENTE", required = true)
    protected String referente;
    @XmlElement(name = "DATA_VALIDITA_RESIDENZA", required = true)
    protected String datavaliditaresidenza;
    @XmlElement(name = "CODICE_UFFICIO", required = true)
    protected String codiceufficio;
    @XmlElement(name = "PAGAMENTO_IVA", required = true)
    protected String pagamentoiva;
    @XmlElement(name = "CODICE_PRESTAZIONE", required = true)
    protected String codiceprestazione;
    @XmlElement(name = "DISALIMENTABILITA", required = true)
    protected String disalimentabilita;
    @XmlElement(name = "TRATTAMENTO_SETTLEMENT", required = true)
    protected String trattamentosettlement;
    @XmlElement(name = "BONUS", required = true)
    protected TIBONUSType bonus;
    @XmlElement(name = "IMPORTO_MOROSITA", required = true)
    protected String importomorosita;
    @XmlElement(name = "INSTALLAZIONE_CORRETTORE", required = true)
    protected String installazionecorrettore;
    @XmlElement(name = "TRIBUTI", required = true)
    protected TITRIBUTIGASType tributi;
    @XmlElement(name = "CODICE_CONTRATTO", required = true)
    protected String codicecontratto;
    @XmlElement(name = "REVOCA", required = true)
    protected String revoca;
    @XmlElement(name = "ACQUISTO_CREDITO", required = true)
    protected String acquistocredito;
    @XmlElement(name = "TIPOLOGIA_RISOLUZIONE", required = true)
    protected String tipologiarisoluzione;
    @XmlElement(name = "P_IVA_UTENTE_BILANCIAMENTO", required = true)
    protected String pivautentebilanciamento;
    @XmlElement(name = "SOGGETTO_DI_VENDITA", required = true)
    protected TISOGGETTODIVENDITAType soggettodivendita;
    @XmlElement(name = "CODICE_GESTORE_PROCESSO", required = true)
    protected String codicegestoreprocesso;
    @XmlElement(name = "TIPO_NOTIFICA", required = true)
    protected String tiponotifica;

    /**
     * Recupera il valore della proprietà tracking.
     * 
     * @return
     *     possible object is
     *     {@link TITRACKINGType }
     *     
     */
    public TITRACKINGType getTRACKING() {
        return tracking;
    }

    /**
     * Imposta il valore della proprietà tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRACKINGType }
     *     
     */
    public void setTRACKING(TITRACKINGType value) {
        this.tracking = value;
    }

    /**
     * Recupera il valore della proprietà cliente.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTE() {
        return cliente;
    }

    /**
     * Imposta il valore della proprietà cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTE(TICLIENTEType value) {
        this.cliente = value;
    }

    /**
     * Recupera il valore della proprietà clienteesazione.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTEESAZIONE() {
        return clienteesazione;
    }

    /**
     * Imposta il valore della proprietà clienteesazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTEESAZIONE(TICLIENTEType value) {
        this.clienteesazione = value;
    }

    /**
     * Recupera il valore della proprietà clienteuscente.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTEUSCENTE() {
        return clienteuscente;
    }

    /**
     * Imposta il valore della proprietà clienteuscente.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTEUSCENTE(TICLIENTEType value) {
        this.clienteuscente = value;
    }

    /**
     * Recupera il valore della proprietà clientebeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTEBENEFICIARIO() {
        return clientebeneficiario;
    }

    /**
     * Imposta il valore della proprietà clientebeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTEBENEFICIARIO(TICLIENTEType value) {
        this.clientebeneficiario = value;
    }

    /**
     * Recupera il valore della proprietà indirizzofornitura.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOFORNITURA() {
        return indirizzofornitura;
    }

    /**
     * Imposta il valore della proprietà indirizzofornitura.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOFORNITURA(TIINDIRIZZOType value) {
        this.indirizzofornitura = value;
    }

    /**
     * Recupera il valore della proprietà indirizzocliente.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOCLIENTE() {
        return indirizzocliente;
    }

    /**
     * Imposta il valore della proprietà indirizzocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOCLIENTE(TIINDIRIZZOType value) {
        this.indirizzocliente = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoesazione.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOESAZIONE() {
        return indirizzoesazione;
    }

    /**
     * Imposta il valore della proprietà indirizzoesazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOESAZIONE(TIINDIRIZZOType value) {
        this.indirizzoesazione = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoimmobile.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOIMMOBILE() {
        return indirizzoimmobile;
    }

    /**
     * Imposta il valore della proprietà indirizzoimmobile.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOIMMOBILE(TIINDIRIZZOType value) {
        this.indirizzoimmobile = value;
    }

    /**
     * Recupera il valore della proprietà indirizzobeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOBENEFICIARIO() {
        return indirizzobeneficiario;
    }

    /**
     * Imposta il valore della proprietà indirizzobeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOBENEFICIARIO(TIINDIRIZZOType value) {
        this.indirizzobeneficiario = value;
    }

    /**
     * Recupera il valore della proprietà indirizzosedelegale.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOSEDELEGALE() {
        return indirizzosedelegale;
    }

    /**
     * Imposta il valore della proprietà indirizzosedelegale.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOSEDELEGALE(TIINDIRIZZOType value) {
        this.indirizzosedelegale = value;
    }

    /**
     * Recupera il valore della proprietà pdrcodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRCODICE() {
        return pdrcodice;
    }

    /**
     * Imposta il valore della proprietà pdrcodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRCODICE(String value) {
        this.pdrcodice = value;
    }

    /**
     * Recupera il valore della proprietà pdrtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRTIPO() {
        return pdrtipo;
    }

    /**
     * Imposta il valore della proprietà pdrtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRTIPO(String value) {
        this.pdrtipo = value;
    }

    /**
     * Recupera il valore della proprietà pdrcdprofiloprelievo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRCDPROFILOPRELIEVO() {
        return pdrcdprofiloprelievo;
    }

    /**
     * Imposta il valore della proprietà pdrcdprofiloprelievo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRCDPROFILOPRELIEVO(String value) {
        this.pdrcdprofiloprelievo = value;
    }

    /**
     * Recupera il valore della proprietà pdrcdremi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRCDREMI() {
        return pdrcdremi;
    }

    /**
     * Imposta il valore della proprietà pdrcdremi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRCDREMI(String value) {
        this.pdrcdremi = value;
    }

    /**
     * Recupera il valore della proprietà rilevanzacontinuitacliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRILEVANZACONTINUITACLIENTE() {
        return rilevanzacontinuitacliente;
    }

    /**
     * Imposta il valore della proprietà rilevanzacontinuitacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRILEVANZACONTINUITACLIENTE(String value) {
        this.rilevanzacontinuitacliente = value;
    }

    /**
     * Recupera il valore della proprietà tipologiavoltura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIAVOLTURA() {
        return tipologiavoltura;
    }

    /**
     * Imposta il valore della proprietà tipologiavoltura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIAVOLTURA(String value) {
        this.tipologiavoltura = value;
    }

    /**
     * Recupera il valore della proprietà flagdatinonconformi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGDATINONCONFORMI() {
        return flagdatinonconformi;
    }

    /**
     * Imposta il valore della proprietà flagdatinonconformi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGDATINONCONFORMI(String value) {
        this.flagdatinonconformi = value;
    }

    /**
     * Recupera il valore della proprietà datifatturazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATIFATTURAZIONE() {
        return datifatturazione;
    }

    /**
     * Imposta il valore della proprietà datifatturazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATIFATTURAZIONE(String value) {
        this.datifatturazione = value;
    }

    /**
     * Recupera il valore della proprietà priorita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITA() {
        return priorita;
    }

    /**
     * Imposta il valore della proprietà priorita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITA(String value) {
        this.priorita = value;
    }

    /**
     * Recupera il valore della proprietà nuovotentativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUOVOTENTATIVO() {
        return nuovotentativo;
    }

    /**
     * Imposta il valore della proprietà nuovotentativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUOVOTENTATIVO(String value) {
        this.nuovotentativo = value;
    }

    /**
     * Recupera il valore della proprietà appuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPUNTAMENTO() {
        return appuntamento;
    }

    /**
     * Imposta il valore della proprietà appuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPUNTAMENTO(String value) {
        this.appuntamento = value;
    }

    /**
     * Recupera il valore della proprietà cdprotocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPROTOCOLLO() {
        return cdprotocollo;
    }

    /**
     * Imposta il valore della proprietà cdprotocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPROTOCOLLO(String value) {
        this.cdprotocollo = value;
    }

    /**
     * Recupera il valore della proprietà cdreclamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRECLAMO() {
        return cdreclamo;
    }

    /**
     * Imposta il valore della proprietà cdreclamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRECLAMO(String value) {
        this.cdreclamo = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTE() {
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
    public void setNOTE(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà qualificaclientefinale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUALIFICACLIENTEFINALE() {
        return qualificaclientefinale;
    }

    /**
     * Imposta il valore della proprietà qualificaclientefinale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUALIFICACLIENTEFINALE(String value) {
        this.qualificaclientefinale = value;
    }

    /**
     * Recupera il valore della proprietà responsabileimpianto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSABILEIMPIANTO() {
        return responsabileimpianto;
    }

    /**
     * Imposta il valore della proprietà responsabileimpianto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSABILEIMPIANTO(String value) {
        this.responsabileimpianto = value;
    }

    /**
     * Recupera il valore della proprietà responsabileimpiantotelef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSABILEIMPIANTOTELEF() {
        return responsabileimpiantotelef;
    }

    /**
     * Imposta il valore della proprietà responsabileimpiantotelef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSABILEIMPIANTOTELEF(String value) {
        this.responsabileimpiantotelef = value;
    }

    /**
     * Recupera il valore della proprietà nominativoutilizzatorefinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMINATIVOUTILIZZATOREFINAL() {
        return nominativoutilizzatorefinal;
    }

    /**
     * Imposta il valore della proprietà nominativoutilizzatorefinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMINATIVOUTILIZZATOREFINAL(String value) {
        this.nominativoutilizzatorefinal = value;
    }

    /**
     * Recupera il valore della proprietà precheck.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECHECK() {
        return precheck;
    }

    /**
     * Imposta il valore della proprietà precheck.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECHECK(String value) {
        this.precheck = value;
    }

    /**
     * Recupera il valore della proprietà diretto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRETTO() {
        return diretto;
    }

    /**
     * Imposta il valore della proprietà diretto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRETTO(String value) {
        this.diretto = value;
    }

    /**
     * Recupera il valore della proprietà dtaggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTAGGIORNAMENTO() {
        return dtaggiornamento;
    }

    /**
     * Imposta il valore della proprietà dtaggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTAGGIORNAMENTO(String value) {
        this.dtaggiornamento = value;
    }

    /**
     * Recupera il valore della proprietà periodocompetenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODOCOMPETENZA() {
        return periodocompetenza;
    }

    /**
     * Imposta il valore della proprietà periodocompetenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODOCOMPETENZA(String value) {
        this.periodocompetenza = value;
    }

    /**
     * Recupera il valore della proprietà cdcessazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCESSAZIONE() {
        return cdcessazione;
    }

    /**
     * Imposta il valore della proprietà cdcessazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCESSAZIONE(String value) {
        this.cdcessazione = value;
    }

    /**
     * Recupera il valore della proprietà capacitacontrattuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACITACONTRATTUALE() {
        return capacitacontrattuale;
    }

    /**
     * Imposta il valore della proprietà capacitacontrattuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACITACONTRATTUALE(String value) {
        this.capacitacontrattuale = value;
    }

    /**
     * Recupera il valore della proprietà flaginviodl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGINVIODL() {
        return flaginviodl;
    }

    /**
     * Imposta il valore della proprietà flaginviodl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGINVIODL(String value) {
        this.flaginviodl = value;
    }

    /**
     * Recupera il valore della proprietà conferma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFERMA() {
        return conferma;
    }

    /**
     * Imposta il valore della proprietà conferma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFERMA(String value) {
        this.conferma = value;
    }

    /**
     * Recupera il valore della proprietà dtricezionerichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTRICEZIONERICHIESTA() {
        return dtricezionerichiesta;
    }

    /**
     * Imposta il valore della proprietà dtricezionerichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTRICEZIONERICHIESTA(String value) {
        this.dtricezionerichiesta = value;
    }

    /**
     * Recupera il valore della proprietà dtdecorrenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDECORRENZA() {
        return dtdecorrenza;
    }

    /**
     * Imposta il valore della proprietà dtdecorrenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDECORRENZA(String value) {
        this.dtdecorrenza = value;
    }

    /**
     * Recupera il valore della proprietà dtaccettazionepreventivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTACCETTAZIONEPREVENTIVO() {
        return dtaccettazionepreventivo;
    }

    /**
     * Imposta il valore della proprietà dtaccettazionepreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTACCETTAZIONEPREVENTIVO(String value) {
        this.dtaccettazionepreventivo = value;
    }

    /**
     * Recupera il valore della proprietà dativendita.
     * 
     * @return
     *     possible object is
     *     {@link TIDATIVENDITAType }
     *     
     */
    public TIDATIVENDITAType getDATIVENDITA() {
        return dativendita;
    }

    /**
     * Imposta il valore della proprietà dativendita.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATIVENDITAType }
     *     
     */
    public void setDATIVENDITA(TIDATIVENDITAType value) {
        this.dativendita = value;
    }

    /**
     * Recupera il valore della proprietà datitecnici.
     * 
     * @return
     *     possible object is
     *     {@link TIDATITECNICIType }
     *     
     */
    public TIDATITECNICIType getDATITECNICI() {
        return datitecnici;
    }

    /**
     * Imposta il valore della proprietà datitecnici.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATITECNICIType }
     *     
     */
    public void setDATITECNICI(TIDATITECNICIType value) {
        this.datitecnici = value;
    }

    /**
     * Recupera il valore della proprietà misuratore.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getMISURATORE() {
        return misuratore;
    }

    /**
     * Imposta il valore della proprietà misuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setMISURATORE(TILETTURAGASType value) {
        this.misuratore = value;
    }

    /**
     * Recupera il valore della proprietà convertitore.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCONVERTITORE() {
        return convertitore;
    }

    /**
     * Imposta il valore della proprietà convertitore.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCONVERTITORE(TILETTURAGASType value) {
        this.convertitore = value;
    }

    /**
     * Recupera il valore della proprietà misuratorecliente.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getMISURATORECLIENTE() {
        return misuratorecliente;
    }

    /**
     * Imposta il valore della proprietà misuratorecliente.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setMISURATORECLIENTE(TILETTURAGASType value) {
        this.misuratorecliente = value;
    }

    /**
     * Gets the value of the allegato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALLEGATO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIALLEGATOType }
     * 
     * 
     */
    public List<TIALLEGATOType> getALLEGATO() {
        if (allegato == null) {
            allegato = new ArrayList<TIALLEGATOType>();
        }
        return this.allegato;
    }

    /**
     * Recupera il valore della proprietà appuntamentocliente.
     * 
     * @return
     *     possible object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public TIAPPUNTAMENTOType getAPPUNTAMENTOCLIENTE() {
        return appuntamentocliente;
    }

    /**
     * Imposta il valore della proprietà appuntamentocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public void setAPPUNTAMENTOCLIENTE(TIAPPUNTAMENTOType value) {
        this.appuntamentocliente = value;
    }

    /**
     * Recupera il valore della proprietà annullamento.
     * 
     * @return
     *     possible object is
     *     {@link TIANNULLAMENTOType }
     *     
     */
    public TIANNULLAMENTOType getANNULLAMENTO() {
        return annullamento;
    }

    /**
     * Imposta il valore della proprietà annullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TIANNULLAMENTOType }
     *     
     */
    public void setANNULLAMENTO(TIANNULLAMENTOType value) {
        this.annullamento = value;
    }

    /**
     * Recupera il valore della proprietà recesso.
     * 
     * @return
     *     possible object is
     *     {@link TIRECESSOType }
     *     
     */
    public TIRECESSOType getRECESSO() {
        return recesso;
    }

    /**
     * Imposta il valore della proprietà recesso.
     * 
     * @param value
     *     allowed object is
     *     {@link TIRECESSOType }
     *     
     */
    public void setRECESSO(TIRECESSOType value) {
        this.recesso = value;
    }

    /**
     * Recupera il valore della proprietà contestazione.
     * 
     * @return
     *     possible object is
     *     {@link TICONTESTAZIONEType }
     *     
     */
    public TICONTESTAZIONEType getCONTESTAZIONE() {
        return contestazione;
    }

    /**
     * Imposta il valore della proprietà contestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TICONTESTAZIONEType }
     *     
     */
    public void setCONTESTAZIONE(TICONTESTAZIONEType value) {
        this.contestazione = value;
    }

    /**
     * Recupera il valore della proprietà residenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDENZA() {
        return residenza;
    }

    /**
     * Imposta il valore della proprietà residenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDENZA(String value) {
        this.residenza = value;
    }

    /**
     * Recupera il valore della proprietà accessofui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSOFUI() {
        return accessofui;
    }

    /**
     * Imposta il valore della proprietà accessofui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSOFUI(String value) {
        this.accessofui = value;
    }

    /**
     * Recupera il valore della proprietà tipofornitura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFORNITURA() {
        return tipofornitura;
    }

    /**
     * Imposta il valore della proprietà tipofornitura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFORNITURA(String value) {
        this.tipofornitura = value;
    }

    /**
     * Recupera il valore della proprietà settoremerceologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTOREMERCEOLOGICO() {
        return settoremerceologico;
    }

    /**
     * Imposta il valore della proprietà settoremerceologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTOREMERCEOLOGICO(String value) {
        this.settoremerceologico = value;
    }

    /**
     * Recupera il valore della proprietà ptivacc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIVACC() {
        return ptivacc;
    }

    /**
     * Imposta il valore della proprietà ptivacc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIVACC(String value) {
        this.ptivacc = value;
    }

    /**
     * Recupera il valore della proprietà clientereferente.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTEREFERENTE() {
        return clientereferente;
    }

    /**
     * Imposta il valore della proprietà clientereferente.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTEREFERENTE(TICLIENTEType value) {
        this.clientereferente = value;
    }

    /**
     * Recupera il valore della proprietà agevolazioniiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGEVOLAZIONIIVA() {
        return agevolazioniiva;
    }

    /**
     * Imposta il valore della proprietà agevolazioniiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGEVOLAZIONIIVA(String value) {
        this.agevolazioniiva = value;
    }

    /**
     * Recupera il valore della proprietà agevolazionialtro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGEVOLAZIONIALTRO() {
        return agevolazionialtro;
    }

    /**
     * Imposta il valore della proprietà agevolazionialtro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGEVOLAZIONIALTRO(String value) {
        this.agevolazionialtro = value;
    }

    /**
     * Recupera il valore della proprietà altreimp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTREIMP() {
        return altreimp;
    }

    /**
     * Imposta il valore della proprietà altreimp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTREIMP(String value) {
        this.altreimp = value;
    }

    /**
     * Recupera il valore della proprietà accessofuirichiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSOFUIRICHIEDENTE() {
        return accessofuirichiedente;
    }

    /**
     * Imposta il valore della proprietà accessofuirichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSOFUIRICHIEDENTE(String value) {
        this.accessofuirichiedente = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticaprecheck.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICAPRECHECK() {
        return cdpraticaprecheck;
    }

    /**
     * Imposta il valore della proprietà cdpraticaprecheck.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICAPRECHECK(String value) {
        this.cdpraticaprecheck = value;
    }

    /**
     * Recupera il valore della proprietà motivazionemodifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVAZIONEMODIFICA() {
        return motivazionemodifica;
    }

    /**
     * Imposta il valore della proprietà motivazionemodifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVAZIONEMODIFICA(String value) {
        this.motivazionemodifica = value;
    }

    /**
     * Recupera il valore della proprietà tipologiarichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIARICHIESTA() {
        return tipologiarichiesta;
    }

    /**
     * Imposta il valore della proprietà tipologiarichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIARICHIESTA(String value) {
        this.tipologiarichiesta = value;
    }

    /**
     * Recupera il valore della proprietà referente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENTE() {
        return referente;
    }

    /**
     * Imposta il valore della proprietà referente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENTE(String value) {
        this.referente = value;
    }

    /**
     * Recupera il valore della proprietà datavaliditaresidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAVALIDITARESIDENZA() {
        return datavaliditaresidenza;
    }

    /**
     * Imposta il valore della proprietà datavaliditaresidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAVALIDITARESIDENZA(String value) {
        this.datavaliditaresidenza = value;
    }

    /**
     * Recupera il valore della proprietà codiceufficio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEUFFICIO() {
        return codiceufficio;
    }

    /**
     * Imposta il valore della proprietà codiceufficio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEUFFICIO(String value) {
        this.codiceufficio = value;
    }

    /**
     * Recupera il valore della proprietà pagamentoiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGAMENTOIVA() {
        return pagamentoiva;
    }

    /**
     * Imposta il valore della proprietà pagamentoiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGAMENTOIVA(String value) {
        this.pagamentoiva = value;
    }

    /**
     * Recupera il valore della proprietà codiceprestazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEPRESTAZIONE() {
        return codiceprestazione;
    }

    /**
     * Imposta il valore della proprietà codiceprestazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEPRESTAZIONE(String value) {
        this.codiceprestazione = value;
    }

    /**
     * Recupera il valore della proprietà disalimentabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISALIMENTABILITA() {
        return disalimentabilita;
    }

    /**
     * Imposta il valore della proprietà disalimentabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISALIMENTABILITA(String value) {
        this.disalimentabilita = value;
    }

    /**
     * Recupera il valore della proprietà trattamentosettlement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRATTAMENTOSETTLEMENT() {
        return trattamentosettlement;
    }

    /**
     * Imposta il valore della proprietà trattamentosettlement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRATTAMENTOSETTLEMENT(String value) {
        this.trattamentosettlement = value;
    }

    /**
     * Recupera il valore della proprietà bonus.
     * 
     * @return
     *     possible object is
     *     {@link TIBONUSType }
     *     
     */
    public TIBONUSType getBONUS() {
        return bonus;
    }

    /**
     * Imposta il valore della proprietà bonus.
     * 
     * @param value
     *     allowed object is
     *     {@link TIBONUSType }
     *     
     */
    public void setBONUS(TIBONUSType value) {
        this.bonus = value;
    }

    /**
     * Recupera il valore della proprietà importomorosita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTOMOROSITA() {
        return importomorosita;
    }

    /**
     * Imposta il valore della proprietà importomorosita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTOMOROSITA(String value) {
        this.importomorosita = value;
    }

    /**
     * Recupera il valore della proprietà installazionecorrettore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTALLAZIONECORRETTORE() {
        return installazionecorrettore;
    }

    /**
     * Imposta il valore della proprietà installazionecorrettore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTALLAZIONECORRETTORE(String value) {
        this.installazionecorrettore = value;
    }

    /**
     * Recupera il valore della proprietà tributi.
     * 
     * @return
     *     possible object is
     *     {@link TITRIBUTIGASType }
     *     
     */
    public TITRIBUTIGASType getTRIBUTI() {
        return tributi;
    }

    /**
     * Imposta il valore della proprietà tributi.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRIBUTIGASType }
     *     
     */
    public void setTRIBUTI(TITRIBUTIGASType value) {
        this.tributi = value;
    }

    /**
     * Recupera il valore della proprietà codicecontratto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICECONTRATTO() {
        return codicecontratto;
    }

    /**
     * Imposta il valore della proprietà codicecontratto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICECONTRATTO(String value) {
        this.codicecontratto = value;
    }

    /**
     * Recupera il valore della proprietà revoca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVOCA() {
        return revoca;
    }

    /**
     * Imposta il valore della proprietà revoca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVOCA(String value) {
        this.revoca = value;
    }

    /**
     * Recupera il valore della proprietà acquistocredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACQUISTOCREDITO() {
        return acquistocredito;
    }

    /**
     * Imposta il valore della proprietà acquistocredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACQUISTOCREDITO(String value) {
        this.acquistocredito = value;
    }

    /**
     * Recupera il valore della proprietà tipologiarisoluzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIARISOLUZIONE() {
        return tipologiarisoluzione;
    }

    /**
     * Imposta il valore della proprietà tipologiarisoluzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIARISOLUZIONE(String value) {
        this.tipologiarisoluzione = value;
    }

    /**
     * Recupera il valore della proprietà pivautentebilanciamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIVAUTENTEBILANCIAMENTO() {
        return pivautentebilanciamento;
    }

    /**
     * Imposta il valore della proprietà pivautentebilanciamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIVAUTENTEBILANCIAMENTO(String value) {
        this.pivautentebilanciamento = value;
    }

    /**
     * Recupera il valore della proprietà soggettodivendita.
     * 
     * @return
     *     possible object is
     *     {@link TISOGGETTODIVENDITAType }
     *     
     */
    public TISOGGETTODIVENDITAType getSOGGETTODIVENDITA() {
        return soggettodivendita;
    }

    /**
     * Imposta il valore della proprietà soggettodivendita.
     * 
     * @param value
     *     allowed object is
     *     {@link TISOGGETTODIVENDITAType }
     *     
     */
    public void setSOGGETTODIVENDITA(TISOGGETTODIVENDITAType value) {
        this.soggettodivendita = value;
    }

    /**
     * Recupera il valore della proprietà codicegestoreprocesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEGESTOREPROCESSO() {
        return codicegestoreprocesso;
    }

    /**
     * Imposta il valore della proprietà codicegestoreprocesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEGESTOREPROCESSO(String value) {
        this.codicegestoreprocesso = value;
    }

    /**
     * Recupera il valore della proprietà tiponotifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPONOTIFICA() {
        return tiponotifica;
    }

    /**
     * Imposta il valore della proprietà tiponotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPONOTIFICA(String value) {
        this.tiponotifica = value;
    }

}
