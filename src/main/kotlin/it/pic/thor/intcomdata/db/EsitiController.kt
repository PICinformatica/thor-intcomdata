package it.pic.thor.intcomdata.db

import it.edison.thorEE.TSECOMDATAEEREQ
import it.edison.thorEE.TSECOMDATAEERESP
import it.edison.thorGAS.TSECOMDATAGASREQ
import it.edison.thorGAS.TSECOMDATAGASRESP
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.SqlOutParameter
import org.springframework.jdbc.core.SqlParameter
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.simple.SimpleJdbcCall
import org.springframework.stereotype.Component
import java.sql.Clob
import java.sql.Types


@Component
class EsitiController(private val db: JdbcTemplate) {
    private val requestMapper = RequestMapper()
    private val responseMapper = ResponseMapper()

    fun esitiEE(input: TSECOMDATAEEREQ): TSECOMDATAEERESP {
        val dbEsitiEE = requestMapper.createRequestEsitiEE(input)
        val resp = callInboundEsitiEE(dbEsitiEE)
        val xmlResp = resp.getSubString(1, resp.length().toInt())
        return responseMapper.setResponseEsitiEE(xmlResp)
    }

    fun esitiGas(input: TSECOMDATAGASREQ): TSECOMDATAGASRESP {
        val dbEsitiGas = requestMapper.createRequestEsitiGas(input)
        val resp = callInboundEsitiGas(dbEsitiGas)
        val xmlResp = resp.getSubString(1, resp.length().toInt())
        return responseMapper.setResponseEsitiGas(xmlResp)
    }

    private fun callInboundEsitiEE(tse: TITSEEEALLType): Clob {
        val call = SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withFunctionName("INBOUND_EE")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlOutParameter("out_result", Types.CLOB),
                        SqlParameter("in_tse", Types.CLOB)
                )
        val xmlEsitiEE = DbTypeToXmlMapper.toXml(tse, "T_I_TSE_EE_ALL")

        return call.executeFunction(
                java.sql.Clob::class.java,
                MapSqlParameterSource()
                        .addValue("in_tse", xmlEsitiEE)
        )
    }

    private fun callInboundEsitiGas(tse: TITSEGASALLType): Clob {
        val call = SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withFunctionName("INBOUND_GAS")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlOutParameter("out_result", Types.CLOB),
                        SqlParameter("in_tse", Types.CLOB)
                )
        val xmlEsitiGas = DbTypeToXmlMapper.toXml(tse, "T_I_TSE_GAS_ALL")

        return call.executeFunction(
                java.sql.Clob::class.java,
                MapSqlParameterSource()
                        .addValue("in_tse", xmlEsitiGas)
        )
    }

}
