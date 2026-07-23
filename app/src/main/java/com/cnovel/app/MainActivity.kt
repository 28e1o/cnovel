package com.cnovel.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cnovel.app.data.repository.JsonStorage
import com.cnovel.app.ui.screens.HomeScreen
import com.cnovel.app.ui.theme.CNovelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = JsonStorage(applicationContext)
        setContent {
            CNovelTheme {
                CNovelApp(repository)
            }
        }
    }
}

@Composable
fun CNovelApp(repository: JsonStorage) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                repository = repository,
                onProjectClick = { projectId ->
                    // TODO: navigate to project detail screen
                }
            )
        }
    }
}
