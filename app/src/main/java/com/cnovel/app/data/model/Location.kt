package com.cnovel.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val id: String,
    val name: String,
    val description: String = "",
    val parentLocationId: String? = null,
    val linkedLocations: List<String> = emptyList()
)
