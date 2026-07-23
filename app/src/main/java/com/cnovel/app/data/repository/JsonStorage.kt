package com.cnovel.app.data.repository

import android.content.Context
import com.cnovel.app.data.model.Project
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

class JsonStorage(private val context: Context) : ProjectRepository {

    private val json = Json { prettyPrint = true }
    private val dir: File get() = File(context.filesDir, "projects")

    override suspend fun getProjects(): List<Project> = withContext(Dispatchers.IO) {
        val list = mutableListOf<Project>()
        dir.mkdirs()
        dir.listFiles()?.forEach { file ->
            try {
                val text = file.readText()
                list.add(json.decodeFromString<Project>(text))
            } catch (_: Exception) { }
        }
        list.sortedByDescending { it.updatedAt }
    }

    override suspend fun getProject(id: String): Project? = withContext(Dispatchers.IO) {
        val file = File(dir, "$id.json")
        if (file.exists()) {
            try {
                json.decodeFromString<Project>(file.readText())
            } catch (_: Exception) { null }
        } else null
    }

    override suspend fun saveProject(project: Project) = withContext(Dispatchers.IO) {
        dir.mkdirs()
        val file = File(dir, "${project.id}.json")
        file.writeText(json.encodeToString(project.copy(updatedAt = System.currentTimeMillis())))
    }

    override suspend fun deleteProject(id: String) = withContext(Dispatchers.IO) {
        File(dir, "$id.json").delete()
        Unit
    }
}
