package com.sistecredito.whatsapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ItemCheckModel(val icon: ImageVector?, val color: Color?) {
    class SingleCheck(
        icon: ImageVector? = Icons.Default.Done,
        color: Color? = Color.Gray
    ) : ItemCheckModel(icon = icon, color = color)

    class DoubleCheck(
        icon: ImageVector? = Icons.Default.DoneAll,
        color: Color? = Color.Gray
    ) : ItemCheckModel(icon = icon, color = color)
}