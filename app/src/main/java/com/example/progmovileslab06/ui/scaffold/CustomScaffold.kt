package com.example.progmovileslab06.ui.scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.progmovileslab06.ui.screens.ProfileScreen

@Composable
fun CustomScaffold() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar() },
        floatingActionButton = { CustomFAB() },
        content = { padding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = androidx.compose.ui.Modifier.padding(padding)
            ) {
                composable("home") { CustomContent(padding) }
                composable("profile") { ProfileScreen() }
            }
        }
    )
}
