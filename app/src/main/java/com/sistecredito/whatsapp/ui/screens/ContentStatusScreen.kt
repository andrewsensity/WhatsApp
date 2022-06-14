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
import com.sistecredito.whatsapp.data.ItemCheckModel
import com.sistecredito.whatsapp.data.ItemStatusModel
import com.sistecredito.whatsapp.data.MessageItemModel

@Composable
fun ContentStatusScreen(
    itemStatus: List<ItemStatusModel>
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(itemStatus) { item ->
            ContentStatus(
                itemStatus = item
            )
        }
    }
}

@Composable
fun ContentStatus(
    itemStatus: ItemStatusModel
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SubcomposeAsyncImage(
            model = itemStatus.image,
            loading = {
                CircularProgressIndicator()
            },
            contentDescription = itemStatus.name,
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
                    text = itemStatus.name,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = itemStatus.date,
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (itemStatus.iconChecks != null) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = itemStatus.iconChecks.icon!!,
                            contentDescription = null,
                            tint = itemStatus.iconChecks.color!!,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = itemStatus.message.message,
                            style = MaterialTheme.typography.labelLarge,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray
                        )
                    }
                } else {
                    Text(
                        text = itemStatus.message.message,
                        style = MaterialTheme.typography.labelLarge,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Gray
                    )
                }
                if (itemStatus.iconEnd != null) {
                    Icon(imageVector = itemStatus.iconEnd, contentDescription = null)
                }
            }
        }
    }
}

@Preview
@Composable
fun ItemStatusScreenPrev() {
    ContentStatus(
        itemStatus =
        ItemStatusModel(
            image = R.drawable.profile1,
            name = "Santiago",
            message = MessageItemModel(message = "It's great"),
            date = "6:03 AM",
            iconChecks = ItemCheckModel.SingleCheck(),
            iconEnd = Icons.Default.VolumeOff
        )
    )
}