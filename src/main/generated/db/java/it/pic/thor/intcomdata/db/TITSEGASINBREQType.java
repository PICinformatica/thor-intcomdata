
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_GAS_INB_REQType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_GAS_INB_REQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRACKING" type="{}T_I_TRACKINGType"/>
 *         &lt;element name="AMMISSIBILITA" type="{}T_I_AMMISSIBILITAType"/>
 *         &lt;element name="APPUNTAMENTO" type="{}T_I_APPUNTAMENTOType"/>
 *         &lt;element name="URL_ACQUISIZIONE_APPUNTAMENTO">
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
 *         &lt;element name="PREVENTIVO" type="{}T_I_DATI_TECNICI_PREVENTIVOType"/>
 *         &lt;element name="RIFERIMENTO_PREVENTIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESITO" type="{}T_I_ESITOType"/>
 *         &lt;element name="NOTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_INVIO_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLIENTE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_ESAZIONE" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="CLIENTE_BENEFICIARIO" type="{}T_I_CLIENTEType"/>
 *         &lt;element name="INDIRIZZO_FORNITURA" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_CLIENTE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_ESAZIONE" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="INDIRIZZO_BENEFICIARIO" type="{}T_I_INDIRIZZOType"/>
 *         &lt;element name="STATO_CONTATORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INSTALLAZIONE_CONTATORE">
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
 *         &lt;element name="RIMOZIONE_CONTATORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIMOZIONE_CORRETTORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTATORE" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="CONTATORE_RIMOSSO" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="CORRETTORE" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="CORRETTORE_RIMOSSO" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="ALLEGATO" type="{}T_I_ALLEGATOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PREDETERMINABILITA" type="{}T_I_PREDETERMINABILITAType"/>
 *         &lt;element name="ADDEBITO_ONERI">
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
 *         &lt;element name="PDR_CODICE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_CODICE_PROFILO_PRELIEVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_CODICE_REMI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_TECNICI" type="{}T_I_DATI_TECNICIType"/>
 *         &lt;element name="RILEVANZA_CONTINUITA_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_STATO_TECNICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESSIONE_MISURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_PORTATA_MASSIMA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_PORTATA_MINIMA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_AUTHORITY_DL">
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
 *         &lt;element name="RIFERIMENTO_COMUNICAZIONE_SOSP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANNULLAMNETO" type="{}T_I_ANNULLAMENTOType"/>
 *         &lt;element name="ATTI_AUTORIZZATIVI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO_ENERGETICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_VERIFICA" type="{}T_I_VERIFICAType"/>
 *         &lt;element name="SECONDO_APPUNTAMENTO" type="{}T_I_SECONDO_APPUNTAMENTOType"/>
 *         &lt;element name="ANNULLAMNETO_APPUNTAMENTO" type="{}T_I_ANNULLAMENTO_APPUNTAMENTOType"/>
 *         &lt;element name="DOCUMENTAZIONE" type="{}T_I_DOCUMENTAZIONEType"/>
 *         &lt;element name="DATA_TENTATIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_MAX_CONF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIFERIMENTO_RISP_QUESITI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMPOSTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_FATTURAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIF_QUESITI">
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
 *         &lt;element name="DATA_ESEC_LAVORO">
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
 *         &lt;element name="FATTIBILITA_TECNICA">
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
 *         &lt;element name="BONUS" type="{}T_I_BONUSType"/>
 *         &lt;element name="DATA_SCAD_DS_CATEGORIA_USO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTATORE_SWITCH" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="CORRETTORE_SWITCH" type="{}T_I_LETTURA_GASType"/>
 *         &lt;element name="MOROSITA_DATE_SOSPENSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOROSITA_PUNTO_CHIUSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATE_CAMBIO_TRADER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_MERCATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="TRADER" type="{}T_I_TRADERType"/>
 *         &lt;element name="PDR_INTERROTTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PDR_RIPRISTINATI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRESENZA_CMOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ATT_SERV_DEFAULT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CHIUSURA_PDR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPR_CAM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PIVA_UTENTE_BILANCIAMENTO">
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
@XmlType(name = "T_I_TSE_GAS_INB_REQType", propOrder = {
    "tracking",
    "ammissibilita",
    "appuntamento",
    "urlacquisizioneappuntamento",
    "nuovatipologiaintervento",
    "preventivo",
    "riferimentopreventivo",
    "esito",
    "note",
    "datainviodl",
    "cliente",
    "clienteesazione",
    "clientebeneficiario",
    "indirizzofornitura",
    "indirizzocliente",
    "indirizzoesazione",
    "indirizzobeneficiario",
    "statocontatore",
    "installazionecontatore",
    "installazionecorrettore",
    "rimozionecontatore",
    "rimozionecorrettore",
    "contatore",
    "contatorerimosso",
    "correttore",
    "correttorerimosso",
    "allegato",
    "predeterminabilita",
    "addebitooneri",
    "appuntamentonecessario",
    "pdrcodice",
    "pdrtipo",
    "pdrcodiceprofiloprelievo",
    "pdrcodiceremi",
    "datitecnici",
    "rilevanzacontinuitacliente",
    "pdrstatotecnico",
    "pressionemisura",
    "pdrportatamassima",
    "pdrportataminima",
    "codiceauthoritydl",
    "canalecomunicazione",
    "riferimentocomunicazionesosp",
    "annullamneto",
    "attiautorizzativi",
    "servizioenergetico",
    "dativerifica",
    "secondoappuntamento",
    "annullamnetoappuntamento",
    "documentazione",
    "datatentativo",
    "datamaxconf",
    "riferimentorispquesiti",
    "iva",
    "imposte",
    "datifatturazione",
    "rifquesiti",
    "datadecorrenza",
    "dataeseclavoro",
    "utente",
    "evento",
    "fattibilitatecnica",
    "numerotentativi",
    "bonus",
    "datascaddscategoriauso",
    "contatoreswitch",
    "correttoreswitch",
    "morositadatesospensione",
    "morositapuntochiuso",
    "datecambiotrader",
    "tipologiamercato",
    "residenza",
    "accessofui",
    "tipofornitura",
    "trader",
    "pdrinterrotti",
    "pdrripristinati",
    "presenzacmor",
    "dataattservdefault",
    "datachiusurapdr",
    "cam",
    "comprcam",
    "pivautentebilanciamento"
})
public class TITSEGASINBREQType {

    @XmlElement(name = "TRACKING", required = true)
    protected TITRACKINGType tracking;
    @XmlElement(name = "AMMISSIBILITA", required = true)
    protected TIAMMISSIBILITAType ammissibilita;
    @XmlElement(name = "APPUNTAMENTO", required = true)
    protected TIAPPUNTAMENTOType appuntamento;
    @XmlElement(name = "URL_ACQUISIZIONE_APPUNTAMENTO", required = true)
    protected String urlacquisizioneappuntamento;
    @XmlElement(name = "NUOVA_TIPOLOGIA_INTERVENTO", required = true)
    protected String nuovatipologiaintervento;
    @XmlElement(name = "PREVENTIVO", required = true)
    protected TIDATITECNICIPREVENTIVOType preventivo;
    @XmlElement(name = "RIFERIMENTO_PREVENTIVO", required = true)
    protected String riferimentopreventivo;
    @XmlElement(name = "ESITO", required = true)
    protected TIESITOType esito;
    @XmlElement(name = "NOTE", required = true)
    protected String note;
    @XmlElement(name = "DATA_INVIO_DL", required = true)
    protected String datainviodl;
    @XmlElement(name = "CLIENTE", required = true)
    protected TICLIENTEType cliente;
    @XmlElement(name = "CLIENTE_ESAZIONE", required = true)
    protected TICLIENTEType clienteesazione;
    @XmlElement(name = "CLIENTE_BENEFICIARIO", required = true)
    protected TICLIENTEType clientebeneficiario;
    @XmlElement(name = "INDIRIZZO_FORNITURA", required = true)
    protected TIINDIRIZZOType indirizzofornitura;
    @XmlElement(name = "INDIRIZZO_CLIENTE", required = true)
    protected TIINDIRIZZOType indirizzocliente;
    @XmlElement(name = "INDIRIZZO_ESAZIONE", required = true)
    protected TIINDIRIZZOType indirizzoesazione;
    @XmlElement(name = "INDIRIZZO_BENEFICIARIO", required = true)
    protected TIINDIRIZZOType indirizzobeneficiario;
    @XmlElement(name = "STATO_CONTATORE", required = true)
    protected String statocontatore;
    @XmlElement(name = "INSTALLAZIONE_CONTATORE", required = true)
    protected String installazionecontatore;
    @XmlElement(name = "INSTALLAZIONE_CORRETTORE", required = true)
    protected String installazionecorrettore;
    @XmlElement(name = "RIMOZIONE_CONTATORE", required = true)
    protected String rimozionecontatore;
    @XmlElement(name = "RIMOZIONE_CORRETTORE", required = true)
    protected String rimozionecorrettore;
    @XmlElement(name = "CONTATORE", required = true)
    protected TILETTURAGASType contatore;
    @XmlElement(name = "CONTATORE_RIMOSSO", required = true)
    protected TILETTURAGASType contatorerimosso;
    @XmlElement(name = "CORRETTORE", required = true)
    protected TILETTURAGASType correttore;
    @XmlElement(name = "CORRETTORE_RIMOSSO", required = true)
    protected TILETTURAGASType correttorerimosso;
    @XmlElement(name = "ALLEGATO")
    protected List<TIALLEGATOType> allegato;
    @XmlElement(name = "PREDETERMINABILITA", required = true)
    protected TIPREDETERMINABILITAType predeterminabilita;
    @XmlElement(name = "ADDEBITO_ONERI", required = true)
    protected String addebitooneri;
    @XmlElement(name = "APPUNTAMENTO_NECESSARIO", required = true)
    protected String appuntamentonecessario;
    @XmlElement(name = "PDR_CODICE", required = true)
    protected String pdrcodice;
    @XmlElement(name = "PDR_TIPO", required = true)
    protected String pdrtipo;
    @XmlElement(name = "PDR_CODICE_PROFILO_PRELIEVO", required = true)
    protected String pdrcodiceprofiloprelievo;
    @XmlElement(name = "PDR_CODICE_REMI", required = true)
    protected String pdrcodiceremi;
    @XmlElement(name = "DATI_TECNICI", required = true)
    protected TIDATITECNICIType datitecnici;
    @XmlElement(name = "RILEVANZA_CONTINUITA_CLIENTE", required = true)
    protected String rilevanzacontinuitacliente;
    @XmlElement(name = "PDR_STATO_TECNICO", required = true)
    protected String pdrstatotecnico;
    @XmlElement(name = "PRESSIONE_MISURA", required = true)
    protected String pressionemisura;
    @XmlElement(name = "PDR_PORTATA_MASSIMA", required = true)
    protected String pdrportatamassima;
    @XmlElement(name = "PDR_PORTATA_MINIMA", required = true)
    protected String pdrportataminima;
    @XmlElement(name = "CODICE_AUTHORITY_DL", required = true)
    protected String codiceauthoritydl;
    @XmlElement(name = "CANALE_COMUNICAZIONE", required = true)
    protected String canalecomunicazione;
    @XmlElement(name = "RIFERIMENTO_COMUNICAZIONE_SOSP", required = true)
    protected String riferimentocomunicazionesosp;
    @XmlElement(name = "ANNULLAMNETO", required = true)
    protected TIANNULLAMENTOType annullamneto;
    @XmlElement(name = "ATTI_AUTORIZZATIVI", required = true)
    protected String attiautorizzativi;
    @XmlElement(name = "SERVIZIO_ENERGETICO", required = true)
    protected String servizioenergetico;
    @XmlElement(name = "DATI_VERIFICA", required = true)
    protected TIVERIFICAType dativerifica;
    @XmlElement(name = "SECONDO_APPUNTAMENTO", required = true)
    protected TISECONDOAPPUNTAMENTOType secondoappuntamento;
    @XmlElement(name = "ANNULLAMNETO_APPUNTAMENTO", required = true)
    protected TIANNULLAMENTOAPPUNTAMENTOType annullamnetoappuntamento;
    @XmlElement(name = "DOCUMENTAZIONE", required = true)
    protected TIDOCUMENTAZIONEType documentazione;
    @XmlElement(name = "DATA_TENTATIVO", required = true)
    protected String datatentativo;
    @XmlElement(name = "DATA_MAX_CONF", required = true)
    protected String datamaxconf;
    @XmlElement(name = "RIFERIMENTO_RISP_QUESITI", required = true)
    protected String riferimentorispquesiti;
    @XmlElement(name = "IVA", required = true)
    protected String iva;
    @XmlElement(name = "IMPOSTE", required = true)
    protected String imposte;
    @XmlElement(name = "DATI_FATTURAZIONE", required = true)
    protected String datifatturazione;
    @XmlElement(name = "RIF_QUESITI", required = true)
    protected String rifquesiti;
    @XmlElement(name = "DATA_DECORRENZA", required = true)
    protected String datadecorrenza;
    @XmlElement(name = "DATA_ESEC_LAVORO", required = true)
    protected String dataeseclavoro;
    @XmlElement(name = "UTENTE", required = true)
    protected String utente;
    @XmlElement(name = "EVENTO", required = true)
    protected String evento;
    @XmlElement(name = "FATTIBILITA_TECNICA", required = true)
    protected String fattibilitatecnica;
    @XmlElement(name = "NUMERO_TENTATIVI", required = true)
    protected String numerotentativi;
    @XmlElement(name = "BONUS", required = true)
    protected TIBONUSType bonus;
    @XmlElement(name = "DATA_SCAD_DS_CATEGORIA_USO", required = true)
    protected String datascaddscategoriauso;
    @XmlElement(name = "CONTATORE_SWITCH", required = true)
    protected TILETTURAGASType contatoreswitch;
    @XmlElement(name = "CORRETTORE_SWITCH", required = true)
    protected TILETTURAGASType correttoreswitch;
    @XmlElement(name = "MOROSITA_DATE_SOSPENSIONE", required = true)
    protected String morositadatesospensione;
    @XmlElement(name = "MOROSITA_PUNTO_CHIUSO", required = true)
    protected String morositapuntochiuso;
    @XmlElement(name = "DATE_CAMBIO_TRADER", required = true)
    protected String datecambiotrader;
    @XmlElement(name = "TIPOLOGIA_MERCATO", required = true)
    protected String tipologiamercato;
    @XmlElement(name = "RESIDENZA", required = true)
    protected String residenza;
    @XmlElement(name = "ACCESSO_FUI", required = true)
    protected String accessofui;
    @XmlElement(name = "TIPO_FORNITURA", required = true)
    protected String tipofornitura;
    @XmlElement(name = "TRADER", required = true)
    protected TITRADERType trader;
    @XmlElement(name = "PDR_INTERROTTI", required = true)
    protected String pdrinterrotti;
    @XmlElement(name = "PDR_RIPRISTINATI", required = true)
    protected String pdrripristinati;
    @XmlElement(name = "PRESENZA_CMOR", required = true)
    protected String presenzacmor;
    @XmlElement(name = "DATA_ATT_SERV_DEFAULT", required = true)
    protected String dataattservdefault;
    @XmlElement(name = "DATA_CHIUSURA_PDR", required = true)
    protected String datachiusurapdr;
    @XmlElement(name = "CAM", required = true)
    protected String cam;
    @XmlElement(name = "COMPR_CAM", required = true)
    protected String comprcam;
    @XmlElement(name = "PIVA_UTENTE_BILANCIAMENTO", required = true)
    protected String pivautentebilanciamento;

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
     * Recupera il valore della proprietà appuntamento.
     * 
     * @return
     *     possible object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public TIAPPUNTAMENTOType getAPPUNTAMENTO() {
        return appuntamento;
    }

    /**
     * Imposta il valore della proprietà appuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public void setAPPUNTAMENTO(TIAPPUNTAMENTOType value) {
        this.appuntamento = value;
    }

    /**
     * Recupera il valore della proprietà urlacquisizioneappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLACQUISIZIONEAPPUNTAMENTO() {
        return urlacquisizioneappuntamento;
    }

    /**
     * Imposta il valore della proprietà urlacquisizioneappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLACQUISIZIONEAPPUNTAMENTO(String value) {
        this.urlacquisizioneappuntamento = value;
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
     * Recupera il valore della proprietà riferimentopreventivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTOPREVENTIVO() {
        return riferimentopreventivo;
    }

    /**
     * Imposta il valore della proprietà riferimentopreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTOPREVENTIVO(String value) {
        this.riferimentopreventivo = value;
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
     * Recupera il valore della proprietà datainviodl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINVIODL() {
        return datainviodl;
    }

    /**
     * Imposta il valore della proprietà datainviodl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINVIODL(String value) {
        this.datainviodl = value;
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
     * Recupera il valore della proprietà statocontatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATOCONTATORE() {
        return statocontatore;
    }

    /**
     * Imposta il valore della proprietà statocontatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATOCONTATORE(String value) {
        this.statocontatore = value;
    }

    /**
     * Recupera il valore della proprietà installazionecontatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTALLAZIONECONTATORE() {
        return installazionecontatore;
    }

    /**
     * Imposta il valore della proprietà installazionecontatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTALLAZIONECONTATORE(String value) {
        this.installazionecontatore = value;
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
     * Recupera il valore della proprietà rimozionecontatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIMOZIONECONTATORE() {
        return rimozionecontatore;
    }

    /**
     * Imposta il valore della proprietà rimozionecontatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIMOZIONECONTATORE(String value) {
        this.rimozionecontatore = value;
    }

    /**
     * Recupera il valore della proprietà rimozionecorrettore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIMOZIONECORRETTORE() {
        return rimozionecorrettore;
    }

    /**
     * Imposta il valore della proprietà rimozionecorrettore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIMOZIONECORRETTORE(String value) {
        this.rimozionecorrettore = value;
    }

    /**
     * Recupera il valore della proprietà contatore.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCONTATORE() {
        return contatore;
    }

    /**
     * Imposta il valore della proprietà contatore.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCONTATORE(TILETTURAGASType value) {
        this.contatore = value;
    }

    /**
     * Recupera il valore della proprietà contatorerimosso.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCONTATORERIMOSSO() {
        return contatorerimosso;
    }

    /**
     * Imposta il valore della proprietà contatorerimosso.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCONTATORERIMOSSO(TILETTURAGASType value) {
        this.contatorerimosso = value;
    }

    /**
     * Recupera il valore della proprietà correttore.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCORRETTORE() {
        return correttore;
    }

    /**
     * Imposta il valore della proprietà correttore.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCORRETTORE(TILETTURAGASType value) {
        this.correttore = value;
    }

    /**
     * Recupera il valore della proprietà correttorerimosso.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCORRETTORERIMOSSO() {
        return correttorerimosso;
    }

    /**
     * Imposta il valore della proprietà correttorerimosso.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCORRETTORERIMOSSO(TILETTURAGASType value) {
        this.correttorerimosso = value;
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
     * Recupera il valore della proprietà pdrcodiceprofiloprelievo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRCODICEPROFILOPRELIEVO() {
        return pdrcodiceprofiloprelievo;
    }

    /**
     * Imposta il valore della proprietà pdrcodiceprofiloprelievo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRCODICEPROFILOPRELIEVO(String value) {
        this.pdrcodiceprofiloprelievo = value;
    }

    /**
     * Recupera il valore della proprietà pdrcodiceremi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRCODICEREMI() {
        return pdrcodiceremi;
    }

    /**
     * Imposta il valore della proprietà pdrcodiceremi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRCODICEREMI(String value) {
        this.pdrcodiceremi = value;
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
     * Recupera il valore della proprietà pdrstatotecnico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRSTATOTECNICO() {
        return pdrstatotecnico;
    }

    /**
     * Imposta il valore della proprietà pdrstatotecnico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRSTATOTECNICO(String value) {
        this.pdrstatotecnico = value;
    }

    /**
     * Recupera il valore della proprietà pressionemisura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESSIONEMISURA() {
        return pressionemisura;
    }

    /**
     * Imposta il valore della proprietà pressionemisura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESSIONEMISURA(String value) {
        this.pressionemisura = value;
    }

    /**
     * Recupera il valore della proprietà pdrportatamassima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRPORTATAMASSIMA() {
        return pdrportatamassima;
    }

    /**
     * Imposta il valore della proprietà pdrportatamassima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRPORTATAMASSIMA(String value) {
        this.pdrportatamassima = value;
    }

    /**
     * Recupera il valore della proprietà pdrportataminima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRPORTATAMINIMA() {
        return pdrportataminima;
    }

    /**
     * Imposta il valore della proprietà pdrportataminima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRPORTATAMINIMA(String value) {
        this.pdrportataminima = value;
    }

    /**
     * Recupera il valore della proprietà codiceauthoritydl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAUTHORITYDL() {
        return codiceauthoritydl;
    }

    /**
     * Imposta il valore della proprietà codiceauthoritydl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAUTHORITYDL(String value) {
        this.codiceauthoritydl = value;
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
     * Recupera il valore della proprietà riferimentocomunicazionesosp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTOCOMUNICAZIONESOSP() {
        return riferimentocomunicazionesosp;
    }

    /**
     * Imposta il valore della proprietà riferimentocomunicazionesosp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTOCOMUNICAZIONESOSP(String value) {
        this.riferimentocomunicazionesosp = value;
    }

    /**
     * Recupera il valore della proprietà annullamneto.
     * 
     * @return
     *     possible object is
     *     {@link TIANNULLAMENTOType }
     *     
     */
    public TIANNULLAMENTOType getANNULLAMNETO() {
        return annullamneto;
    }

    /**
     * Imposta il valore della proprietà annullamneto.
     * 
     * @param value
     *     allowed object is
     *     {@link TIANNULLAMENTOType }
     *     
     */
    public void setANNULLAMNETO(TIANNULLAMENTOType value) {
        this.annullamneto = value;
    }

    /**
     * Recupera il valore della proprietà attiautorizzativi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTIAUTORIZZATIVI() {
        return attiautorizzativi;
    }

    /**
     * Imposta il valore della proprietà attiautorizzativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTIAUTORIZZATIVI(String value) {
        this.attiautorizzativi = value;
    }

    /**
     * Recupera il valore della proprietà servizioenergetico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVIZIOENERGETICO() {
        return servizioenergetico;
    }

    /**
     * Imposta il valore della proprietà servizioenergetico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVIZIOENERGETICO(String value) {
        this.servizioenergetico = value;
    }

    /**
     * Recupera il valore della proprietà dativerifica.
     * 
     * @return
     *     possible object is
     *     {@link TIVERIFICAType }
     *     
     */
    public TIVERIFICAType getDATIVERIFICA() {
        return dativerifica;
    }

    /**
     * Imposta il valore della proprietà dativerifica.
     * 
     * @param value
     *     allowed object is
     *     {@link TIVERIFICAType }
     *     
     */
    public void setDATIVERIFICA(TIVERIFICAType value) {
        this.dativerifica = value;
    }

    /**
     * Recupera il valore della proprietà secondoappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link TISECONDOAPPUNTAMENTOType }
     *     
     */
    public TISECONDOAPPUNTAMENTOType getSECONDOAPPUNTAMENTO() {
        return secondoappuntamento;
    }

    /**
     * Imposta il valore della proprietà secondoappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TISECONDOAPPUNTAMENTOType }
     *     
     */
    public void setSECONDOAPPUNTAMENTO(TISECONDOAPPUNTAMENTOType value) {
        this.secondoappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà annullamnetoappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link TIANNULLAMENTOAPPUNTAMENTOType }
     *     
     */
    public TIANNULLAMENTOAPPUNTAMENTOType getANNULLAMNETOAPPUNTAMENTO() {
        return annullamnetoappuntamento;
    }

    /**
     * Imposta il valore della proprietà annullamnetoappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TIANNULLAMENTOAPPUNTAMENTOType }
     *     
     */
    public void setANNULLAMNETOAPPUNTAMENTO(TIANNULLAMENTOAPPUNTAMENTOType value) {
        this.annullamnetoappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà documentazione.
     * 
     * @return
     *     possible object is
     *     {@link TIDOCUMENTAZIONEType }
     *     
     */
    public TIDOCUMENTAZIONEType getDOCUMENTAZIONE() {
        return documentazione;
    }

    /**
     * Imposta il valore della proprietà documentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDOCUMENTAZIONEType }
     *     
     */
    public void setDOCUMENTAZIONE(TIDOCUMENTAZIONEType value) {
        this.documentazione = value;
    }

    /**
     * Recupera il valore della proprietà datatentativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATATENTATIVO() {
        return datatentativo;
    }

    /**
     * Imposta il valore della proprietà datatentativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATATENTATIVO(String value) {
        this.datatentativo = value;
    }

    /**
     * Recupera il valore della proprietà datamaxconf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAMAXCONF() {
        return datamaxconf;
    }

    /**
     * Imposta il valore della proprietà datamaxconf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAMAXCONF(String value) {
        this.datamaxconf = value;
    }

    /**
     * Recupera il valore della proprietà riferimentorispquesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTORISPQUESITI() {
        return riferimentorispquesiti;
    }

    /**
     * Imposta il valore della proprietà riferimentorispquesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTORISPQUESITI(String value) {
        this.riferimentorispquesiti = value;
    }

    /**
     * Recupera il valore della proprietà iva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVA() {
        return iva;
    }

    /**
     * Imposta il valore della proprietà iva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVA(String value) {
        this.iva = value;
    }

    /**
     * Recupera il valore della proprietà imposte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPOSTE() {
        return imposte;
    }

    /**
     * Imposta il valore della proprietà imposte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPOSTE(String value) {
        this.imposte = value;
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
     * Recupera il valore della proprietà rifquesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFQUESITI() {
        return rifquesiti;
    }

    /**
     * Imposta il valore della proprietà rifquesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFQUESITI(String value) {
        this.rifquesiti = value;
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
     * Recupera il valore della proprietà dataeseclavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAESECLAVORO() {
        return dataeseclavoro;
    }

    /**
     * Imposta il valore della proprietà dataeseclavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAESECLAVORO(String value) {
        this.dataeseclavoro = value;
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
     * Recupera il valore della proprietà fattibilitatecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFATTIBILITATECNICA() {
        return fattibilitatecnica;
    }

    /**
     * Imposta il valore della proprietà fattibilitatecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFATTIBILITATECNICA(String value) {
        this.fattibilitatecnica = value;
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
     * Recupera il valore della proprietà datascaddscategoriauso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASCADDSCATEGORIAUSO() {
        return datascaddscategoriauso;
    }

    /**
     * Imposta il valore della proprietà datascaddscategoriauso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASCADDSCATEGORIAUSO(String value) {
        this.datascaddscategoriauso = value;
    }

    /**
     * Recupera il valore della proprietà contatoreswitch.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCONTATORESWITCH() {
        return contatoreswitch;
    }

    /**
     * Imposta il valore della proprietà contatoreswitch.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCONTATORESWITCH(TILETTURAGASType value) {
        this.contatoreswitch = value;
    }

    /**
     * Recupera il valore della proprietà correttoreswitch.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAGASType }
     *     
     */
    public TILETTURAGASType getCORRETTORESWITCH() {
        return correttoreswitch;
    }

    /**
     * Imposta il valore della proprietà correttoreswitch.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAGASType }
     *     
     */
    public void setCORRETTORESWITCH(TILETTURAGASType value) {
        this.correttoreswitch = value;
    }

    /**
     * Recupera il valore della proprietà morositadatesospensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOROSITADATESOSPENSIONE() {
        return morositadatesospensione;
    }

    /**
     * Imposta il valore della proprietà morositadatesospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOROSITADATESOSPENSIONE(String value) {
        this.morositadatesospensione = value;
    }

    /**
     * Recupera il valore della proprietà morositapuntochiuso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOROSITAPUNTOCHIUSO() {
        return morositapuntochiuso;
    }

    /**
     * Imposta il valore della proprietà morositapuntochiuso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOROSITAPUNTOCHIUSO(String value) {
        this.morositapuntochiuso = value;
    }

    /**
     * Recupera il valore della proprietà datecambiotrader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATECAMBIOTRADER() {
        return datecambiotrader;
    }

    /**
     * Imposta il valore della proprietà datecambiotrader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATECAMBIOTRADER(String value) {
        this.datecambiotrader = value;
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
     * Recupera il valore della proprietà pdrinterrotti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRINTERROTTI() {
        return pdrinterrotti;
    }

    /**
     * Imposta il valore della proprietà pdrinterrotti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRINTERROTTI(String value) {
        this.pdrinterrotti = value;
    }

    /**
     * Recupera il valore della proprietà pdrripristinati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRRIPRISTINATI() {
        return pdrripristinati;
    }

    /**
     * Imposta il valore della proprietà pdrripristinati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRRIPRISTINATI(String value) {
        this.pdrripristinati = value;
    }

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
     * Recupera il valore della proprietà dataattservdefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAATTSERVDEFAULT() {
        return dataattservdefault;
    }

    /**
     * Imposta il valore della proprietà dataattservdefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAATTSERVDEFAULT(String value) {
        this.dataattservdefault = value;
    }

    /**
     * Recupera il valore della proprietà datachiusurapdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACHIUSURAPDR() {
        return datachiusurapdr;
    }

    /**
     * Imposta il valore della proprietà datachiusurapdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACHIUSURAPDR(String value) {
        this.datachiusurapdr = value;
    }

    /**
     * Recupera il valore della proprietà cam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAM() {
        return cam;
    }

    /**
     * Imposta il valore della proprietà cam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAM(String value) {
        this.cam = value;
    }

    /**
     * Recupera il valore della proprietà comprcam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPRCAM() {
        return comprcam;
    }

    /**
     * Imposta il valore della proprietà comprcam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPRCAM(String value) {
        this.comprcam = value;
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

}
