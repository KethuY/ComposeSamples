package com.example.composesample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ComposeSampleTheme

class PracticeViewsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtistCard(onClick = {
                        Toast.makeText(this@PracticeViewsActivity,"CLicked",Toast.LENGTH_LONG).show()
                    })
                }
            }
        }
    }
}

@Composable
fun ArtistCard(
    onClick: () -> Unit
) {
    Column( modifier = Modifier.padding(16.dp)) {
        Text("Alfred Sisley", color = MaterialTheme.colors.primary)
        Text("3 minutes ago")
        Spacer(modifier = Modifier.height(8.dp)) // // vertical gap
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box{
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "photo",
                    modifier =
                    Modifier
                        .size(48.dp)
                        .clip(CircleShape)


                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "photo",
                    modifier =
                    Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .align(Alignment.BottomEnd)

                )
            }
            Spacer(modifier = Modifier.width(8.dp)) // horizontal gap
            Column {
                Text("Kethu Satya")
                Text("10 mins ago")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Card(elevation = 4.dp) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "photo",
                    modifier = Modifier
                        .clickable(onClick = onClick)
                        .fillMaxWidth()
                        .size(height = 250.dp, width = 350.dp)
                )
            }
        }
    }

}
