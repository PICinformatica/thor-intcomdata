package it.pic.thor.intcomdata.db

import it.edison.thorCutOff.CutOff
import it.edison.thorCutOff.TSECUTOFF
import it.edison.thorEE.TSECOMDATAEEREQ
import it.edison.thorEE.TSECOMDATAEERESP
import it.edison.thorGAS.TSECOMDATAGASREQ
import it.edison.thorGAS.TSECOMDATAGASRESP
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.SqlOutParameter
import org.springframework.jdbc.core.SqlParameter
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.simple.SimpleJdbcCall
import org.springframework.stereotype.Component
import java.sql.Clob
import java.sql.Types

@Component
class DbCaller(val db: JdbcTemplate) {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass)
    val requestMapper = RequestMapper()
    val responseMapper = ResponseMapper()

    fun comdataCutoff(input: CutOff): TSECUTOFF {
        val dbCutOff = requestMapper.createRequestCutOff(input)
        val resp = callSearchCutoff(dbCutOff)

        val xmlResp = resp.getSubString(1, resp.length().toInt())
        log.info("Cutoff Response:\n$xmlResp")

        return responseMapper.setResponseCutoff(DbTypeToXmlMapper.xmlToTseCutoff(xmlResp))
    }

    fun comdataEsitiEE(input: TSECOMDATAEEREQ): TSECOMDATAEERESP {
        val dbEsitiEE = requestMapper.createRequestEsitiEE(input)
        val resp = callInboundEsitiEE(dbEsitiEE)

        val xmlResp = resp.getSubString(1, resp.length().toInt())
        log.info("EsitiEE Response:\n$xmlResp")

        return responseMapper.setResponseEsitiEE(xmlResp)
    }

    fun comdataEsitiGAS(input: TSECOMDATAGASREQ): TSECOMDATAGASRESP {
        val dbEsitiGas = requestMapper.createRequestEsitiGas(input)
        val resp = callInboundEsitiGas(dbEsitiGas)

        val xmlResp = resp.getSubString(1, resp.length().toInt())
        log.info("EsitiGas Response:\n$xmlResp")

        return responseMapper.setResponseEsitiGas(xmlResp)
    }

    private fun dbConnectInboundCutOff(): SimpleJdbcCall {
        return SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withProcedureName("SEARCH_CUTOFF")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlParameter("in_filtro", Types.CLOB),
                        SqlOutParameter("out_result", Types.CLOB)
                )
    }

    private fun dbConnectInboundEsitiEE(): SimpleJdbcCall {
        return SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withFunctionName("INBOUND_EE")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlOutParameter("out_result", Types.CLOB),
                        SqlParameter("in_tse", Types.CLOB)
                )
    }

    private fun dbConnectInboundEsitiGas(): SimpleJdbcCall {
        return SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withFunctionName("INBOUND_GAS")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlOutParameter("out_result", Types.CLOB),
                        SqlParameter("in_tse", Types.CLOB)
                )
    }

    private fun callProcedure(input: String): MutableMap<String, Any> {
        return dbConnectInboundCutOff().execute(input)
    }

    private fun procedureParams(input: String): Clob {
        val resProcedure = callProcedure(input)

        return resProcedure["out_result"] as Clob
    }

    private fun callSearchCutoff(tse: TICUTOFFType): Clob {
        val tseCutOff = TITSECUTOFFType()
        tseCutOff.getLISTACUTOFF().add(tse)
        val xmlCutoff = DbTypeToXmlMapper.toXml(tseCutOff, "T_I_TSE_CUTOFF")
        log.info("Cutoff Request:\n$xmlCutoff")

        return procedureParams(xmlCutoff)
    }

    private fun callInboundEsitiEE(tse: TITSEEEALLType) : Clob {
        val call = dbConnectInboundEsitiEE()
        val xmlEsitiEE = DbTypeToXmlMapper.toXml(tse, "T_I_TSE_EE_ALL")
        log.info("EsitiEE Request:\n$xmlEsitiEE")

        return call.executeFunction(
                java.sql.Clob::class.java,
                MapSqlParameterSource()
                        .addValue("in_tse", xmlEsitiEE)
        )
    }

    private fun callInboundEsitiGas(tse: TITSEGASALLType) : Clob {
        val call = dbConnectInboundEsitiGas()
        val xmlEsitiGas = DbTypeToXmlMapper.toXml(tse, "T_I_TSE_GAS_ALL")
        log.info("EsitiGas Request:\n$xmlEsitiGas")

        return call.executeFunction(
        java.sql.Clob::class.java,
        MapSqlParameterSource()
                .addValue("in_tse", xmlEsitiGas)
        )
    }

}
