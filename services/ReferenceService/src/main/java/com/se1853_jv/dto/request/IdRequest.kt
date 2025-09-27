package com.se1853_jv.dto.request

import lombok.AccessLevel
import lombok.experimental.FieldDefaults

@FieldDefaults(level = AccessLevel.PRIVATE)
data class IdRequest (
    val id: String
)