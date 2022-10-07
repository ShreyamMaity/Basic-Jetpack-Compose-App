package com.dscnsec.thursdaytrivia1

import android.os.Bundle
import android.provider.CalendarContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dscnsec.thursdaytrivia1.ui.theme.ThursdayTrivia1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTrivia1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter =  painterResource(id = R.drawable.download),
                            contentDescription = "Compose Logo",
                            alignment = Alignment.Center,
                            modifier = Modifier.size(400.dp)
                        )
                        CstmText("GDSC NSEC", color = Color.Blue)
                        Icon(Icons.Filled.Favorite, contentDescription = "heart icon", modifier = Modifier.size(90.dp),tint = Color.Red)
                        CstmText("Jetpack Compose", color = Color.Black)
                    }
                }
            }
        }
    }
}

@Composable
fun CstmText(title: String, color: Color) {
    //add an image
    Text(text = title, modifier = Modifier.padding(30.dp) , color = color, fontSize = 30.sp)
}
