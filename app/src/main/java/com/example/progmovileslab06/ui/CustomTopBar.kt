package com.example.progmovileslab06.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* TODO: abrir drawer si deseas */ }) {
                Icon(Icons.Rounded.Menu, contentDescription = null)
            }
        },
        title = { Text(text = "Sample Title") },
        actions = {
            IconButton(onClick = { /* TODO: buscador */ }) {
                Icon(Icons.Rounded.Search, contentDescription = null)
            }
            IconButton(onClick = {
                navController.navigate("profile")
            }) {
                Icon(Icons.Outlined.AccountCircle, contentDescription = "Perfil de usuario")
            }
        }
    )
}


