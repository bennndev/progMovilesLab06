package com.example.progmovileslab06.ui.scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomContent(padding: PaddingValues, fabClickCount: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(24.dp)
    ) {
        Text(text = "My app content")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Has presionado el botón $fabClickCount veces")
    }
}