package br.com.indicativo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class IndicativoApplication

fun main(args: Array<String>) {
	runApplication<br.com.indicativo.IndicativoApplication>(*args)
}
