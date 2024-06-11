package com.example.scanner

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScannerScreen() {
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
