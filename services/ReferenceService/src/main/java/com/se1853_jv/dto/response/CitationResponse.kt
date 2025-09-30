package com.se1853_jv.dto.response

data class CitationResponse(
    val id: String,
    val authors: String,
    val title: String,
    val journal: String,
    val year: Int,
    val doi: String
)