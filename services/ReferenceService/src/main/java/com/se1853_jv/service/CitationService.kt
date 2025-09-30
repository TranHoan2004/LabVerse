package com.se1853_jv.service

import com.se1853_jv.dto.response.CitationResponse
import com.se1853_jv.model.Citation

interface CitationService {
    fun getCitationById(id: String): CitationResponse?
    fun getCitationByAuthors(authors: String): CitationResponse
    fun getCitationsByJournal(journal: String): List<CitationResponse>
    fun getCitationsByYear(year: Int): List<CitationResponse>
    fun getCitationByDoi(doi: String): CitationResponse

    fun createNewCitation(citation: Citation)
    fun updateCitation(citation: Citation)
    fun deleteCitationById(id: String)
    fun deleteCitationsByYear(year: Int)
}