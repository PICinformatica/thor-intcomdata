package it.pic.thor.intcomdata.db

import it.edison.thorCutOff.CutOff
import it.edison.thorCutOff.TSECUTOFF
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.SqlOutParameter
import org.springframework.jdbc.core.SqlParameter
import org.springframework.jdbc.core.simple.SimpleJdbcCall
import org.springframework.stereotype.Component
import java.sql.Clob
import java.sql.Types

@Component
class CutoffController(private val db: JdbcTemplate) {
    private val requestMapper = RequestMapper()
    private val responseMapper = ResponseMapper()

    fun cutoff(input: CutOff): TSECUTOFF {
        val tseCutOff = TITSECUTOFFType().apply {
            this.getLISTACUTOFF().add(requestMapper.createRequestCutOff(input))
        }

        val listaCutoff = searchCutoff(tseCutOff).getLISTACUTOFF().map { it.id }

        if (listaCutoff.isNotEmpty()) {
            generateCutoff(listaCutoff)
        }

        return responseMapper.setResponseCutoff(searchCutoff(tseCutOff))
    }

    private fun generateCutoff(listaCutoff: List<String>) {
        SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withProcedureName("GENERA_FILE_CUTOFF")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlParameter("i_lista_cutoff", Types.CLOB)
                ).execute(listaCutoff.joinToString(";"))
    }

    private fun searchCutoff(tseCutOff: TITSECUTOFFType): TITSECUTOFFType {
        val xmlCutoff = DbTypeToXmlMapper.toXml(tseCutOff, "T_I_TSE_CUTOFF")
        val resProcedure = SimpleJdbcCall(db)
                .withSchemaName("THOR_COMDATA")
                .withCatalogName("PKG_COMDATA_AWS")
                .withProcedureName("SEARCH_CUTOFF")
                .withoutProcedureColumnMetaDataAccess()
                .declareParameters(
                        SqlParameter("in_filtro", Types.CLOB),
                        SqlOutParameter("out_result", Types.CLOB)
                ).execute(xmlCutoff)
        val resp = resProcedure["out_result"] as Clob
        val xmlResp = resp.getSubString(1, resp.length().toInt())
        return DbTypeToXmlMapper.xmlToTseCutoff(xmlResp)
    }
}
