package com.example.appsandman

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Login {

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("NotConstructor")
    @Composable
    fun LoginScreen() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Blue.copy(alpha = 0.4f)
                        )
                    )
                )
        ) {
            val backgroundImage: Painter = painterResource(id = R.drawable.morpheus)
            Image(
                painter = backgroundImage,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 350.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Only you and I know about\n" +
                            "your dreams. Only you and \n" +
                            "that server know your password. " +
                            "Don't expose your dreams or " +
                            "your passwords to anyone else.",
                    color = Color.White,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 80.dp)
                )

                var text1 by rememberSaveable { mutableStateOf("") }
                TextField(
                    value = text1,
                    onValueChange = { text1 = it },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.login),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                                .padding(top = 6.dp, start = 8.dp, end = 8.dp)
                        )
                    },
                    label = { Text(text = "Login") },
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White,
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp, vertical = 20.dp)
                        .background(Color.White, CircleShape)
                )

                var text2 by rememberSaveable { mutableStateOf("") }
                TextField(
                    value = text2,
                    onValueChange = { text2 = it },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.senha),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                                .padding(top = 6.dp, start = 8.dp, end = 8.dp)
                        )
                    },
                    label = { Text(text = "Password") },
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White,
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp, vertical = 20.dp)
                        .background(Color.White, CircleShape)
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                        .padding(top = 0.dp, start = 150.dp, end = 4.dp)
                ){
                    Button(
                        onClick = { }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Blue,
                        )
                    ) {
                        Text(text = "Enter",
                            fontSize = 25.sp)
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun LoginPreview() {
        LoginScreen()
    }
}
