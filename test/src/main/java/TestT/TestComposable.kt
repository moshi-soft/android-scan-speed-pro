package com.example.test

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun TestScreen() {
    // UI for scanning and saving the result
    Column {
        // Scanner UI and logic
        Button(onClick = { /* Perform scan */ }) {
            Text("Scan")
        }
        Button(onClick = { /* Save to database */ }) {
            Text("Save")
        }
    }
}
