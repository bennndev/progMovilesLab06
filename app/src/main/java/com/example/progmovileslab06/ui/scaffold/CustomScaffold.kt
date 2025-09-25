package com.example.progmovileslab06.ui.scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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


    var fabClickCount by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController) },
        floatingActionButton = { CustomFAB { fabClickCount++ } },
        content = { padding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(padding)
            ) {
                composable("home") { CustomContent(padding, fabClickCount) }
                composable("search") { SearchScreen() }
                composable("notifications") { NotificationsScreen() }
                composable("settings") { SettingsScreen() }
                composable("profile") { ProfileScreen() }
            }
        }
    )
}