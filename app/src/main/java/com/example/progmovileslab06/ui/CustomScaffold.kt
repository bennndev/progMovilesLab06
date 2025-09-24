package com.example.progmovileslab06.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun CustomScaffold() {
    Scaffold(
        // Barra superior
        topBar = { CustomTopBar() },

        // Barra inferior
        bottomBar = { CustomBottomBar() },

        // Botón flotante personalizado
        floatingActionButton = { CustomFAB() },

        // Contenido principal
        content = { padding ->
            CustomContent(padding)
        }
    )
}



