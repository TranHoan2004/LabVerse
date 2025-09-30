package com.se1853_jv.repository

import com.se1853_jv.model.Citation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CitationRepository : JpaRepository<Citation, String>