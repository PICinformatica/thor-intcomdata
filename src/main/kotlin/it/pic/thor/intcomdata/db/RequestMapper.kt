package it.pic.thor.intcomdata.db

import it.edison.thorCutOff.Azione
import it.edison.thorCutOff.CutOff
import it.edison.thorEE.*
import it.edison.thorEE.Ammissibilita
import it.edison.thorEE.DatiTecniciPreventivo
import it.edison.thorEE.DettaglioPreventivo
import it.edison.thorEE.Esito
import it.edison.thorEE.Preventivo
import it.edison.thorEE.Tracking
import it.edison.thorGAS.*

class RequestMapper {

    private fun addAzioniUtenteCutOff(azioniUtente: List<Azione>): List<TIAZIONEUTENTEType> {
        val azioniUtenteDb = mutableListOf<TIAZIONEUTENTEType>()
        azioniUtente.forEach { azione: Azione -> azioniUtenteDb.add(wsdlToAzioniList(azione)) }
        return azioniUtenteDb
    }

    private fun wsdlToAzioniList(azioniList: Azione): TIAZIONEUTENTEType {
        val res = TIAZIONEUTENTEType()
        res.azione = azioniList.azione
        res.dtazione = azioniList.data
        res.utente = azioniList.utente
        return res
    }

    fun createRequestCutOff(tseRequest: CutOff): TICUTOFFType {
        val res = TICUTOFFType()
        res.id = tseRequest.id
        res.destinatario = tseRequest.destinatario
        res.servizio = tseRequest.servizio
        res.utility = tseRequest.utility
        res.maxrichieste = tseRequest.maxRichieste
        res.numerorichieste = tseRequest.numeroRichieste
        res.stato = tseRequest.stato
        res.tipodestinatario = tseRequest.tipoDestinatario
        res.created = tseRequest.created
        res.azioniutente = addAzioniUtenteCutOff(tseRequest.azioniUtente)
        res.primariga = tseRequest.primaRiga
        res.formato = tseRequest.formato
        res.separatore = tseRequest.separatore
        res.idtemplate = tseRequest.idTemplate
        res.flusso = tseRequest.flusso
        res.linkfile = tseRequest.linkFile
        res.utente = tseRequest.utente
        res.flagselected = tseRequest.isFlagSelected?.toString()
        res.datadecorrenza = tseRequest.dataDecorrenza
        res.email = tseRequest.email
        res.ragionesociale = tseRequest.ragioneSociale
        res.portale = tseRequest.portale
        res.critico = tseRequest.critico

        res.flusso = "DL-I-E050"
        res.stato = "APERTO, PIENO"

        return res
    }

    private fun wsdlToDbTrackingEE(tseRequest: Tracking): TITRACKINGType {
        val res = TITRACKINGType()
        res.areagestionale = tseRequest.areaGestionale
        res.cdflusso = tseRequest.codiceFlusso
        res.cdpraticadistributore = tseRequest.codicePraticaDistributore
        res.cdpraticamittente = tseRequest.codicePraticaMittente
        res.cdpraticathor = tseRequest.codicePraticaThor
        res.commodity = tseRequest.commodity
        res.servizio = tseRequest.servizio
        res.sistemadestinazione = tseRequest.sistemaDestinazione
        res.sistemafatturazione = tseRequest.sistemaFatturazione
        res.sistemaorigine = tseRequest.sistemaOrigine
        res.societavendita = tseRequest.societaVendita

        return res
    }

    private fun wsdlToDbAmmissibilitaEE(tseRequest: Ammissibilita): TIAMMISSIBILITAType {
        val res = TIAMMISSIBILITAType()
        res.causale = tseRequest.causale
        res.dtammissibilita = tseRequest.data
        res.esito = tseRequest.esito
        res.motivazione = tseRequest.motivazione

        return res
    }

    private fun wsdlToDbEsitoEE(tseRequest: Esito): TIESITOType {
        val res = TIESITOType()
        res.causale = tseRequest.codice
        res.data = tseRequest.data
        res.esito = tseRequest.esito
        res.motivazione = tseRequest.motivazione

        return res
    }

    private fun wsdlToDettaglioListEE(dettaglioList: DettaglioPreventivo): TIDETTAGLIOPREVENTIVOType {
        val res = TIDETTAGLIOPREVENTIVOType()

        res.descrizione = dettaglioList.descrizione
        res.importo = dettaglioList.importo
        res.progressivo = dettaglioList.progressivo

        return res
    }

    private fun toPreventivoEE(prev: Preventivo): TIPREVENTIVOType {
        val res = TIPREVENTIVOType()
        res.cddl = prev.codiceDL
        res.getDETTAGLIO().addAll(prev.dettaglio.flatMap { it.item }.map { wsdlToDettaglioListEE(it) })
        res.dtscadenza = prev.dataScadenza
        res.giornimaxesecuzionelavoro = prev.giorniMaxEsecuzioneLavoro
        res.id = prev.id
        res.importo = prev.importo
        res.note = prev.note

        return res
    }

    private fun wsdlToDbPreventivoEE(tseRequest: DatiTecniciPreventivo): TIDATITECNICIPREVENTIVOType {
        val res = TIDATITECNICIPREVENTIVOType()
        res.datainvio = tseRequest.dataInvio
        res.dataprevintervento = tseRequest.dataPrevistaIntervento
        res.datarichiesta = tseRequest.dataRichiesta
        res.distanzacabina = tseRequest.distanzaCabina
        res.documentazione = tseRequest.documentazione
        res.elementinecessari = tseRequest.elementiNecessari
        res.fattibilita = tseRequest.fattibilita
        res.modaccettpreventivo = tseRequest.modalitaAccettazionePreventivo
        res.numerotentativi = tseRequest.numeroTentativi
        res.nuovacabina = tseRequest.nuovaCabina
        res.periodovaliditamesi = tseRequest.periodoValiditaMesi
        res.preventivo = toPreventivoEE(tseRequest.preventivo)
        res.raddqtadistanza = tseRequest.raddQtaDistanza
        res.tempiautorizzazioni = tseRequest.tempiAutorizzazioni
        res.tipo = tseRequest.tipo

        return res
    }

    private fun wsdlToDbPredeterminabilitaEE(tseRequest: String): TIPREDETERMINABILITAType {
        val res = TIPREDETERMINABILITAType()
        res.testo = tseRequest

        return res
    }

    private fun wsdlToDbPotenzaEE(tseRequest: Potenza): TIPOTENZAType {
        val res = TIPOTENZAType()
        res.disponibile = tseRequest.disponibile
        res.franchigia = tseRequest.franchigia
        res.impegnata = tseRequest.impegnata

        return res
    }

    private fun wsdlToDbTensioneEE(tseRequest: Tensione): TITENSIONEType {
        val res = TITENSIONEType()
        res.alimentazione = tseRequest.alimentazione
        res.fase = tseRequest.fase
        res.monotrifase = tseRequest.monoTrifase

        return res
    }

    private fun wsdlToDbStagionaleRicorrenteEE(tseRequest: StagionaleRicorrente): TISTAGIONALERICORRENTEType {
        val res = TISTAGIONALERICORRENTEType()
        res.dtfine = tseRequest.dataFine
        res.dtinizio = tseRequest.dataInizio
        res.stagric = tseRequest.stagRic

        return res
    }

    private fun toLetturaEE(let: LetturaEE): TILETTURAEEType {
        val res = TILETTURAEEType()
        res.matricolaattiva = let.matricolaAttiva
        res.matricolapotenza = let.matricolaPotenza
        res.matricolareattiva = let.matricolaReattiva
        res.attivaf1 = let.attivaF1
        res.attivaf2 = let.attivaF2
        res.attivaf3 = let.attivaF3
        res.reattivaf1 = let.reattivaF1
        res.reattivaf2 = let.reattivaF2
        res.reattivaf3 = let.reattivaF3
        res.potenzaf1 = let.potenzaF1
        res.potenzaf2 = let.potenzaF2
        res.potenzaf3 = let.potenzaF3
        res.data = let.data
        res.tipologia = let.tipologia

        return res
    }

    private fun wsdlToDbMisuratoreEE(tseRequest: DatiTecniciLetturaEE): TIDATITECNICILETTURAEEType {
        val res = TIDATITECNICILETTURAEEType()
        res.acquisitoconssost = tseRequest.acquisitoConsensoSostituzione
        res.costantetrasfattiva = tseRequest.costanteTrasferimentoAttiva
        res.costantetrasfpotenza = tseRequest.costanteTrasferimentoPotenza
        res.costantetrasfreattiva = tseRequest.costanteTrasferimentoReattiva
        res.immediatasost = tseRequest.immediataSostituzione
        res.lettura = toLetturaEE(tseRequest.lettura)
        res.malfunzionamento = tseRequest.malfunzionamento
        res.misuratoreelettronico = tseRequest.misuratoreElettronico
        res.tipologiamisuratore = tseRequest.tipologiaMisuratore

        return res
    }

    private fun wsdlToDbClienteEE(tseRequest: Cliente): TICLIENTEType {
        val res = TICLIENTEType()
        res.cdfiscale = tseRequest.codiceFiscale
        res.cdfiscalestraniero = tseRequest.cfStraniero
        res.cellulare = tseRequest.cellulare
        res.cognome = tseRequest.cognome
        res.email = tseRequest.email
        res.fax = tseRequest.fax
        res.nome = tseRequest.nome
        res.ptiva = tseRequest.partitaIva
        res.ragionesociale = tseRequest.ragioneSociale
        res.telefono = tseRequest.telefono

        return res
    }

    private fun wsdlToDbDatiCommercialiEE(tseRequest: DatiCommerciali): TIDATICOMMERCIALIType {
        val res = TIDATICOMMERCIALIType()
        res.opzionetariffaria = tseRequest.opzioneTariffaria
        res.settoremerceologico = tseRequest.settoreMerceologico
        res.tipocontratto = tseRequest.tipoContratto
        res.trattamentoiva = tseRequest.trattamentoIva
        res.usoenergia = tseRequest.usoEnergia

        return res
    }

    fun createRequestEsitiEE(tseRequest: TSECOMDATAEEREQ): TITSEEEALLType {
        val requestEE = TITSEEEINBREQType()
        requestEE.tracking = wsdlToDbTrackingEE(tseRequest.tracking)
        requestEE.ammissibilita = wsdlToDbAmmissibilitaEE(tseRequest.ammissibilita)
        requestEE.esito = wsdlToDbEsitoEE(tseRequest.esito)
        requestEE.dteseclavoro = tseRequest.dataEsecuzioneLavoro
        requestEE.preventivo = wsdlToDbPreventivoEE(tseRequest.preventivo)
        requestEE.predeterminabilita = wsdlToDbPredeterminabilitaEE(tseRequest.testoPredeterminabilita)
        requestEE.cdrintracciabilita = tseRequest.codiceRintracciabilita
        requestEE.tipointervento = tseRequest.tipologiaIntervento
        requestEE.pod = tseRequest.pod
        requestEE.riferimentoquesiti = tseRequest.rifQuesiti
        requestEE.datitecnicirichiesti = tseRequest.datiTecniciRichiesti
        requestEE.note = tseRequest.note
        requestEE.potenzaattuale = wsdlToDbPotenzaEE(tseRequest.potenza)
        requestEE.tensioneattuale = wsdlToDbTensioneEE(tseRequest.tensione)
        requestEE.stagionalericorrente = wsdlToDbStagionaleRicorrenteEE(tseRequest.stagionaleRicorrente)
        requestEE.misuratore = wsdlToDbMisuratoreEE(tseRequest.misuratore)
        requestEE.sostituzionemisuratore = tseRequest.sostituzioneMisuratore
        requestEE.misuratorerimosso = wsdlToDbMisuratoreEE(tseRequest.misuratoreRimosso)
        requestEE.cliente = wsdlToDbClienteEE(tseRequest.cliente)
        requestEE.daticommerciali = wsdlToDbDatiCommercialiEE(tseRequest.datiCommerciali)

        val requestEEAll = TITSEEEALLType()
        requestEEAll.inboundrequest = requestEE

        return requestEEAll
    }

    private fun wsdlToDettaglioListGas(dettaglioList: it.edison.thorGAS.DettaglioPreventivo): TIDETTAGLIOPREVENTIVOType {
        val res = TIDETTAGLIOPREVENTIVOType()

        res.descrizione = dettaglioList.descrizione
        res.importo = dettaglioList.importo
        res.progressivo = dettaglioList.progressivo

        return res
    }

    private fun toPreventivoGAS(prev: it.edison.thorGAS.Preventivo): TIPREVENTIVOType {
        val res = TIPREVENTIVOType()
        res.cddl = prev.codiceDL
        res.getDETTAGLIO().addAll(prev.dettaglio.flatMap { it.item }.map { wsdlToDettaglioListGas(it) })
        res.dtscadenza = prev.dataScadenza
        res.giornimaxesecuzionelavoro = prev.giorniMaxEsecuzioneLavoro
        res.id = prev.id
        res.importo = prev.importo
        res.note = prev.note

        return res
    }

    private fun wsdlToDbDatiTecniciPreventivoGas(tseRequest: it.edison.thorGAS.DatiTecniciPreventivo): TIDATITECNICIPREVENTIVOType{
        val res = TIDATITECNICIPREVENTIVOType()
        res.datainvio = tseRequest.dataInvio
        res.dataprevintervento = tseRequest.dataPrevistaIntervento
        res.datarichiesta = tseRequest.dataRichiesta
        res.distanzacabina = tseRequest.distanzaCabina
        res.documentazione = tseRequest.documentazione
        res.elementinecessari = tseRequest.elementiNecessari
        res.fattibilita = tseRequest.fattibilita
        res.modaccettpreventivo = tseRequest.modalitaAccettazionePreventivo
        res.numerotentativi = tseRequest.numeroTentativi
        res.nuovacabina = tseRequest.nuovaCabina
        res.periodovaliditamesi = tseRequest.periodoValiditaMesi
        res.preventivo = toPreventivoGAS(tseRequest.preventivo)
        res.raddqtadistanza = tseRequest.raddQtaDistanza
        res.tempiautorizzazioni = tseRequest.tempiAutorizzazioni
        res.tipo = tseRequest.tipo

        return res
    }

    private fun wsdlToDbDocumentazioneGas(tseRequest: Documentazione): TIDOCUMENTAZIONEType{
        val res = TIDOCUMENTAZIONEType()
        res.dataaccertamento = tseRequest.dataAccertamento
        res.dataricezione = tseRequest.dataRicezione
        res.indirizzoinvio= tseRequest.indirizzoInvio
        res.mancante = tseRequest.mancante
        res.riferimento = tseRequest.riferimento

        return res
    }

    private fun wsdlToDbIndirizzoFornituraGas(tseRequest: Indirizzo): TIINDIRIZZOType{
        val res = TIINDIRIZZOType()
        res.altro = tseRequest.altro
        res.cap = tseRequest.cap
        res.civico = tseRequest.civico
        res.comune = tseRequest.comune
        res.estensione = tseRequest.numeroEstensione
        res.frazione = tseRequest.frazione
        res.interno = tseRequest.interno
        res.istat = tseRequest.istat
        res.nazione = tseRequest.nazione
        res.presso = tseRequest.presso
        res.piano = tseRequest.piano
        res.provincia = tseRequest.provincia
        res.scala = tseRequest.scala
        res.toponimo = tseRequest.toponimo
        res.via = tseRequest.via

        return res
    }

    private fun wsdlToDbDatiTecniciGas(tseRequest: DatiTecnici): TIDATITECNICIType{
        val res = TIDATITECNICIType()
        res.categoriauso = tseRequest.categoriaUso
        res.cg = tseRequest.cg
        res.classeprelievo = tseRequest.classePrelievo
        res.competenzalettura = tseRequest.competenzaLettura
        res.consumoannuo = tseRequest.consumoAnnuo
        res.datitecnicirichiesti = tseRequest.datiTecniciRichiesti
        res.erogazioneservizioenergia = tseRequest.erogazioneServizioEnergia
        res.fornituraremi = tseRequest.fornituraREMI
        res.maxprelievoora = tseRequest.maxPrelievoOra
        res.pdrpressione = tseRequest.pdrPressione
        res.periodicitalettura = tseRequest.periodicitaLettura
        res.potenzamaxrichiesta = tseRequest.potenzaMaxRichiesta
        res.potenzatotaleinstallata = tseRequest.potenzaTotaleInstallata
        res.potenzatotaleutilizzata = tseRequest.potenzaTotaleUtilizzata
        res.prelievoannuoprevisto = tseRequest.prelievoAnnuoPrevisto
        res.shipper = tseRequest.shipper

        return res
    }

    private fun wsdlToDbEsitoGas(tseRequest: it.edison.thorGAS.Esito): TIESITOType{
        val res = TIESITOType()
        res.causale = tseRequest.codice
        res.data = tseRequest.data
        res.esito = tseRequest.esito
        res.motivazione = tseRequest.motivazione

        return res
    }

    private fun wsdlToDbMisuratoreGas(tseRequest: Misuratore): TILETTURAGASType{
        val res = TILETTURAGASType()
        res.accessibilita = tseRequest.accessibilita
        res.anno = tseRequest.anno
        res.classe = tseRequest.classe
        res.coeffc = tseRequest.coeffC
        res.datainstallazione = tseRequest.dataInstallazione
        res.dtlettura = tseRequest.data
        res.dtultimaverifica = tseRequest.dataUltimaVerifica
        res.gruppomisintegrato = tseRequest.gruppoIntegrato
        res.matricola = tseRequest.matricola
        res.nrcifre = tseRequest.numeroCifre
        res.telegestione = tseRequest.telegestione
        res.tipo = tseRequest.tipo
        res.tipologia = tseRequest.tipologia
        res.valore = tseRequest.valore

        return res
    }

    private fun wsdlToDbAmmissibilitaGas(tseRequest: it.edison.thorGAS.Ammissibilita): TIAMMISSIBILITAType{
        val res = TIAMMISSIBILITAType()
        res.motivazione = tseRequest.motivazione
        res.esito = tseRequest.esito
        res.dtammissibilita = tseRequest.data
        res.causale = tseRequest.causale

        return res
    }

    private fun wsdlToDbTrackingGas(tseRequest: it.edison.thorGAS.Tracking): TITRACKINGType{
        val res = TITRACKINGType()
        res.areagestionale = tseRequest.areaGestionale
        res.cdflusso = tseRequest.codiceFlusso
        res.cdpraticadistributore = tseRequest.codicePraticaDistributore
        res.cdpraticamittente = tseRequest.codicePraticaMittente
        res.cdpraticathor = tseRequest.codicePraticaThor
        res.commodity = tseRequest.commodity
        res.servizio = tseRequest.servizio
        res.sistemadestinazione = tseRequest.sistemaDestinazione
        res.sistemafatturazione = tseRequest.sistemaFatturazione
        res.sistemaorigine = tseRequest.sistemaOrigine
        res.societavendita = tseRequest.societaVendita

        return res
    }

    private fun wsdlToDbDatiVerificaGas(tseRequest: Verifica): TIVERIFICAType{
        val res = TIVERIFICAType()
        res.causelaboratorio = tseRequest.causeLaboratorio
        res.datasostituzione = tseRequest.dataSostituzione
        res.esito = tseRequest.esito
        res.riferimentoresoconto = tseRequest.riferimentoResoconto
        res.verificalaboratorio = tseRequest.verificaLaboratorio

        return res
    }

    private fun wsdlToDbAnnullamentoGas(tseRequest: Annullamento): TIANNULLAMENTOType{
        val res = TIANNULLAMENTOType()
        res.causale = tseRequest.causale
        res.dtrichiesta = tseRequest.dataRichiesta
        res.motivazione = tseRequest.motivazione

        return res
    }

    fun createRequestEsitiGas(tseRequest: TSECOMDATAGASREQ): TITSEGASALLType {
        val requestGas = TITSEGASINBREQType()
        requestGas.correttorerimosso = wsdlToDbMisuratoreGas(tseRequest.convertitore)
        requestGas.contatore = wsdlToDbMisuratoreGas(tseRequest.nuovoMisuratore)
        requestGas.correttore = wsdlToDbMisuratoreGas(tseRequest.nuovoConvertitore)
        requestGas.note = tseRequest.note
        requestGas.preventivo = wsdlToDbDatiTecniciPreventivoGas(tseRequest.preventivo)
        requestGas.dataeseclavoro = tseRequest.dataEsecuzioneLavoro
        requestGas.pdrinterrotti = tseRequest.pdrInterrotti
        requestGas.pdrripristinati = tseRequest.pdrRipristinati
        requestGas.pdrcodice = tseRequest.pdrCodice
        requestGas.documentazione = wsdlToDbDocumentazioneGas(tseRequest.documentazione)
        requestGas.pdrcodiceremi = tseRequest.pdrCodiceRemi
        requestGas.pdrstatotecnico = tseRequest.pdrStato
        requestGas.indirizzofornitura = wsdlToDbIndirizzoFornituraGas(tseRequest.indirizzoFornitura)
        requestGas.datitecnici = wsdlToDbDatiTecniciGas(tseRequest.datiTecniciRichiesti)
        requestGas.esito = wsdlToDbEsitoGas(tseRequest.esito)
        requestGas.contatorerimosso = wsdlToDbMisuratoreGas(tseRequest.misuratore)
        requestGas.ammissibilita = wsdlToDbAmmissibilitaGas(tseRequest.ammissibilita)
        requestGas.tracking = wsdlToDbTrackingGas(tseRequest.tracking)
        requestGas.attiautorizzativi = tseRequest.attiAutorizzativi
        requestGas.fattibilitatecnica = tseRequest.fattibilitaTecnica
        requestGas.numerotentativi = tseRequest.numeroTentativi
        requestGas.dativerifica = wsdlToDbDatiVerificaGas(tseRequest.datiVerifica)
        requestGas.annullamneto = wsdlToDbAnnullamentoGas(tseRequest.annullamento)
        requestGas.datamaxconf = tseRequest.dataMaxConf
        requestGas.riferimentorispquesiti = tseRequest.riferimentoRispQuesiti
        requestGas.installazionecontatore = tseRequest.installazioneMisuratore
        requestGas.installazionecorrettore = tseRequest.installazioneContatore
        requestGas.riferimentopreventivo = tseRequest.riferimentoPreventivo

        val requestAll = TITSEGASALLType()
        requestAll.inboundrequest = requestGas

        return requestAll
    }
}
