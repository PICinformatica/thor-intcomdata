
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_EE_INB_REQType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_EE_INB_REQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRACKING" type="{}T_I_TRACKINGType"/>
 *         &lt;element name="AREA_GEST_USCENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AMMISSIBILITA" type="{}T_I_AMMISSIBILITAType"/>
 *         &lt;element name="PREVENTIVO" type="{}T_I_DATI_TECNICI_PREVENTIVOType"/>
 *         &lt;element name="TIPO_INTERVENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESITO" type="{}T_I_ESITOType"/>
 *         &lt;element name="POD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_ESEC_LAVORO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_INVIO_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_DECORRENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESITO_VERIFICA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INDIRIZZO_FORNITURA" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_ESAZIONE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_SEDE_LEGALE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="APPUNTAMENTO_DL" type="{}T_I_APPUNTAMENTOType"/>
 *         &lt;element name="ANNULLAMENTO" type="{}T_I_ANNULLAMENTOType"/>
 *         &lt;element name="ALLEGATI" type="{}T_I_ALLEGATOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POTENZA_ATTUALE" type="{}T_I_POTENZAType"/>
 *         &lt;element name="POTENZA_RICHIESTA" type="{}T_I_POTENZAType"/>
 *         &lt;element name="TENSIONE_ATTUALE" type="{}T_I_TENSIONEType"/>
 *         &lt;element name="TENSIONE_RICHIESTA" type="{}T_I_TENSIONEType"/>
 *         &lt;element name="CLIENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_REFERENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="STAGIONALE_RICORRENTE" type="{}T_I_STAGIONALE_RICORRENTEType"/>
 *         &lt;element name="CD_AUTHORITY_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CANALE_COMUNICAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APPUNTAMENTO_NECESSARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LISTA_POD" type="{}T_I_POD_DA_UNIFICAREType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MISURATORE" type="{}T_I_DATI_TECNICI_LETTURA_EEType"/>
 *         &lt;element name="SOSTITUZIONE_MISURATORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MISURATORE_RIMOSSO" type="{}T_I_DATI_TECNICI_LETTURA_EEType"/>
 *         &lt;element name="ADDEBITO_ONERI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIFERIMENTO_RESOCONTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_RINTRACCIABILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACCERT_VAL_NON_CORRETTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIFERIMENTO_QUESITI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTRIBUTO_RIDOTTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_PREV_RIPRIST_LAVORI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_TECNICI_RICHIESTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_COMMERCIALI" type="{}T_I_DATI_COMMERCIALIType"/>
 *         &lt;element name="ACCISE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDIZIONALE_COMUNALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDIZIONALE_PROVINCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOTIVO_ANNULLAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARTICOLATI_MODALITA_FATT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUOVA_TIPOLOGIA_INTERVENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POD_SOSPESO_CMOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESTAZIONI_APERTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REVOCA_SOSPENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RICHIESTA_SOSP_MOROSITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIDUZIONE_POTENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PREDETERMINABILITA" type="{}T_I_PREDETERMINABILITAType"/>
 *         &lt;element name="TIPOLOGIA_MERCATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLT_SUB_ATT_CONTESTUALI">
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
 *         &lt;element name="EVENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIMOE" type="{}T_I_TIMOEType"/>
 *         &lt;element name="TRADER" type="{}T_I_TRADERType"/>
 *         &lt;element name="CRPP" type="{}T_I_CRPPType"/>
 *         &lt;element name="ID_RDA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID_RDL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSALE_KO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PMA_POD">
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
@XmlType(name = "T_I_TSE_EE_INB_REQType", propOrder = {
    "tracking",
    "areagestuscente",
    "ammissibilita",
    "preventivo",
    "tipointervento",
    "esito",
    "pod",
    "dteseclavoro",
    "dtinviodl",
    "dtdecorrenza",
    "esitoverifica",
    "indirizzofornitura",
    "indirizzoesazione",
    "indirizzosedelegale",
    "appuntamentodl",
    "annullamento",
    "allegati",
    "potenzaattuale",
    "potenzarichiesta",
    "tensioneattuale",
    "tensionerichiesta",
    "cliente",
    "clientereferente",
    "stagionalericorrente",
    "cdauthoritydl",
    "canalecomunicazione",
    "appuntamentonecessario",
    "listapod",
    "misuratore",
    "sostituzionemisuratore",
    "misuratorerimosso",
    "addebitooneri",
    "riferimentoresoconto",
    "cdrintracciabilita",
    "accertvalnoncorretti",
    "riferimentoquesiti",
    "contributoridotto",
    "dtprevripristlavori",
    "datitecnicirichiesti",
    "note",
    "daticommerciali",
    "accise",
    "addizionalecomunale",
    "addizionaleprovinciale",
    "motivoannullamento",
    "particolatimodalitafatt",
    "nuovatipologiaintervento",
    "podsospesocmor",
    "presa",
    "prestazioniaperte",
    "revocasospensione",
    "richiestasospmorosita",
    "riduzionepotenza",
    "predeterminabilita",
    "tipologiamercato",
    "voltsubattcontestuali",
    "utente",
    "evento",
    "timoe",
    "trader",
    "crpp",
    "idrda",
    "idrdl",
    "causaleko",
    "pmapod"
})
public class TITSEEEINBREQType {

    @XmlElement(name = "TRACKING", required = true)
    protected TITRACKINGType tracking;
    @XmlElement(name = "AREA_GEST_USCENTE", required = true)
    protected String areagestuscente;
    @XmlElement(name = "AMMISSIBILITA", required = true)
    protected TIAMMISSIBILITAType ammissibilita;
    @XmlElement(name = "PREVENTIVO", required = true)
    protected TIDATITECNICIPREVENTIVOType preventivo;
    @XmlElement(name = "TIPO_INTERVENTO", required = true)
    protected String tipointervento;
    @XmlElement(name = "ESITO", required = true)
    protected TIESITOType esito;
    @XmlElement(name = "POD", required = true)
    protected String pod;
    @XmlElement(name = "DT_ESEC_LAVORO", required = true)
    protected String dteseclavoro;
    @XmlElement(name = "DT_INVIO_DL", required = true)
    protected String dtinviodl;
    @XmlElement(name = "DT_DECORRENZA", required = true)
    protected String dtdecorrenza;
    @XmlElement(name = "ESITO_VERIFICA", required = true)
    protected String esitoverifica;
    @XmlElement(name = "INDIRIZZO_FORNITURA", required = true)
    protected TIINDIRIZZOType indirizzofornitura;
    @XmlElement(name = "INDIRIZZO_ESAZIONE", required = true)
    protected TIINDIRIZZOType indirizzoesazione;
    @XmlElement(name = "INDIRIZZO_SEDE_LEGALE", required = true)
    protected TIINDIRIZZOType indirizzosedelegale;
    @XmlElement(name = "APPUNTAMENTO_DL", required = true)
    protected TIAPPUNTAMENTOType appuntamentodl;
    @XmlElement(name = "ANNULLAMENTO", required = true)
    protected TIANNULLAMENTOType annullamento;
    @XmlElement(name = "ALLEGATI")
    protected List<TIALLEGATOType> allegati;
    @XmlElement(name = "POTENZA_ATTUALE", required = true)
    protected TIPOTENZAType potenzaattuale;
    @XmlElement(name = "POTENZA_RICHIESTA", required = true)
    protected TIPOTENZAType potenzarichiesta;
    @XmlElement(name = "TENSIONE_ATTUALE", required = true)
    protected TITENSIONEType tensioneattuale;
    @XmlElement(name = "TENSIONE_RICHIESTA", required = true)
    protected TITENSIONEType tensionerichiesta;
    @XmlElement(name = "CLIENTE", required = true)
    protected TICLIENTEType cliente;
    @XmlElement(name = "CLIENTE_REFERENTE", required = true)
    protected TICLIENTEType clientereferente;
    @XmlElement(name = "STAGIONALE_RICORRENTE", required = true)
    protected TISTAGIONALERICORRENTEType stagionalericorrente;
    @XmlElement(name = "CD_AUTHORITY_DL", required = true)
    protected String cdauthoritydl;
    @XmlElement(name = "CANALE_COMUNICAZIONE", required = true)
    protected String canalecomunicazione;
    @XmlElement(name = "APPUNTAMENTO_NECESSARIO", required = true)
    protected String appuntamentonecessario;
    @XmlElement(name = "LISTA_POD")
    protected List<TIPODDAUNIFICAREType> listapod;
    @XmlElement(name = "MISURATORE", required = true)
    protected TIDATITECNICILETTURAEEType misuratore;
    @XmlElement(name = "SOSTITUZIONE_MISURATORE", required = true)
    protected String sostituzionemisuratore;
    @XmlElement(name = "MISURATORE_RIMOSSO", required = true)
    protected TIDATITECNICILETTURAEEType misuratorerimosso;
    @XmlElement(name = "ADDEBITO_ONERI", required = true)
    protected String addebitooneri;
    @XmlElement(name = "RIFERIMENTO_RESOCONTO", required = true)
    protected String riferimentoresoconto;
    @XmlElement(name = "CD_RINTRACCIABILITA", required = true)
    protected String cdrintracciabilita;
    @XmlElement(name = "ACCERT_VAL_NON_CORRETTI", required = true)
    protected String accertvalnoncorretti;
    @XmlElement(name = "RIFERIMENTO_QUESITI", required = true)
    protected String riferimentoquesiti;
    @XmlElement(name = "CONTRIBUTO_RIDOTTO", required = true)
    protected String contributoridotto;
    @XmlElement(name = "DT_PREV_RIPRIST_LAVORI", required = true)
    protected String dtprevripristlavori;
    @XmlElement(name = "DATI_TECNICI_RICHIESTI", required = true)
    protected String datitecnicirichiesti;
    @XmlElement(name = "NOTE", required = true)
    protected String note;
    @XmlElement(name = "DATI_COMMERCIALI", required = true)
    protected TIDATICOMMERCIALIType daticommerciali;
    @XmlElement(name = "ACCISE", required = true)
    protected String accise;
    @XmlElement(name = "ADDIZIONALE_COMUNALE", required = true)
    protected String addizionalecomunale;
    @XmlElement(name = "ADDIZIONALE_PROVINCIALE", required = true)
    protected String addizionaleprovinciale;
    @XmlElement(name = "MOTIVO_ANNULLAMENTO", required = true)
    protected String motivoannullamento;
    @XmlElement(name = "PARTICOLATI_MODALITA_FATT", required = true)
    protected String particolatimodalitafatt;
    @XmlElement(name = "NUOVA_TIPOLOGIA_INTERVENTO", required = true)
    protected String nuovatipologiaintervento;
    @XmlElement(name = "POD_SOSPESO_CMOR", required = true)
    protected String podsospesocmor;
    @XmlElement(name = "PRESA", required = true)
    protected String presa;
    @XmlElement(name = "PRESTAZIONI_APERTE", required = true)
    protected String prestazioniaperte;
    @XmlElement(name = "REVOCA_SOSPENSIONE", required = true)
    protected String revocasospensione;
    @XmlElement(name = "RICHIESTA_SOSP_MOROSITA", required = true)
    protected String richiestasospmorosita;
    @XmlElement(name = "RIDUZIONE_POTENZA", required = true)
    protected String riduzionepotenza;
    @XmlElement(name = "PREDETERMINABILITA", required = true)
    protected TIPREDETERMINABILITAType predeterminabilita;
    @XmlElement(name = "TIPOLOGIA_MERCATO", required = true)
    protected String tipologiamercato;
    @XmlElement(name = "VOLT_SUB_ATT_CONTESTUALI", required = true)
    protected String voltsubattcontestuali;
    @XmlElement(name = "UTENTE", required = true)
    protected String utente;
    @XmlElement(name = "EVENTO", required = true)
    protected String evento;
    @XmlElement(name = "TIMOE", required = true)
    protected TITIMOEType timoe;
    @XmlElement(name = "TRADER", required = true)
    protected TITRADERType trader;
    @XmlElement(name = "CRPP", required = true)
    protected TICRPPType crpp;
    @XmlElement(name = "ID_RDA", required = true)
    protected String idrda;
    @XmlElement(name = "ID_RDL", required = true)
    protected String idrdl;
    @XmlElement(name = "CAUSALE_KO", required = true)
    protected String causaleko;
    @XmlElement(name = "PMA_POD", required = true)
    protected String pmapod;

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
     * Recupera il valore della proprietà areagestuscente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAGESTUSCENTE() {
        return areagestuscente;
    }

    /**
     * Imposta il valore della proprietà areagestuscente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAGESTUSCENTE(String value) {
        this.areagestuscente = value;
    }

    /**
     * Recupera il valore della proprietà ammissibilita.
     * 
     * @return
     *     possible object is
     *     {@link TIAMMISSIBILITAType }
     *     
     */
    public TIAMMISSIBILITAType getAMMISSIBILITA() {
        return ammissibilita;
    }

    /**
     * Imposta il valore della proprietà ammissibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAMMISSIBILITAType }
     *     
     */
    public void setAMMISSIBILITA(TIAMMISSIBILITAType value) {
        this.ammissibilita = value;
    }

    /**
     * Recupera il valore della proprietà preventivo.
     * 
     * @return
     *     possible object is
     *     {@link TIDATITECNICIPREVENTIVOType }
     *     
     */
    public TIDATITECNICIPREVENTIVOType getPREVENTIVO() {
        return preventivo;
    }

    /**
     * Imposta il valore della proprietà preventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATITECNICIPREVENTIVOType }
     *     
     */
    public void setPREVENTIVO(TIDATITECNICIPREVENTIVOType value) {
        this.preventivo = value;
    }

    /**
     * Recupera il valore della proprietà tipointervento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOINTERVENTO() {
        return tipointervento;
    }

    /**
     * Imposta il valore della proprietà tipointervento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOINTERVENTO(String value) {
        this.tipointervento = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link TIESITOType }
     *     
     */
    public TIESITOType getESITO() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link TIESITOType }
     *     
     */
    public void setESITO(TIESITOType value) {
        this.esito = value;
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
     * Recupera il valore della proprietà dteseclavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTESECLAVORO() {
        return dteseclavoro;
    }

    /**
     * Imposta il valore della proprietà dteseclavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTESECLAVORO(String value) {
        this.dteseclavoro = value;
    }

    /**
     * Recupera il valore della proprietà dtinviodl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTINVIODL() {
        return dtinviodl;
    }

    /**
     * Imposta il valore della proprietà dtinviodl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTINVIODL(String value) {
        this.dtinviodl = value;
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
     * Recupera il valore della proprietà esitoverifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESITOVERIFICA() {
        return esitoverifica;
    }

    /**
     * Imposta il valore della proprietà esitoverifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESITOVERIFICA(String value) {
        this.esitoverifica = value;
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
     * Recupera il valore della proprietà appuntamentodl.
     * 
     * @return
     *     possible object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public TIAPPUNTAMENTOType getAPPUNTAMENTODL() {
        return appuntamentodl;
    }

    /**
     * Imposta il valore della proprietà appuntamentodl.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public void setAPPUNTAMENTODL(TIAPPUNTAMENTOType value) {
        this.appuntamentodl = value;
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
     * Recupera il valore della proprietà cdauthoritydl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAUTHORITYDL() {
        return cdauthoritydl;
    }

    /**
     * Imposta il valore della proprietà cdauthoritydl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAUTHORITYDL(String value) {
        this.cdauthoritydl = value;
    }

    /**
     * Recupera il valore della proprietà canalecomunicazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALECOMUNICAZIONE() {
        return canalecomunicazione;
    }

    /**
     * Imposta il valore della proprietà canalecomunicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALECOMUNICAZIONE(String value) {
        this.canalecomunicazione = value;
    }

    /**
     * Recupera il valore della proprietà appuntamentonecessario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPUNTAMENTONECESSARIO() {
        return appuntamentonecessario;
    }

    /**
     * Imposta il valore della proprietà appuntamentonecessario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPUNTAMENTONECESSARIO(String value) {
        this.appuntamentonecessario = value;
    }

    /**
     * Gets the value of the listapod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPOD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIPODDAUNIFICAREType }
     * 
     * 
     */
    public List<TIPODDAUNIFICAREType> getLISTAPOD() {
        if (listapod == null) {
            listapod = new ArrayList<TIPODDAUNIFICAREType>();
        }
        return this.listapod;
    }

    /**
     * Recupera il valore della proprietà misuratore.
     * 
     * @return
     *     possible object is
     *     {@link TIDATITECNICILETTURAEEType }
     *     
     */
    public TIDATITECNICILETTURAEEType getMISURATORE() {
        return misuratore;
    }

    /**
     * Imposta il valore della proprietà misuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATITECNICILETTURAEEType }
     *     
     */
    public void setMISURATORE(TIDATITECNICILETTURAEEType value) {
        this.misuratore = value;
    }

    /**
     * Recupera il valore della proprietà sostituzionemisuratore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSTITUZIONEMISURATORE() {
        return sostituzionemisuratore;
    }

    /**
     * Imposta il valore della proprietà sostituzionemisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSTITUZIONEMISURATORE(String value) {
        this.sostituzionemisuratore = value;
    }

    /**
     * Recupera il valore della proprietà misuratorerimosso.
     * 
     * @return
     *     possible object is
     *     {@link TIDATITECNICILETTURAEEType }
     *     
     */
    public TIDATITECNICILETTURAEEType getMISURATORERIMOSSO() {
        return misuratorerimosso;
    }

    /**
     * Imposta il valore della proprietà misuratorerimosso.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATITECNICILETTURAEEType }
     *     
     */
    public void setMISURATORERIMOSSO(TIDATITECNICILETTURAEEType value) {
        this.misuratorerimosso = value;
    }

    /**
     * Recupera il valore della proprietà addebitooneri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDEBITOONERI() {
        return addebitooneri;
    }

    /**
     * Imposta il valore della proprietà addebitooneri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDEBITOONERI(String value) {
        this.addebitooneri = value;
    }

    /**
     * Recupera il valore della proprietà riferimentoresoconto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTORESOCONTO() {
        return riferimentoresoconto;
    }

    /**
     * Imposta il valore della proprietà riferimentoresoconto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTORESOCONTO(String value) {
        this.riferimentoresoconto = value;
    }

    /**
     * Recupera il valore della proprietà cdrintracciabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRINTRACCIABILITA() {
        return cdrintracciabilita;
    }

    /**
     * Imposta il valore della proprietà cdrintracciabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRINTRACCIABILITA(String value) {
        this.cdrintracciabilita = value;
    }

    /**
     * Recupera il valore della proprietà accertvalnoncorretti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCERTVALNONCORRETTI() {
        return accertvalnoncorretti;
    }

    /**
     * Imposta il valore della proprietà accertvalnoncorretti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCERTVALNONCORRETTI(String value) {
        this.accertvalnoncorretti = value;
    }

    /**
     * Recupera il valore della proprietà riferimentoquesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTOQUESITI() {
        return riferimentoquesiti;
    }

    /**
     * Imposta il valore della proprietà riferimentoquesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTOQUESITI(String value) {
        this.riferimentoquesiti = value;
    }

    /**
     * Recupera il valore della proprietà contributoridotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRIBUTORIDOTTO() {
        return contributoridotto;
    }

    /**
     * Imposta il valore della proprietà contributoridotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRIBUTORIDOTTO(String value) {
        this.contributoridotto = value;
    }

    /**
     * Recupera il valore della proprietà dtprevripristlavori.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPREVRIPRISTLAVORI() {
        return dtprevripristlavori;
    }

    /**
     * Imposta il valore della proprietà dtprevripristlavori.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPREVRIPRISTLAVORI(String value) {
        this.dtprevripristlavori = value;
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
     * Recupera il valore della proprietà daticommerciali.
     * 
     * @return
     *     possible object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public TIDATICOMMERCIALIType getDATICOMMERCIALI() {
        return daticommerciali;
    }

    /**
     * Imposta il valore della proprietà daticommerciali.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDATICOMMERCIALIType }
     *     
     */
    public void setDATICOMMERCIALI(TIDATICOMMERCIALIType value) {
        this.daticommerciali = value;
    }

    /**
     * Recupera il valore della proprietà accise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCISE() {
        return accise;
    }

    /**
     * Imposta il valore della proprietà accise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCISE(String value) {
        this.accise = value;
    }

    /**
     * Recupera il valore della proprietà addizionalecomunale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIZIONALECOMUNALE() {
        return addizionalecomunale;
    }

    /**
     * Imposta il valore della proprietà addizionalecomunale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIZIONALECOMUNALE(String value) {
        this.addizionalecomunale = value;
    }

    /**
     * Recupera il valore della proprietà addizionaleprovinciale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIZIONALEPROVINCIALE() {
        return addizionaleprovinciale;
    }

    /**
     * Imposta il valore della proprietà addizionaleprovinciale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIZIONALEPROVINCIALE(String value) {
        this.addizionaleprovinciale = value;
    }

    /**
     * Recupera il valore della proprietà motivoannullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOANNULLAMENTO() {
        return motivoannullamento;
    }

    /**
     * Imposta il valore della proprietà motivoannullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOANNULLAMENTO(String value) {
        this.motivoannullamento = value;
    }

    /**
     * Recupera il valore della proprietà particolatimodalitafatt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTICOLATIMODALITAFATT() {
        return particolatimodalitafatt;
    }

    /**
     * Imposta il valore della proprietà particolatimodalitafatt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTICOLATIMODALITAFATT(String value) {
        this.particolatimodalitafatt = value;
    }

    /**
     * Recupera il valore della proprietà nuovatipologiaintervento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUOVATIPOLOGIAINTERVENTO() {
        return nuovatipologiaintervento;
    }

    /**
     * Imposta il valore della proprietà nuovatipologiaintervento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUOVATIPOLOGIAINTERVENTO(String value) {
        this.nuovatipologiaintervento = value;
    }

    /**
     * Recupera il valore della proprietà podsospesocmor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODSOSPESOCMOR() {
        return podsospesocmor;
    }

    /**
     * Imposta il valore della proprietà podsospesocmor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODSOSPESOCMOR(String value) {
        this.podsospesocmor = value;
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
     * Recupera il valore della proprietà prestazioniaperte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESTAZIONIAPERTE() {
        return prestazioniaperte;
    }

    /**
     * Imposta il valore della proprietà prestazioniaperte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESTAZIONIAPERTE(String value) {
        this.prestazioniaperte = value;
    }

    /**
     * Recupera il valore della proprietà revocasospensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVOCASOSPENSIONE() {
        return revocasospensione;
    }

    /**
     * Imposta il valore della proprietà revocasospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVOCASOSPENSIONE(String value) {
        this.revocasospensione = value;
    }

    /**
     * Recupera il valore della proprietà richiestasospmorosita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRICHIESTASOSPMOROSITA() {
        return richiestasospmorosita;
    }

    /**
     * Imposta il valore della proprietà richiestasospmorosita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRICHIESTASOSPMOROSITA(String value) {
        this.richiestasospmorosita = value;
    }

    /**
     * Recupera il valore della proprietà riduzionepotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIDUZIONEPOTENZA() {
        return riduzionepotenza;
    }

    /**
     * Imposta il valore della proprietà riduzionepotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIDUZIONEPOTENZA(String value) {
        this.riduzionepotenza = value;
    }

    /**
     * Recupera il valore della proprietà predeterminabilita.
     * 
     * @return
     *     possible object is
     *     {@link TIPREDETERMINABILITAType }
     *     
     */
    public TIPREDETERMINABILITAType getPREDETERMINABILITA() {
        return predeterminabilita;
    }

    /**
     * Imposta il valore della proprietà predeterminabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPREDETERMINABILITAType }
     *     
     */
    public void setPREDETERMINABILITA(TIPREDETERMINABILITAType value) {
        this.predeterminabilita = value;
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
     * Recupera il valore della proprietà voltsubattcontestuali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLTSUBATTCONTESTUALI() {
        return voltsubattcontestuali;
    }

    /**
     * Imposta il valore della proprietà voltsubattcontestuali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLTSUBATTCONTESTUALI(String value) {
        this.voltsubattcontestuali = value;
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
     * Recupera il valore della proprietà evento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTO() {
        return evento;
    }

    /**
     * Imposta il valore della proprietà evento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTO(String value) {
        this.evento = value;
    }

    /**
     * Recupera il valore della proprietà timoe.
     * 
     * @return
     *     possible object is
     *     {@link TITIMOEType }
     *     
     */
    public TITIMOEType getTIMOE() {
        return timoe;
    }

    /**
     * Imposta il valore della proprietà timoe.
     * 
     * @param value
     *     allowed object is
     *     {@link TITIMOEType }
     *     
     */
    public void setTIMOE(TITIMOEType value) {
        this.timoe = value;
    }

    /**
     * Recupera il valore della proprietà trader.
     * 
     * @return
     *     possible object is
     *     {@link TITRADERType }
     *     
     */
    public TITRADERType getTRADER() {
        return trader;
    }

    /**
     * Imposta il valore della proprietà trader.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRADERType }
     *     
     */
    public void setTRADER(TITRADERType value) {
        this.trader = value;
    }

    /**
     * Recupera il valore della proprietà crpp.
     * 
     * @return
     *     possible object is
     *     {@link TICRPPType }
     *     
     */
    public TICRPPType getCRPP() {
        return crpp;
    }

    /**
     * Imposta il valore della proprietà crpp.
     * 
     * @param value
     *     allowed object is
     *     {@link TICRPPType }
     *     
     */
    public void setCRPP(TICRPPType value) {
        this.crpp = value;
    }

    /**
     * Recupera il valore della proprietà idrda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRDA() {
        return idrda;
    }

    /**
     * Imposta il valore della proprietà idrda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRDA(String value) {
        this.idrda = value;
    }

    /**
     * Recupera il valore della proprietà idrdl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRDL() {
        return idrdl;
    }

    /**
     * Imposta il valore della proprietà idrdl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRDL(String value) {
        this.idrdl = value;
    }

    /**
     * Recupera il valore della proprietà causaleko.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSALEKO() {
        return causaleko;
    }

    /**
     * Imposta il valore della proprietà causaleko.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSALEKO(String value) {
        this.causaleko = value;
    }

    /**
     * Recupera il valore della proprietà pmapod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMAPOD() {
        return pmapod;
    }

    /**
     * Imposta il valore della proprietà pmapod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMAPOD(String value) {
        this.pmapod = value;
    }

}
