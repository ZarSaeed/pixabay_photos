package com.zar.presenter.photos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zar.presenter.PixabayTheme
import com.zar.presenter.R

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PixabayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PhotosGrid()
                }
            }
        }
    }
}
data class Photo(val imageUrl: String?,val views: String?,val likes: String?, val userName: String?)
val list = listOf<Photo>(
    Photo("","100","102","Zar"),
    Photo("","100","102","Saif"),
    Photo("","100","102","Ameen"))

@Composable
fun PhotosGrid(
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
    ) {
        items(list) {
            PhotoGridItem(it)
        }
    }
}

@Composable
fun PhotoGridItem(photo: Photo) {
    val alpha = 0.5f // adjust alpha value as needed

    Box(modifier = Modifier.size(150.dp).padding(5.dp)) {
        Image(
            painter = painterResource(R.drawable.kitty),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(8.dp))
                .align(Center)
        )
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .width(150.dp)
            .clip(RoundedCornerShape(0.dp, 0.dp, 8.dp, 8.dp))
            .background(Color.Black.copy(alpha = alpha))
            .padding(4.dp)) {
            Row(modifier = Modifier.align(Start)) {
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
                modifier = Modifier
                    .width(150.dp),
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


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PixabayTheme {
        PhotosGrid()
    }
}
