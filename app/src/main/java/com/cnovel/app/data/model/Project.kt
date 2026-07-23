package com.cnovel.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Project(
    val id: String,
    val title: String,
    val description: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis(),
    val chapters: List<Chapter> = emptyList(),
    val characters: List<Character> = emptyList(),
    val locations: List<Location> = emptyList(),
    val timeline: List<TimelineEntry> = emptyList(),
    val notes: List<Note> = emptyList()
)
