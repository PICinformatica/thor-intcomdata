package it.pic.thor.intcomdata

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@ConfigurationProperties(prefix = "app.credentials.comdata")
class ComdataCredentials {
    lateinit var user: String
    lateinit var pass: String
}

@EnableWebSecurity
class SecurityConfig(

) {
    @Profile("!prod")
    @Bean
    fun fileAuth(): WebSecurityConfigurerAdapter {
        return object : WebSecurityConfigurerAdapter() {
            override fun configure(http: HttpSecurity) {
                http
                    .anonymous().authorities("ANON")
                    .and().csrf().disable()
                    .authorizeRequests { authorize ->
                        authorize.anyRequest().permitAll()
                    }
                    .httpBasic()
            }
        }
    }
    @Profile("prod")
    @Bean
    fun fileAuthProd(comdata: ComdataCredentials): WebSecurityConfigurerAdapter {
        return object : WebSecurityConfigurerAdapter() {
            override fun configure(auth: AuthenticationManagerBuilder?) {
                /* {noop} è l'encoder */
                auth!!.inMemoryAuthentication()
                        .withUser(comdata.user).password("{noop}${comdata.pass}").roles("BPEL")
            }

            override fun configure(http: HttpSecurity) {
                http
                        .anonymous().authorities("ANON")
                        .and().csrf().disable()
                        .authorizeRequests { authorize ->
                            authorize
                                    .antMatchers("/comdata/*").hasRole("BPEL")
                                    .anyRequest().permitAll()
                        }
                        .httpBasic()
            }
        }
    }
}
