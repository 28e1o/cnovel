package com.cnovel.app.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Chapter(
    val id: String,
    val title: String,
    val content: String = "",
    val order: Int = 0,
    val wordTarget: Int = 0,
    val sceneIds: List<String> = emptyList()
)

@Serializable
data class Scene(
    val id: String,
    val title: String,
    val content: String = "",
    val order: Int = 0,
    val referencedEntities: List<String> = emptyList()
)
