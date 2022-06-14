package com.sistecredito.whatsapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeOff
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.sistecredito.whatsapp.R
import com.sistecredito.whatsapp.data.ItemCallsModel
import com.sistecredito.whatsapp.data.ItemCheckModel
import com.sistecredito.whatsapp.data.MessageItemModel

@Composable
fun ContentCallsScreen(
    itemCalls: List<ItemCallsModel>
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(itemCalls) { item ->
            ContentCall(
                itemCalls = item
            )
        }
    }
}

@Composable
fun ContentCall(
    itemCalls: ItemCallsModel
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SubcomposeAsyncImage(
            model = itemCalls.image,
            loading = {
                CircularProgressIndicator()
            },
            contentDescription = itemCalls.name,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = itemCalls.name,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = itemCalls.date,
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (itemCalls.iconChecks != null) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = itemCalls.iconChecks.icon!!,
                            contentDescription = null,
                            tint = itemCalls.iconChecks.color!!,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = itemCalls.message.message,
                            style = MaterialTheme.typography.labelLarge,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray
                        )
                    }
                } else {
                    Text(
                        text = itemCalls.message.message,
                        style = MaterialTheme.typography.labelLarge,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Gray
                    )
                }
                if (itemCalls.iconEnd != null) {
                    Icon(imageVector = itemCalls.iconEnd, contentDescription = null)
                }
            }
        }
    }
}

@Preview
@Composable
fun ItemCallsScreenPrev() {
    ContentCall(
        itemCalls =
        ItemCallsModel(
            image = R.drawable.profile1,
            name = "Santiago",
            message = MessageItemModel(message = "It's great"),
            date = "6:03 AM",
            iconChecks = ItemCheckModel.SingleCheck(),
            iconEnd = Icons.Default.VolumeOff
        )
    )
}