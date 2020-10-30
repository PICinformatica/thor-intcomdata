package it.pic.thor.intcomdata.db

import it.edison.thorCutOff.Azione
import it.edison.thorCutOff.CutOff
import it.edison.thorCutOff.TSECUTOFF
import it.edison.thorEE.Ammissibilita
import it.edison.thorEE.TSECOMDATAEERESP
import it.edison.thorEE.Tracking
import it.edison.thorGAS.TSECOMDATAGASRESP

class ResponseMapper {

    private fun dbToWsdlTrackingEE(input: TITRACKINGType): Tracking {
        val resp = Tracking()
        resp.areaGestionale = input.areagestionale
        resp.codiceFlusso = input.cdflusso
        resp.codicePraticaDistributore = input.cdpraticadistributore
        resp.codicePraticaMittente = input.cdpraticamittente
        resp.codicePraticaThor = input.cdpraticathor
        resp.commodity = input.commodity
        resp.servizio = input.servizio
        resp.sistemaDestinazione = input.sistemadestinazione
        resp.sistemaFatturazione = input.sistemafatturazione
        resp.sistemaOrigine = input.sistemaorigine
        resp.societaVendita = input.societavendita

        return resp
    }

    fun setResponseEsitiEE(xmlResponseEE: String): TSECOMDATAEERESP {
        val dbResponse = DbTypeToXmlMapper.xmlToTseResponseEE(xmlResponseEE)
        val resp = TSECOMDATAEERESP()
        resp.ammissibilita = Ammissibilita().apply {
            this.causale = dbResponse.esito?.causale
            this.esito = dbResponse.esito?.esito
            this.motivazione = dbResponse.esito?.motivazione
            this.data = dbResponse.esito?.dtesito
        }
        resp.tracking = dbToWsdlTrackingEE(dbResponse.inboundrequest.tracking)

        return resp
    }

    private fun dbToWsdlTrackingGas(input: TITRACKINGType): it.edison.thorGAS.Tracking {
        val resp = it.edison.thorGAS.Tracking()
        resp.areaGestionale = input.areagestionale
        resp.codiceFlusso = input.cdflusso
        resp.codicePraticaDistributore = input.cdpraticadistributore
        resp.codicePraticaMittente = input.cdpraticamittente
        resp.codicePraticaThor = input.cdpraticathor
        resp.commodity = input.commodity
        resp.servizio = input.servizio
        resp.sistemaDestinazione = input.sistemadestinazione
        resp.sistemaFatturazione = input.sistemafatturazione
        resp.sistemaOrigine = input.sistemaorigine
        resp.societaVendita = input.societavendita

        return resp
    }

    fun setResponseEsitiGas(xmlResponseGas: String): TSECOMDATAGASRESP {
        val dbResponse = DbTypeToXmlMapper.xmlToTseResponseGas(xmlResponseGas)
        val resp = TSECOMDATAGASRESP()
        resp.ammissibilita = it.edison.thorGAS.Ammissibilita().apply {
            this.causale = dbResponse.esito?.causale
            this.esito = dbResponse.esito?.esito
            this.motivazione = dbResponse.esito?.motivazione
            this.data = dbResponse.esito?.dtesito
        }
        resp.tracking = dbToWsdlTrackingGas(dbResponse.inboundrequest.tracking)

        return resp
    }

    fun setResponseCutoff(cutOffList: TITSECUTOFFType): TSECUTOFF {
        val cutOffDb = mutableListOf<CutOff>()
        cutOffList.listacutoff.forEach { cutoff: TICUTOFFType -> cutOffDb.add(wsdlToCutOffList(cutoff)) }
        val tseCutOff = TSECUTOFF()
        tseCutOff.cutOff.addAll(cutOffDb)

        return tseCutOff
    }

    private fun addAzioniUtenteCutOff(azioniUtente: List<TIAZIONEUTENTEType>): List<Azione> {
        val azioniUtenteDb = mutableListOf<Azione>()
        azioniUtente.forEach { azione: TIAZIONEUTENTEType -> azioniUtenteDb.add(wsdlToAzioniList(azione)) }

        return azioniUtenteDb
    }

    private fun wsdlToAzioniList(azioniList: TIAZIONEUTENTEType): Azione {
        val res = Azione()
        res.azione = azioniList.azione
        res.data = azioniList.dtazione
        res.utente = azioniList.utente

        return res
    }

    private fun flagCheck(input: String): Boolean {
        return input != "false"
    }

    private fun wsdlToCutOffList(cutOffList: TICUTOFFType): CutOff {
        val res = CutOff()
        res.id = cutOffList.id
        res.destinatario = cutOffList.destinatario
        res.servizio = cutOffList.servizio
        res.utility = cutOffList.utility
        res.maxRichieste = cutOffList.maxrichieste
        res.numeroRichieste = cutOffList.numerorichieste
        res.stato = cutOffList.stato
        res.tipoDestinatario = cutOffList.tipodestinatario
        res.created = cutOffList.created
        res.azioniUtente.addAll(addAzioniUtenteCutOff(cutOffList.azioniutente))
        res.primaRiga = cutOffList.primariga
        res.formato = cutOffList.formato
        res.separatore = cutOffList.separatore
        res.idTemplate = cutOffList.idtemplate
        res.flusso = cutOffList.flusso
        res.linkFile = cutOffList.linkfile
        res.utente = cutOffList.utente
        res.isFlagSelected = flagCheck(cutOffList.flagselected)
        res.dataDecorrenza = cutOffList.datadecorrenza
        res.email = cutOffList.email
        res.ragioneSociale = cutOffList.ragionesociale
        res.portale = cutOffList.portale
        res.critico = cutOffList.critico

        return res
    }
}
