package com.sistecredito.whatsapp.ui.screens.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun CustomNavHost(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination,
        builder = {
            mainGraph(navHostController = navHostController)
        }
    )
}