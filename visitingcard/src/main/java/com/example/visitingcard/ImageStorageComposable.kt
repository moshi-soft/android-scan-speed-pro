package com.example.visitingcard

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun ImageStorageScreen() {
    // UI for capturing or selecting an image, and saving with title and tag
    Column {
        Button(onClick = { /* Capture or pick image */ }) {
            Text("Add Image")
        }
        // Fields for title and tag
        TextField(value = "", onValueChange = {}, label = { Text("Title") })
        TextField(value = "", onValueChange = {}, label = { Text("Tag") })
        Button(onClick = { /* Save to database */ }) {
            Text("Save")
        }
    }
}
