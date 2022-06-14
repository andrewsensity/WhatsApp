package com.sistecredito.whatsapp.ui.screens.components

sealed class Screens(val route: String) {
    object Main : Screens(route = "main")
    object Camera : Screens(route = "camera")
}