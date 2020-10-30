
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_EE_OUT_REQType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_EE_OUT_REQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRACKING" type="{}T_I_TRACKINGType"/>
 *         &lt;element name="CLIENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_ESAZIONE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_USCENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_CONTATTO" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_REFERENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_MODIFICATO" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="PRESENZA_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INDIRIZZO_ESAZIONE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_SEDE_LEGALE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_FORNITURA" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_ESAZIONE_MODIFICATO" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_LEGALE_MODIFICATO" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="CONFERMA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LETTURA_CLIENTE" type="{}T_I_LETTURA_EEType"/>
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
 *         &lt;element name="LETTURA_RECLAMO" type="{}T_I_LETTURA_EEType"/>
 *         &lt;element name="DT_RICEZIONE_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_DA_NON_ESEGUIRE_PRIMA_DEL">
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
 *         &lt;element name="NOTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STAGIONALE_RICORRENTE" type="{}T_I_STAGIONALE_RICORRENTEType"/>
 *         &lt;element name="TIPO_CONNESSIONE">
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
 *         &lt;element name="MANDATO_CONNESSIONE">
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
 *         &lt;element name="ATTIVAZIONE_FUORI_ORARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISATTIVAZIONE_FUORI_ORARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO_CURVE_CARICO">
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
 *         &lt;element name="CD_AREA_PRED">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_VIA_PRED">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTANZA_SPOSTAMENTO">
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
 *         &lt;element name="POD_DA_UNIFICARE" type="{}T_I_POD_DA_UNIFICAREType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DATI_TECNICI_RICHIESTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MODIFICA_OCCASIONALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CATEGORIA_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESIDENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARTICOLARI_MODALITA_FATT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO_CURVE_CARICO_GIORNAL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_RICHIESTA_SERVIZIO_CURVE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NR_POD_DA_REALIZZARE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISAGIATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_MERCATO">
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
 *         &lt;element name="CONTINUITA_CONSUMI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_FINE_FORNITURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_UTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRADER">
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
 *         &lt;element name="CONSUMO_ANNUO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROFILO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_OFFERTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOROSITA_BLOCCANTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANNULLAMENTO" type="{}T_I_ANNULLAMENTOType"/>
 *         &lt;element name="APPUNTAMENTO_CLIENTE" type="{}T_I_APPUNTAMENTOType"/>
 *         &lt;element name="DT_ACCETTAZIONE_PREVENTIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALLEGATI" type="{}T_I_ALLEGATOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CONTESTAZIONE" type="{}T_I_CONTESTAZIONEType"/>
 *         &lt;element name="INVIO_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_ATTUALE" type="{}T_I_POTENZAType"/>
 *         &lt;element name="POTENZA_RICHIESTA" type="{}T_I_POTENZAType"/>
 *         &lt;element name="TENSIONE_ATTUALE" type="{}T_I_TENSIONEType"/>
 *         &lt;element name="TENSIONE_RICHIESTA" type="{}T_I_TENSIONEType"/>
 *         &lt;element name="DATI_COMMERCIALI_ATTUALI" type="{}T_I_DATI_COMMERCIALIType"/>
 *         &lt;element name="DATI_COMMERCIALI_RICHIESTA" type="{}T_I_DATI_COMMERCIALIType"/>
 *         &lt;element name="TRIBUTI" type="{}T_I_TRIBUTIType"/>
 *         &lt;element name="AUTOCERTIFICAZIONI" type="{}T_I_AUTOCERTIFICAZIONIType"/>
 *         &lt;element name="DISALIMENTABILITA" type="{}T_I_DISALIMENTABILITAType"/>
 *         &lt;element name="RECESSO" type="{}T_I_RECESSOType"/>
 *         &lt;element name="CONTRATTO_DISPACCIAMENTO">
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
 *         &lt;element name="DATA_FIRMA_CONTRATTO">
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
 *         &lt;element name="TIMOE">
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
 *         &lt;element name="CD_PRATICA_PRECHECK">
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
 *         &lt;element name="TIPOLOGIA_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMPORTO_MOROSITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOGGETTO_DI_VENDITA" type="{}T_I_SOGGETTO_DI_VENDITAType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_TSE_EE_OUT_REQType", propOrder = {
    "tracking",
    "cliente",
    "clienteesazione",
    "clienteuscente",
    "clientecontatto",
    "clientereferente",
    "clientemodificato",
    "presenzacliente",
    "indirizzoesazione",
    "indirizzosedelegale",
    "indirizzofornitura",
    "indirizzoesazionemodificato",
    "indirizzolegalemodificato",
    "conferma",
    "pod",
    "letturacliente",
    "nuovotentativo",
    "appuntamento",
    "letturareclamo",
    "dtricezionerichiesta",
    "dtdanoneseguireprimadel",
    "dtdecorrenza",
    "note",
    "stagionalericorrente",
    "tipoconnessione",
    "tipologiavoltura",
    "mandatoconnessione",
    "sollevamentopersone",
    "attivazionefuoriorario",
    "disattivazionefuoriorario",
    "serviziocurvecarico",
    "cdreclamo",
    "cdareapred",
    "cdviapred",
    "distanzaspostamento",
    "cdprotocollo",
    "poddaunificare",
    "datitecnicirichiesti",
    "modificaoccasionale",
    "categoriacliente",
    "residenza",
    "particolarimodalitafatt",
    "serviziocurvecaricogiornal",
    "tiporichiestaserviziocurve",
    "nrpoddarealizzare",
    "disagiato",
    "presa",
    "tipologiamercato",
    "priorita",
    "continuitaconsumi",
    "dtfinefornitura",
    "tipologiautente",
    "trader",
    "precheck",
    "consumoannuo",
    "profilo",
    "cdofferta",
    "morositabloccante",
    "annullamento",
    "appuntamentocliente",
    "dtaccettazionepreventivo",
    "allegati",
    "contestazione",
    "inviodl",
    "potenzaattuale",
    "potenzarichiesta",
    "tensioneattuale",
    "tensionerichiesta",
    "daticommercialiattuali",
    "daticommercialirichiesta",
    "tributi",
    "autocertificazioni",
    "disalimentabilita",
    "recesso",
    "contrattodispacciamento",
    "tipologiarisoluzione",
    "datafirmacontratto",
    "acquistocredito",
    "timoe",
    "revoca",
    "cdpraticaprecheck",
    "datavaliditaresidenza",
    "codiceufficio",
    "pagamentoiva",
    "codiceprestazione",
    "tipologiarichiesta",
    "importomorosita",
    "soggettodivendita"
})
public class TITSEEEOUTREQType {

    @XmlElement(name = "TRACKING", required = true)
    protected TITRACKINGType tracking;
    @XmlElement(name = "CLIENTE", required = true)
    protected TICLIENTEType cliente;
    @XmlElement(name = "CLIENTE_ESAZIONE", required = true)
    protected TICLIENTEType clienteesazione;
    @XmlElement(name = "CLIENTE_USCENTE", required = true)
    protected TICLIENTEType clienteuscente;
    @XmlElement(name = "CLIENTE_CONTATTO", required = true)
    protected TICLIENTEType clientecontatto;
    @XmlElement(name = "CLIENTE_REFERENTE", required = true)
    protected TICLIENTEType clientereferente;
    @XmlElement(name = "CLIENTE_MODIFICATO", required = true)
    protected TICLIENTEType clientemodificato;
    @XmlElement(name = "PRESENZA_CLIENTE", required = true)
    protected String presenzacliente;
    @XmlElement(name = "INDIRIZZO_ESAZIONE", required = true)
    protected TIINDIRIZZOType indirizzoesazione;
    @XmlElement(name = "INDIRIZZO_SEDE_LEGALE", required = true)
    protected TIINDIRIZZOType indirizzosedelegale;
    @XmlElement(name = "INDIRIZZO_FORNITURA", required = true)
    protected TIINDIRIZZOType indirizzofornitura;
    @XmlElement(name = "INDIRIZZO_ESAZIONE_MODIFICATO", required = true)
    protected TIINDIRIZZOType indirizzoesazionemodificato;
    @XmlElement(name = "INDIRIZZO_LEGALE_MODIFICATO", required = true)
    protected TIINDIRIZZOType indirizzolegalemodificato;
    @XmlElement(name = "CONFERMA", required = true)
    protected String conferma;
    @XmlElement(name = "POD", required = true)
    protected String pod;
    @XmlElement(name = "LETTURA_CLIENTE", required = true)
    protected TILETTURAEEType letturacliente;
    @XmlElement(name = "NUOVO_TENTATIVO", required = true)
    protected String nuovotentativo;
    @XmlElement(name = "APPUNTAMENTO", required = true)
    protected String appuntamento;
    @XmlElement(name = "LETTURA_RECLAMO", required = true)
    protected TILETTURAEEType letturareclamo;
    @XmlElement(name = "DT_RICEZIONE_RICHIESTA", required = true)
    protected String dtricezionerichiesta;
    @XmlElement(name = "DT_DA_NON_ESEGUIRE_PRIMA_DEL", required = true)
    protected String dtdanoneseguireprimadel;
    @XmlElement(name = "DT_DECORRENZA", required = true)
    protected String dtdecorrenza;
    @XmlElement(name = "NOTE", required = true)
    protected String note;
    @XmlElement(name = "STAGIONALE_RICORRENTE", required = true)
    protected TISTAGIONALERICORRENTEType stagionalericorrente;
    @XmlElement(name = "TIPO_CONNESSIONE", required = true)
    protected String tipoconnessione;
    @XmlElement(name = "TIPOLOGIA_VOLTURA", required = true)
    protected String tipologiavoltura;
    @XmlElement(name = "MANDATO_CONNESSIONE", required = true)
    protected String mandatoconnessione;
    @XmlElement(name = "SOLLEVAMENTO_PERSONE", required = true)
    protected String sollevamentopersone;
    @XmlElement(name = "ATTIVAZIONE_FUORI_ORARIO", required = true)
    protected String attivazionefuoriorario;
    @XmlElement(name = "DISATTIVAZIONE_FUORI_ORARIO", required = true)
    protected String disattivazionefuoriorario;
    @XmlElement(name = "SERVIZIO_CURVE_CARICO", required = true)
    protected String serviziocurvecarico;
    @XmlElement(name = "CD_RECLAMO", required = true)
    protected String cdreclamo;
    @XmlElement(name = "CD_AREA_PRED", required = true)
    protected String cdareapred;
    @XmlElement(name = "CD_VIA_PRED", required = true)
    protected String cdviapred;
    @XmlElement(name = "DISTANZA_SPOSTAMENTO", required = true)
    protected String distanzaspostamento;
    @XmlElement(name = "CD_PROTOCOLLO", required = true)
    protected String cdprotocollo;
    @XmlElement(name = "POD_DA_UNIFICARE")
    protected List<TIPODDAUNIFICAREType> poddaunificare;
    @XmlElement(name = "DATI_TECNICI_RICHIESTI", required = true)
    protected String datitecnicirichiesti;
    @XmlElement(name = "MODIFICA_OCCASIONALE", required = true)
    protected String modificaoccasionale;
    @XmlElement(name = "CATEGORIA_CLIENTE", required = true)
    protected String categoriacliente;
    @XmlElement(name = "RESIDENZA", required = true)
    protected String residenza;
    @XmlElement(name = "PARTICOLARI_MODALITA_FATT", required = true)
    protected String particolarimodalitafatt;
    @XmlElement(name = "SERVIZIO_CURVE_CARICO_GIORNAL", required = true)
    protected String serviziocurvecaricogiornal;
    @XmlElement(name = "TIPO_RICHIESTA_SERVIZIO_CURVE", required = true)
    protected String tiporichiestaserviziocurve;
    @XmlElement(name = "NR_POD_DA_REALIZZARE", required = true)
    protected String nrpoddarealizzare;
    @XmlElement(name = "DISAGIATO", required = true)
    protected String disagiato;
    @XmlElement(name = "PRESA", required = true)
    protected String presa;
    @XmlElement(name = "TIPOLOGIA_MERCATO", required = true)
    protected String tipologiamercato;
    @XmlElement(name = "PRIORITA", required = true)
    protected String priorita;
    @XmlElement(name = "CONTINUITA_CONSUMI", required = true)
    protected String continuitaconsumi;
    @XmlElement(name = "DT_FINE_FORNITURA", required = true)
    protected String dtfinefornitura;
    @XmlElement(name = "TIPOLOGIA_UTENTE", required = true)
    protected String tipologiautente;
    @XmlElement(name = "TRADER", required = true)
    protected String trader;
    @XmlElement(name = "PRECHECK", required = true)
    protected String precheck;
    @XmlElement(name = "CONSUMO_ANNUO", required = true)
    protected String consumoannuo;
    @XmlElement(name = "PROFILO", required = true)
    protected String profilo;
    @XmlElement(name = "CD_OFFERTA", required = true)
    protected String cdofferta;
    @XmlElement(name = "MOROSITA_BLOCCANTE", required = true)
    protected String morositabloccante;
    @XmlElement(name = "ANNULLAMENTO", required = true)
    protected TIANNULLAMENTOType annullamento;
    @XmlElement(name = "APPUNTAMENTO_CLIENTE", required = true)
    protected TIAPPUNTAMENTOType appuntamentocliente;
    @XmlElement(name = "DT_ACCETTAZIONE_PREVENTIVO", required = true)
    protected String dtaccettazionepreventivo;
    @XmlElement(name = "ALLEGATI")
    protected List<TIALLEGATOType> allegati;
    @XmlElement(name = "CONTESTAZIONE", required = true)
    protected TICONTESTAZIONEType contestazione;
    @XmlElement(name = "INVIO_DL", required = true)
    protected String inviodl;
    @XmlElement(name = "POTENZA_ATTUALE", required = true)
    protected TIPOTENZAType potenzaattuale;
    @XmlElement(name = "POTENZA_RICHIESTA", required = true)
    protected TIPOTENZAType potenzarichiesta;
    @XmlElement(name = "TENSIONE_ATTUALE", required = true)
    protected TITENSIONEType tensioneattuale;
    @XmlElement(name = "TENSIONE_RICHIESTA", required = true)
    protected TITENSIONEType tensionerichiesta;
    @XmlElement(name = "DATI_COMMERCIALI_ATTUALI", required = true)
    protected TIDATICOMMERCIALIType daticommercialiattuali;
    @XmlElement(name = "DATI_COMMERCIALI_RICHIESTA", required = true)
    protected TIDATICOMMERCIALIType daticommercialirichiesta;
    @XmlElement(name = "TRIBUTI", required = true)
    protected TITRIBUTIType tributi;
    @XmlElement(name = "AUTOCERTIFICAZIONI", required = true)
    protected TIAUTOCERTIFICAZIONIType autocertificazioni;
    @XmlElement(name = "DISALIMENTABILITA", required = true)
    protected TIDISALIMENTABILITAType disalimentabilita;
    @XmlElement(name = "RECESSO", required = true)
    protected TIRECESSOType recesso;
    @XmlElement(name = "CONTRATTO_DISPACCIAMENTO", required = true)
    protected String contrattodispacciamento;
    @XmlElement(name = "TIPOLOGIA_RISOLUZIONE", required = true)
    protected String tipologiarisoluzione;
    @XmlElement(name = "DATA_FIRMA_CONTRATTO", required = true)
    protected String datafirmacontratto;
    @XmlElement(name = "ACQUISTO_CREDITO", required = true)
    protected String acquistocredito;
    @XmlElement(name = "TIMOE", required = true)
    protected String timoe;
    @XmlElement(name = "REVOCA", required = true)
    protected String revoca;
    @XmlElement(name = "CD_PRATICA_PRECHECK", required = true)
    protected String cdpraticaprecheck;
    @XmlElement(name = "DATA_VALIDITA_RESIDENZA", required = true)
    protected String datavaliditaresidenza;
    @XmlElement(name = "CODICE_UFFICIO", required = true)
    protected String codiceufficio;
    @XmlElement(name = "PAGAMENTO_IVA", required = true)
    protected String pagamentoiva;
    @XmlElement(name = "CODICE_PRESTAZIONE", required = true)
    protected String codiceprestazione;
    @XmlElement(name = "TIPOLOGIA_RICHIESTA", required = true)
    protected String tipologiarichiesta;
    @XmlElement(name = "IMPORTO_MOROSITA", required = true)
    protected String importomorosita;
    @XmlElement(name = "SOGGETTO_DI_VENDITA", required = true)
    protected TISOGGETTODIVENDITAType soggettodivendita;

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
     * Recupera il valore della proprietà clientecontatto.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTECONTATTO() {
        return clientecontatto;
    }

    /**
     * Imposta il valore della proprietà clientecontatto.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTECONTATTO(TICLIENTEType value) {
        this.clientecontatto = value;
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
     * Recupera il valore della proprietà clientemodificato.
     * 
     * @return
     *     possible object is
     *     {@link TICLIENTEType }
     *     
     */
    public TICLIENTEType getCLIENTEMODIFICATO() {
        return clientemodificato;
    }

    /**
     * Imposta il valore della proprietà clientemodificato.
     * 
     * @param value
     *     allowed object is
     *     {@link TICLIENTEType }
     *     
     */
    public void setCLIENTEMODIFICATO(TICLIENTEType value) {
        this.clientemodificato = value;
    }

    /**
     * Recupera il valore della proprietà presenzacliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESENZACLIENTE() {
        return presenzacliente;
    }

    /**
     * Imposta il valore della proprietà presenzacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESENZACLIENTE(String value) {
        this.presenzacliente = value;
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
     * Recupera il valore della proprietà indirizzoesazionemodificato.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOESAZIONEMODIFICATO() {
        return indirizzoesazionemodificato;
    }

    /**
     * Imposta il valore della proprietà indirizzoesazionemodificato.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOESAZIONEMODIFICATO(TIINDIRIZZOType value) {
        this.indirizzoesazionemodificato = value;
    }

    /**
     * Recupera il valore della proprietà indirizzolegalemodificato.
     * 
     * @return
     *     possible object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public TIINDIRIZZOType getINDIRIZZOLEGALEMODIFICATO() {
        return indirizzolegalemodificato;
    }

    /**
     * Imposta il valore della proprietà indirizzolegalemodificato.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINDIRIZZOType }
     *     
     */
    public void setINDIRIZZOLEGALEMODIFICATO(TIINDIRIZZOType value) {
        this.indirizzolegalemodificato = value;
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
     * Recupera il valore della proprietà pod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOD() {
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
    public void setPOD(String value) {
        this.pod = value;
    }

    /**
     * Recupera il valore della proprietà letturacliente.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAEEType }
     *     
     */
    public TILETTURAEEType getLETTURACLIENTE() {
        return letturacliente;
    }

    /**
     * Imposta il valore della proprietà letturacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAEEType }
     *     
     */
    public void setLETTURACLIENTE(TILETTURAEEType value) {
        this.letturacliente = value;
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
     * Recupera il valore della proprietà letturareclamo.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAEEType }
     *     
     */
    public TILETTURAEEType getLETTURARECLAMO() {
        return letturareclamo;
    }

    /**
     * Imposta il valore della proprietà letturareclamo.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAEEType }
     *     
     */
    public void setLETTURARECLAMO(TILETTURAEEType value) {
        this.letturareclamo = value;
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
     * Recupera il valore della proprietà dtdanoneseguireprimadel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDANONESEGUIREPRIMADEL() {
        return dtdanoneseguireprimadel;
    }

    /**
     * Imposta il valore della proprietà dtdanoneseguireprimadel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDANONESEGUIREPRIMADEL(String value) {
        this.dtdanoneseguireprimadel = value;
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
     * Recupera il valore della proprietà stagionalericorrente.
     * 
     * @return
     *     possible object is
     *     {@link TISTAGIONALERICORRENTEType }
     *     
     */
    public TISTAGIONALERICORRENTEType getSTAGIONALERICORRENTE() {
        return stagionalericorrente;
    }

    /**
     * Imposta il valore della proprietà stagionalericorrente.
     * 
     * @param value
     *     allowed object is
     *     {@link TISTAGIONALERICORRENTEType }
     *     
     */
    public void setSTAGIONALERICORRENTE(TISTAGIONALERICORRENTEType value) {
        this.stagionalericorrente = value;
    }

    /**
     * Recupera il valore della proprietà tipoconnessione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCONNESSIONE() {
        return tipoconnessione;
    }

    /**
     * Imposta il valore della proprietà tipoconnessione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCONNESSIONE(String value) {
        this.tipoconnessione = value;
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
     * Recupera il valore della proprietà mandatoconnessione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDATOCONNESSIONE() {
        return mandatoconnessione;
    }

    /**
     * Imposta il valore della proprietà mandatoconnessione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDATOCONNESSIONE(String value) {
        this.mandatoconnessione = value;
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
     * Recupera il valore della proprietà attivazionefuoriorario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTIVAZIONEFUORIORARIO() {
        return attivazionefuoriorario;
    }

    /**
     * Imposta il valore della proprietà attivazionefuoriorario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTIVAZIONEFUORIORARIO(String value) {
        this.attivazionefuoriorario = value;
    }

    /**
     * Recupera il valore della proprietà disattivazionefuoriorario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISATTIVAZIONEFUORIORARIO() {
        return disattivazionefuoriorario;
    }

    /**
     * Imposta il valore della proprietà disattivazionefuoriorario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISATTIVAZIONEFUORIORARIO(String value) {
        this.disattivazionefuoriorario = value;
    }

    /**
     * Recupera il valore della proprietà serviziocurvecarico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVIZIOCURVECARICO() {
        return serviziocurvecarico;
    }

    /**
     * Imposta il valore della proprietà serviziocurvecarico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVIZIOCURVECARICO(String value) {
        this.serviziocurvecarico = value;
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
     * Recupera il valore della proprietà cdareapred.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAREAPRED() {
        return cdareapred;
    }

    /**
     * Imposta il valore della proprietà cdareapred.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAREAPRED(String value) {
        this.cdareapred = value;
    }

    /**
     * Recupera il valore della proprietà cdviapred.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDVIAPRED() {
        return cdviapred;
    }

    /**
     * Imposta il valore della proprietà cdviapred.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDVIAPRED(String value) {
        this.cdviapred = value;
    }

    /**
     * Recupera il valore della proprietà distanzaspostamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTANZASPOSTAMENTO() {
        return distanzaspostamento;
    }

    /**
     * Imposta il valore della proprietà distanzaspostamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTANZASPOSTAMENTO(String value) {
        this.distanzaspostamento = value;
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
     * Gets the value of the poddaunificare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poddaunificare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPODDAUNIFICARE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIPODDAUNIFICAREType }
     * 
     * 
     */
    public List<TIPODDAUNIFICAREType> getPODDAUNIFICARE() {
        if (poddaunificare == null) {
            poddaunificare = new ArrayList<TIPODDAUNIFICAREType>();
        }
        return this.poddaunificare;
    }

    /**
     * Recupera il valore della proprietà datitecnicirichiesti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATITECNICIRICHIESTI() {
        return datitecnicirichiesti;
    }

    /**
     * Imposta il valore della proprietà datitecnicirichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATITECNICIRICHIESTI(String value) {
        this.datitecnicirichiesti = value;
    }

    /**
     * Recupera il valore della proprietà modificaoccasionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFICAOCCASIONALE() {
        return modificaoccasionale;
    }

    /**
     * Imposta il valore della proprietà modificaoccasionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICAOCCASIONALE(String value) {
        this.modificaoccasionale = value;
    }

    /**
     * Recupera il valore della proprietà categoriacliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIACLIENTE() {
        return categoriacliente;
    }

    /**
     * Imposta il valore della proprietà categoriacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIACLIENTE(String value) {
        this.categoriacliente = value;
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
     * Recupera il valore della proprietà particolarimodalitafatt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTICOLARIMODALITAFATT() {
        return particolarimodalitafatt;
    }

    /**
     * Imposta il valore della proprietà particolarimodalitafatt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTICOLARIMODALITAFATT(String value) {
        this.particolarimodalitafatt = value;
    }

    /**
     * Recupera il valore della proprietà serviziocurvecaricogiornal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVIZIOCURVECARICOGIORNAL() {
        return serviziocurvecaricogiornal;
    }

    /**
     * Imposta il valore della proprietà serviziocurvecaricogiornal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVIZIOCURVECARICOGIORNAL(String value) {
        this.serviziocurvecaricogiornal = value;
    }

    /**
     * Recupera il valore della proprietà tiporichiestaserviziocurve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPORICHIESTASERVIZIOCURVE() {
        return tiporichiestaserviziocurve;
    }

    /**
     * Imposta il valore della proprietà tiporichiestaserviziocurve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPORICHIESTASERVIZIOCURVE(String value) {
        this.tiporichiestaserviziocurve = value;
    }

    /**
     * Recupera il valore della proprietà nrpoddarealizzare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRPODDAREALIZZARE() {
        return nrpoddarealizzare;
    }

    /**
     * Imposta il valore della proprietà nrpoddarealizzare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRPODDAREALIZZARE(String value) {
        this.nrpoddarealizzare = value;
    }

    /**
     * Recupera il valore della proprietà disagiato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISAGIATO() {
        return disagiato;
    }

    /**
     * Imposta il valore della proprietà disagiato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISAGIATO(String value) {
        this.disagiato = value;
    }

    /**
     * Recupera il valore della proprietà presa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESA() {
        return presa;
    }

    /**
     * Imposta il valore della proprietà presa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESA(String value) {
        this.presa = value;
    }

    /**
     * Recupera il valore della proprietà tipologiamercato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIAMERCATO() {
        return tipologiamercato;
    }

    /**
     * Imposta il valore della proprietà tipologiamercato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIAMERCATO(String value) {
        this.tipologiamercato = value;
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
     * Recupera il valore della proprietà continuitaconsumi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTINUITACONSUMI() {
        return continuitaconsumi;
    }

    /**
     * Imposta il valore della proprietà continuitaconsumi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTINUITACONSUMI(String value) {
        this.continuitaconsumi = value;
    }

    /**
     * Recupera il valore della proprietà dtfinefornitura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTFINEFORNITURA() {
        return dtfinefornitura;
    }

    /**
     * Imposta il valore della proprietà dtfinefornitura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTFINEFORNITURA(String value) {
        this.dtfinefornitura = value;
    }

    /**
     * Recupera il valore della proprietà tipologiautente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIAUTENTE() {
        return tipologiautente;
    }

    /**
     * Imposta il valore della proprietà tipologiautente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIAUTENTE(String value) {
        this.tipologiautente = value;
    }

    /**
     * Recupera il valore della proprietà trader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRADER() {
        return trader;
    }

    /**
     * Imposta il valore della proprietà trader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRADER(String value) {
        this.trader = value;
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
     * Recupera il valore della proprietà consumoannuo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSUMOANNUO() {
        return consumoannuo;
    }

    /**
     * Imposta il valore della proprietà consumoannuo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSUMOANNUO(String value) {
        this.consumoannuo = value;
    }

    /**
     * Recupera il valore della proprietà profilo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILO() {
        return profilo;
    }

    /**
     * Imposta il valore della proprietà profilo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILO(String value) {
        this.profilo = value;
    }

    /**
     * Recupera il valore della proprietà cdofferta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDOFFERTA() {
        return cdofferta;
    }

    /**
     * Imposta il valore della proprietà cdofferta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDOFFERTA(String value) {
        this.cdofferta = value;
    }

    /**
     * Recupera il valore della proprietà morositabloccante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOROSITABLOCCANTE() {
        return morositabloccante;
    }

    /**
     * Imposta il valore della proprietà morositabloccante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOROSITABLOCCANTE(String value) {
        this.morositabloccante = value;
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
     * Gets the value of the allegati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALLEGATI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIALLEGATOType }
     * 
     * 
     */
    public List<TIALLEGATOType> getALLEGATI() {
        if (allegati == null) {
            allegati = new ArrayList<TIALLEGATOType>();
        }
        return this.allegati;
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
     * Recupera il valore della proprietà inviodl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVIODL() {
        return inviodl;
    }

    /**
     * Imposta il valore della proprietà inviodl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVIODL(String value) {
        this.inviodl = value;
    }

    /**
     * Recupera il valore della proprietà potenzaattuale.
     * 
     * @return
     *     possible object is
     *     {@link TIPOTENZAType }
     *     
     */
    public TIPOTENZAType getPOTENZAATTUALE() {
        return potenzaattuale;
    }

    /**
     * Imposta il valore della proprietà potenzaattuale.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOTENZAType }
     *     
     */
    public void setPOTENZAATTUALE(TIPOTENZAType value) {
        this.potenzaattuale = value;
    }

    /**
     * Recupera il valore della proprietà potenzarichiesta.
     * 
     * @return
     *     possible object is
     *     {@link TIPOTENZAType }
     *     
     */
    public TIPOTENZAType getPOTENZARICHIESTA() {
        return potenzarichiesta;
    }

    /**
     * Imposta il valore della proprietà potenzarichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOTENZAType }
     *     
     */
    public void setPOTENZARICHIESTA(TIPOTENZAType value) {
        this.potenzarichiesta = value;
    }

    /**
     * Recupera il valore della proprietà tensioneattuale.
     * 
     * @return
     *     possible object is
     *     {@link TITENSIONEType }
     *     
     */
    public TITENSIONEType getTENSIONEATTUALE() {
        return tensioneattuale;
    }

    /**
     * Imposta il valore della proprietà tensioneattuale.
     * 
     * @param value
     *     allowed object is
     *     {@link TITENSIONEType }
     *     
     */
    public void setTENSIONEATTUALE(TITENSIONEType value) {
        this.tensioneattuale = value;
    }

    /**
     * Recupera il valore della proprietà tensionerichiesta.
     * 
     * @return
     *     possible object is
     *     {@link TITENSIONEType }
     *     
     */
    public TITENSIONEType getTENSIONERICHIESTA() {
        return tensionerichiesta;
    }

    /**
     * Imposta il valore della proprietà tensionerichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link TITENSIONEType }
     *     
     */
    public void setTENSIONERICHIESTA(TITENSIONEType value) {
        this.tensionerichiesta = value;
    }

    /**
     * Recupera il valore della proprietà daticommercialiattuali.
     * 
     * @return
     *     possible object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public TIDATICOMMERCIALIType getDATICOMMERCIALIATTUALI() {
        return daticommercialiattuali;
    }

    /**
     * Imposta il valore della proprietà daticommercialiattuali.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public void setDATICOMMERCIALIATTUALI(TIDATICOMMERCIALIType value) {
        this.daticommercialiattuali = value;
    }

    /**
     * Recupera il valore della proprietà daticommercialirichiesta.
     * 
     * @return
     *     possible object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public TIDATICOMMERCIALIType getDATICOMMERCIALIRICHIESTA() {
        return daticommercialirichiesta;
    }

    /**
     * Imposta il valore della proprietà daticommercialirichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public void setDATICOMMERCIALIRICHIESTA(TIDATICOMMERCIALIType value) {
        this.daticommercialirichiesta = value;
    }

    /**
     * Recupera il valore della proprietà tributi.
     * 
     * @return
     *     possible object is
     *     {@link TITRIBUTIType }
     *     
     */
    public TITRIBUTIType getTRIBUTI() {
        return tributi;
    }

    /**
     * Imposta il valore della proprietà tributi.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRIBUTIType }
     *     
     */
    public void setTRIBUTI(TITRIBUTIType value) {
        this.tributi = value;
    }

    /**
     * Recupera il valore della proprietà autocertificazioni.
     * 
     * @return
     *     possible object is
     *     {@link TIAUTOCERTIFICAZIONIType }
     *     
     */
    public TIAUTOCERTIFICAZIONIType getAUTOCERTIFICAZIONI() {
        return autocertificazioni;
    }

    /**
     * Imposta il valore della proprietà autocertificazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAUTOCERTIFICAZIONIType }
     *     
     */
    public void setAUTOCERTIFICAZIONI(TIAUTOCERTIFICAZIONIType value) {
        this.autocertificazioni = value;
    }

    /**
     * Recupera il valore della proprietà disalimentabilita.
     * 
     * @return
     *     possible object is
     *     {@link TIDISALIMENTABILITAType }
     *     
     */
    public TIDISALIMENTABILITAType getDISALIMENTABILITA() {
        return disalimentabilita;
    }

    /**
     * Imposta il valore della proprietà disalimentabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDISALIMENTABILITAType }
     *     
     */
    public void setDISALIMENTABILITA(TIDISALIMENTABILITAType value) {
        this.disalimentabilita = value;
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
     * Recupera il valore della proprietà contrattodispacciamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRATTODISPACCIAMENTO() {
        return contrattodispacciamento;
    }

    /**
     * Imposta il valore della proprietà contrattodispacciamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRATTODISPACCIAMENTO(String value) {
        this.contrattodispacciamento = value;
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
     * Recupera il valore della proprietà datafirmacontratto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAFIRMACONTRATTO() {
        return datafirmacontratto;
    }

    /**
     * Imposta il valore della proprietà datafirmacontratto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAFIRMACONTRATTO(String value) {
        this.datafirmacontratto = value;
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
     * Recupera il valore della proprietà timoe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMOE() {
        return timoe;
    }

    /**
     * Imposta il valore della proprietà timoe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMOE(String value) {
        this.timoe = value;
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

}
