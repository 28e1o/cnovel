package com.cnovel.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val id: String,
    val name: String,
    val age: String = "",
    val role: String = "",
    val personality: String = "",
    val background: String = "",
    val relationships: List<Relationship> = emptyList()
)

@Serializable
data class Relationship(
    val targetId: String,
    val label: String = ""
)
