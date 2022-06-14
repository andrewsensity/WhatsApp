package com.sistecredito.whatsapp.ui.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.TextSnippet
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sistecredito.whatsapp.ui.theme.VerdeWhatsApp

@Composable
fun FloatingActionButton() {
    FloatingActionButton(
        onClick = { },
        shape = CircleShape,
        containerColor = VerdeWhatsApp
    ) {
        Icon(
            imageVector = Icons.Default.TextSnippet,
            contentDescription = null,
            modifier = Modifier.padding(8.dp),
            tint = Color.White
        )
    }
}