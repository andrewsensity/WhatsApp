package com.sistecredito.whatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.sistecredito.whatsapp.ui.screens.components.CustomNavHost
import com.sistecredito.whatsapp.ui.screens.components.CustomTopBar
import com.sistecredito.whatsapp.ui.screens.components.FloatingActionButton
import com.sistecredito.whatsapp.ui.screens.components.Screens
import com.sistecredito.whatsapp.ui.theme.WhatsAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppTheme {
                Scaffold(
                    modifier = Modifier,
                    topBar = { CustomTopBar() },
                    floatingActionButton = { FloatingActionButton() }
                ) {
                    Column(modifier = Modifier.padding(it)) {
                        CustomNavHost(
                            navHostController = rememberNavController(),
                            startDestination = Screens.Main.route
                        )
                    }
                }
            }
        }
    }
}