package com.cnovel.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class TimelineEntry(
    val id: String,
    val title: String,
    val description: String = "",
    val date: String = "",
    val order: Int = 0
)
