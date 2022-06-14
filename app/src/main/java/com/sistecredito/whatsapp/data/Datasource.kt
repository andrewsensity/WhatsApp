package com.sistecredito.whatsapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeOff
import androidx.compose.ui.graphics.Color
import com.sistecredito.whatsapp.R
import com.sistecredito.whatsapp.ui.theme.BlueWhatsApp

object Datasource {
    val listChats = listOf(
        ItemChatModel(
            image = R.drawable.profile1,
            name = "Santiago",
            message = MessageItemModel(message = "It's great \uD83E\uDD23"),
            date = "6:03 AM",
            iconChecks = ItemCheckModel.SingleCheck()
        ),
        ItemChatModel(
            image = R.drawable.profile2,
            name = "Mariana",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "5:08 AM",
            iconEnd = Icons.Default.VolumeOff,
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemChatModel(
            image = R.drawable.profile3,
            name = "Nayib",
            message = MessageItemModel(message = "Is fantastic, thanks"),
            date = "Yesterday"
        ),
        ItemChatModel(
            image = R.drawable.profile4,
            name = "Karol",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),
        ItemChatModel(
            image = R.drawable.profile5,
            name = "Maritza",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemChatModel(
            image = R.drawable.profile6,
            name = "Vivian",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),
        ItemChatModel(
            image = R.drawable.profile7,
            name = "Sandra",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemChatModel(
            image = R.drawable.profile8,
            name = "Albert",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemChatModel(
            image = R.drawable.profile9,
            name = "Joshua",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemChatModel(
            image = R.drawable.profile10,
            name = "Maria",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconEnd = Icons.Default.VolumeOff
        ),
        ItemChatModel(
            image = R.drawable.profile11,
            name = "Maye",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemChatModel(
            image = R.drawable.profile12,
            name = "Samuel",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemChatModel(
            image = R.drawable.profile13,
            name = "Karla",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemChatModel(
            image = R.drawable.profile14,
            name = "Amparo",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemChatModel(
            image = R.drawable.profile15,
            name = "Linda",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        )
    )
    val listStatus = listOf(
        ItemStatusModel(
            image = R.drawable.profile7,
            name = "Sandra",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemStatusModel(
            image = R.drawable.profile8,
            name = "Albert",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemStatusModel(
            image = R.drawable.profile9,
            name = "Joshua",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemStatusModel(
            image = R.drawable.profile10,
            name = "Maria",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconEnd = Icons.Default.VolumeOff
        ),
        ItemStatusModel(
            image = R.drawable.profile11,
            name = "Maye",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemStatusModel(
            image = R.drawable.profile12,
            name = "Samuel",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemStatusModel(
            image = R.drawable.profile13,
            name = "Karla",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemStatusModel(
            image = R.drawable.profile14,
            name = "Amparo",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemStatusModel(
            image = R.drawable.profile1,
            name = "Santiago",
            message = MessageItemModel(message = "It's great \uD83E\uDD23"),
            date = "6:03 AM",
            iconChecks = ItemCheckModel.SingleCheck()
        ),
        ItemStatusModel(
            image = R.drawable.profile2,
            name = "Mariana",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "5:08 AM",
            iconEnd = Icons.Default.VolumeOff,
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemStatusModel(
            image = R.drawable.profile3,
            name = "Nayib",
            message = MessageItemModel(message = "Is fantastic, thanks"),
            date = "Yesterday"
        ),
        ItemStatusModel(
            image = R.drawable.profile4,
            name = "Karol",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),
        ItemStatusModel(
            image = R.drawable.profile5,
            name = "Maritza",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemStatusModel(
            image = R.drawable.profile6,
            name = "Vivian",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),
        ItemStatusModel(
            image = R.drawable.profile15,
            name = "Linda",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        )
    )
    val listCalls = listOf(
        ItemCallsModel(
            image = R.drawable.profile3,
            name = "Nayib",
            message = MessageItemModel(message = "Is fantastic, thanks"),
            date = "Yesterday"
        ),
        ItemCallsModel(
            image = R.drawable.profile4,
            name = "Karol",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),
        ItemCallsModel(
            image = R.drawable.profile5,
            name = "Maritza",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemCallsModel(
            image = R.drawable.profile6,
            name = "Vivian",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconChecks = ItemCheckModel.DoubleCheck()
        ),ItemCallsModel(
            image = R.drawable.profile1,
            name = "Santiago",
            message = MessageItemModel(message = "It's great \uD83E\uDD23"),
            date = "6:03 AM",
            iconChecks = ItemCheckModel.SingleCheck()
        ),
        ItemCallsModel(
            image = R.drawable.profile2,
            name = "Mariana",
            message = MessageItemModel(message = "\uD83E\uDD23"),
            date = "5:08 AM",
            iconEnd = Icons.Default.VolumeOff,
            iconChecks = ItemCheckModel.DoubleCheck(color = BlueWhatsApp)
        ),
        ItemCallsModel(
            image = R.drawable.profile7,
            name = "Sandra",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemCallsModel(
            image = R.drawable.profile8,
            name = "Albert",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemCallsModel(
            image = R.drawable.profile9,
            name = "Joshua",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday"
        ),
        ItemCallsModel(
            image = R.drawable.profile10,
            name = "Maria",
            message = MessageItemModel(message = "It's great"),
            date = "Yesterday",
            iconEnd = Icons.Default.VolumeOff
        ),
        ItemCallsModel(
            image = R.drawable.profile11,
            name = "Maye",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemCallsModel(
            image = R.drawable.profile12,
            name = "Samuel",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemCallsModel(
            image = R.drawable.profile13,
            name = "Karla",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemCallsModel(
            image = R.drawable.profile14,
            name = "Amparo",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        ),
        ItemCallsModel(
            image = R.drawable.profile15,
            name = "Linda",
            message = MessageItemModel(message = "It's great"),
            date = "6/8/22"
        )
    )
    val pages = listOf(
        "",
        "CHATS",
        "STATUS",
        "CALLS"
    )
}