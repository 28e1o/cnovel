package com.cnovel.app.data.repository

import com.cnovel.app.data.model.*

interface ProjectRepository {
    suspend fun getProjects(): List<Project>
    suspend fun getProject(id: String): Project?
    suspend fun saveProject(project: Project)
    suspend fun deleteProject(id: String)
}
