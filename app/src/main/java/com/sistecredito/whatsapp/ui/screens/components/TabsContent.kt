package com.sistecredito.whatsapp.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.sistecredito.whatsapp.data.ContentScreen
import com.sistecredito.whatsapp.ui.screens.*

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsContent(
    state: PagerState,
    navController: NavController
) {
    HorizontalPager(
        count = 4,
        state = state
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            when (state.currentPage) {
                0 -> CameraScreen(navController = navController)
                1 -> ContentChatsScreen(
                    itemChat = ContentScreen.ContentChat().list!!
                )
                2 -> ContentStatusScreen(
                    itemStatus = ContentScreen.ContentStatus().list!!
                )
                3 -> ContentCallsScreen(
                    itemCalls = ContentScreen.ContentCalls().list!!
                )
                else -> CameraScreen(navController = navController)
            }
        }
    }
}















