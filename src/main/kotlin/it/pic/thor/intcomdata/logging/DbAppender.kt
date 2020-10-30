package it.pic.thor.intcomdata.logging

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.db.DBAppender
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.core.db.ConnectionSourceBase
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.jdbc.core.JdbcTemplate
import java.sql.Connection

class CustomerConnectionSourceBase(val jdbc: JdbcTemplate) : ConnectionSourceBase() {
    override fun getConnection(): Connection {
        return jdbc.dataSource!!.connection
    }
}

/**
 * andiamo a loggare sul database tutti i messaggi di livello warn o error
 */
@Configuration
@Profile("db-logger")
class AdditionalLogging(val jdbc: JdbcTemplate) {
    @Bean fun dbLogger() {
        val lc: LoggerContext = LoggerFactory.getILoggerFactory() as LoggerContext
        val rootLogger: Logger = lc.getLogger(Logger.ROOT_LOGGER_NAME)
        val dbAppender = DBAppender()

        dbAppender.connectionSource = CustomerConnectionSourceBase(jdbc).apply {
            discoverConnectionProperties()
        }

        dbAppender.addFilter(ThresholdFilter().apply{
            setLevel("WARN")
            start()
        })

        dbAppender.start()

        rootLogger.addAppender(dbAppender)
    }
}
