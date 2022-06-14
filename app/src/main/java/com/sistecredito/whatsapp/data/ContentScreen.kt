package com.sistecredito.whatsapp.data

import androidx.compose.runtime.Composable
import com.sistecredito.whatsapp.data.Datasource.listCalls
import com.sistecredito.whatsapp.data.Datasource.listChats
import com.sistecredito.whatsapp.data.Datasource.listStatus

sealed class ContentScreen<T>(val list: List<T>?) {
    class ContentChat(list: List<ItemChatModel> = listChats) : ContentScreen<ItemChatModel>(list = list)
    class ContentStatus(list: List<ItemStatusModel> = listStatus) : ContentScreen<ItemStatusModel>(list = list)
    class ContentCalls(list: List<ItemCallsModel> = listCalls) : ContentScreen<ItemCallsModel>(list = list)
    object CameraScreen: ContentScreen<Composable>(list = null)
}
