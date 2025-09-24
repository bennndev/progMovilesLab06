package com.example.progmovileslab06.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable

@Composable
fun CustomBottomBar() {
    BottomAppBar {
        IconButton(onClick = { print("Build") }) {
            Icon(Icons.Filled.Build, contentDescription = "Build description")
        }
        IconButton(onClick = { print("Menu") }) {
            Icon(
                Icons.Filled.Menu,
                contentDescription = "Menu description",
            )
        }
        IconButton(onClick = { print("Favorite") }) {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite description",
            )
        }
        IconButton(onClick = { print("Delete") }) {
            Icon(
                Icons.Filled.Delete,
                contentDescription = "Delete description",
            )
        }
    }
}


