package com.example.progmovileslab06.ui.scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.progmovileslab06.ui.screens.HomeScreen
import com.example.progmovileslab06.ui.screens.NotificationsScreen
import com.example.progmovileslab06.ui.screens.ProfileScreen
import com.example.progmovileslab06.ui.screens.SearchScreen
import com.example.progmovileslab06.ui.screens.SettingsScreen

@Composable
fun CustomScaffold() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = { CustomFAB() },
        content = { padding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(padding)
            ) {
                composable("home") { HomeScreen() }
                composable("search") { SearchScreen() }
                composable("notifications") { NotificationsScreen() }
                composable("settings") { SettingsScreen() }
                composable("profile") { ProfileScreen() }
            }
        }
    )
}