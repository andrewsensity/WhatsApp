package com.sistecredito.whatsapp.data

import androidx.compose.ui.graphics.vector.ImageVector

data class ItemStatusModel(
    val image: Int,
    val name: String,
    val message: MessageItemModel,
    val date: String,
    val iconChecks: ItemCheckModel? = null,
    val iconEnd: ImageVector? = null
)
