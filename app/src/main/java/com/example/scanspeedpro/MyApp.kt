package com.example.scanspeedpro


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.test.TestScreen
import com.example.abcd.MainActivity

//import com.example.scanner.ScannerScreen
//import com.example.netspeed.NetSpeedScreen
//import com.example.visitingcard.ImageStorageScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
//        composable("scanner") { ScannerScreen() }
//        composable("netspeed") { NetSpeedScreen() }
//        composable("visitingcard") { ImageStorageScreen() }
//        composable("test") { TestScreen() }
        composable("abcd") { MainActivity() }
    }
}
