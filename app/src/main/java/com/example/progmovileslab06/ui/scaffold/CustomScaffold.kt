package com.example.progmovileslab06.ui.scaffold

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun CustomScaffold() {
    Scaffold(
        topBar = { CustomTopBar() },
        bottomBar = { CustomBottomBar() },
        floatingActionButton = { CustomFAB() },
        content = { padding ->
            CustomContent(padding)
        }
    )
}
