package com.sistecredito.whatsapp.ui.screens.components

import android.widget.Toast
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sistecredito.whatsapp.ui.theme.VerdeWhatsApp

@Composable
fun CustomTopBar() {
    val context = LocalContext.current
    SmallTopAppBar(
        title = {
            Text(
                text = "WhatsApp",
                color = Color.White,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 18.sp
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = VerdeWhatsApp
        ),
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Working the search", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(25.dp)
                )
            }
            Spacer(modifier = Modifier.width(0.dp))
            IconButton(onClick = {
                Toast.makeText(context, "Working menu more", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(25.dp)
                )
            }
            Spacer(modifier = Modifier.width(0.dp))
        }
    )
}