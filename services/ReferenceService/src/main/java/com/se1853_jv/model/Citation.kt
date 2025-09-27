package com.se1853_jv.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Pattern

@Table
@Entity
data class Citation(
    @Id
    val id: String? = null,

    @Column(length = 255, nullable = false)
    val authors: String? = null,

    @Column(length = 255, nullable = false)
    val title: String? = null,

    @Column(length = 255, nullable = false)
    val journal: String? = null,

    @Column(nullable = false, length = 4)
    val year: Int? = null,

    @Column(length = 255, nullable = false)
    @field:Pattern(
        regexp = "^10\\.\\d{4,9}/[-._;()/:A-Z0-9]+$",
        message = "Invalid DOI format"
    )
    val doi: String? = null
)