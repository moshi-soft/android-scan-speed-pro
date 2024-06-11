package com.example.scanspeedpro

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        Button(onClick = { navController.navigate("scanner") }) {
            Text("Scanner")
        }
        Button(onClick = { navController.navigate("netspeed") }) {
            Text("Net Speed")
        }
        Button(onClick = { navController.navigate("image_storage") }) {
            Text("Image Storage")
        }
    }
}
