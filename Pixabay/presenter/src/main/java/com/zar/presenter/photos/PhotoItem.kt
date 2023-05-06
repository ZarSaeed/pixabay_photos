package com.zar.presenter.photos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zar.presenter.R

@Composable
fun PhotoGridItem(photo: PhotosGridViewModel.Photo) {
    val alpha = 0.5f // adjust alpha value as needed

    Box(modifier = Modifier.height(250.dp)
        .width(150.dp).padding(5.dp)) {
        Image(
            painter = painterResource(R.drawable.kitty),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(250.dp)
                .clip(RoundedCornerShape(8.dp))
                .align(Alignment.Center)
        )
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .clip(RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
            .background(Color.Black.copy(alpha = alpha))
            .padding(4.dp)) {
            Row(modifier = Modifier.align(Alignment.Start)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_person),
                    contentDescription = "Person Icon",
                    modifier = Modifier
                        .size(12.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = photo.userName?:"",
                    fontSize = 11.sp,
                    style = TextStyle(color = Color.White),
                    modifier = Modifier.alpha(alpha = 0.7f)
                )
            }

            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_view),
                    contentDescription = "View Icon",
                    modifier = Modifier
                        .size(12.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = photo.views ?: "",
                    fontSize = 11.sp,
                    style = TextStyle(color = Color.White),
                    modifier = Modifier
                        .weight(1f)
                        .alpha(0.7f))
                Image(
                    painter = painterResource(id = R.drawable.ic_likes),
                    contentDescription = "Person Icon",
                    modifier = Modifier
                        .size(12.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = photo.likes ?: "",
                    fontSize = 11.sp,
                    style = TextStyle(color = Color.White),
                    modifier = Modifier
                        .weight(1f)
                        .alpha(0.7f)
                )
            }
        }

    }
}