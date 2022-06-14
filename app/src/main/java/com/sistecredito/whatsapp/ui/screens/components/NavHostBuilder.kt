package com.sistecredito.whatsapp.ui.screens.components

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.sistecredito.whatsapp.ui.screens.CameraScreen
import com.sistecredito.whatsapp.ui.screens.MainScreen

fun NavGraphBuilder.mainGraph(navHostController: NavHostController) {
    composable(Screens.Main.route) {
        MainScreen(navController = navHostController)
    }
    composable(Screens.Camera.route) {
        CameraScreen(navController = navHostController)
    }
}