package com.example.netspeed

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun NetSpeedScreen() {
    // UI for displaying and saving network speed
    Column {
        // Network speed test UI and logic
        Button(onClick = { /* Perform speed test */ }) {
            Text("Check Speed")
        }
        Button(onClick = { /* Save to database */ }) {
            Text("Save")
        }
    }
}
