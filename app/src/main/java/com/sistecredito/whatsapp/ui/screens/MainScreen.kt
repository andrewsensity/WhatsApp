package com.sistecredito.whatsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.sistecredito.whatsapp.ui.screens.components.Screens
import com.sistecredito.whatsapp.ui.screens.components.Tabs
import com.sistecredito.whatsapp.ui.screens.components.TabsContent

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainScreen(
    navController: NavController
) {
    val pagerState = rememberPagerState(initialPage = 0)
    Column {
        Tabs(state = pagerState)
        TabsContent(
            state = pagerState,
            navController = navController
        )
    }
}

@Preview
@Composable
fun MainScreenPrev() {
    MainScreen(navController = rememberNavController())
}