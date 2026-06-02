package uk.gov.justice.digital.hmpps.imsaiapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImsAiApi

fun main(args: Array<String>) {
  runApplication<ImsAiApi>(*args)
}
