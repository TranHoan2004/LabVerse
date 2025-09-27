package com.se1853_jv.controller

import com.se1853_jv.dto.response.CitationResponse
import com.se1853_jv.service.CitationService
import lombok.AccessLevel
import lombok.experimental.FieldDefaults
import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/citations")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class CitationController(val service: CitationService) {

    @GetMapping("/{id}")
    fun getCitationById(@PathVariable id: String): ResponseEntity<CitationResponse> {
        logger.info { "Citation with id: $id" }
        logger.info { "Citation found: ${service.getCitationById(id)}" }
        return ResponseEntity.ok(service.getCitationById(id))
    }
}