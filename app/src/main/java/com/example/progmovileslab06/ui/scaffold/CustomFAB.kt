package com.example.progmovileslab06.ui.scaffold

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun CustomFAB(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick) {
        Text(
            fontSize = 24.sp,
            text = "+"
        )
    }
}