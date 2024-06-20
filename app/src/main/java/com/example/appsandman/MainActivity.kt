package com.example.appsandman

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appsandman.ui.theme.AppSandmanTheme
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Dashboard()
        }
    }

    @Preview
    @Composable
    private fun Dashboard() {

        val backgroundImage : Painter = painterResource(id = R.drawable.sandman)

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = backgroundImage,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    text = "Elevate your daydreams\nwith fantasy and elegance",
                    color = Color.White,
                    fontSize = 25.sp,
                    minLines = 2,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(top = 80.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .padding(top = 700.dp, start = 110.dp, end = 4.dp)
                    .align(Alignment.Center)
            ){
                Button(
                    onClick = { }, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                    )
                ) {
                    Text(text = "Get Started",
                        fontSize = 25.sp)
                }
            }
        }
    }
}