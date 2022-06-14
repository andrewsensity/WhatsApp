package com.sistecredito.whatsapp.ui.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.sistecredito.whatsapp.data.Datasource
import com.sistecredito.whatsapp.ui.theme.VerdeWhatsApp
import com.sistecredito.whatsapp.ui.theme.VerdeWhatsAppText
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(
    state: PagerState
) {
    val pages = Datasource.pages
    val scope = rememberCoroutineScope()
    val newMessage by remember { mutableStateOf(true) }
    val quantityNotification = 1
    TabRow(
        selectedTabIndex = state.currentPage,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[state.currentPage]),
                color = Color.White
            )
        },
        modifier = Modifier.height(40.dp),
        containerColor = VerdeWhatsApp
    ) {
        pages.forEachIndexed { index, title ->
            Tab(
                selected = state.currentPage == index,
                onClick = {
                    scope.launch {
                        state.animateScrollToPage(index)
                    }
                },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Blue
            ) {
                if (index == 0) {
                    Icon(
                        imageVector = Icons.Default.PhotoCamera,
                        contentDescription = null,
                        tint = VerdeWhatsAppText,
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .size(22.dp)
                            .clickable {

                            }
                    )
                } else {
                    Row {
                        Text(
                            text = title,
                            color = if (state.currentPage == index) Color.White else VerdeWhatsAppText,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        if (newMessage) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Box(
                                modifier = Modifier
                                    .size(if (quantityNotification < 10) 18.dp else 20.dp)
                                    .clip(CircleShape)
                                    .background(Color.White),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "$quantityNotification",
                                    style = if (quantityNotification < 10) MaterialTheme.typography.labelMedium else MaterialTheme.typography.labelSmall,
                                    color = VerdeWhatsApp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}