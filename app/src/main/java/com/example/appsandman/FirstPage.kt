package com.example.appsandman

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateDecay
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent

class FirstPage {
    @OptIn(ExperimentalMaterial3Api::class, InternalCoroutinesApi::class,
        ExperimentalComposeUiApi::class
    )
    @SuppressLint("NotConstructor", "Range")
    @Composable
    fun FirstPage() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#07021e"))),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var text1 by rememberSaveable { mutableStateOf("") }
            TextField(
                value = text1,
                onValueChange = { text1 = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.lupa),
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                            .padding(top = 6.dp, start = 8.dp, end = 8.dp)
                    )
                },
                label = { Text(text = "Search") },
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
                    .padding(1.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    text = "Choose somebody",
                    color = Color.White,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(top = 2.dp)
                )

                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 40.dp),
                    verticalArrangement = Arrangement.spacedBy(13.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .weight(1f),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(android.graphics.Color.parseColor("#07023e"))
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(15.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#07021e"))
                                    )
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.death),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(android.graphics.Color.parseColor("#07021e"))
                                ),
                                shape = RoundedCornerShape(20.dp)
                            ) {
                                Text(
                                    text = "Death",
                                    fontSize = 20.sp
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .weight(1f),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(android.graphics.Color.parseColor("#07023e"))
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(16.dp)

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.dream),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Button(
                                    onClick = { },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(android.graphics.Color.parseColor("#07021e"))
                                    ),
                                    shape = RoundedCornerShape(20.dp)
                                ) {
                                    Text(
                                        text = "Dream",
                                        fontSize = 20.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .weight(1f),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(android.graphics.Color.parseColor("#07023e"))
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(15.dp)
                                .background(
                                    color = Color(android.graphics.Color.parseColor("#07021e"))
                                )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.desire),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .size(180.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Button(
                            onClick = { },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(android.graphics.Color.parseColor("#07021e"))
                            ),
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Text(
                                text = "Desire",
                                fontSize = 20.sp
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .weight(1f),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(android.graphics.Color.parseColor("#07023e"))
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(16.dp)

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.destruction),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .size(180.dp),
                                contentScale = ContentScale.Crop
                            )

                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(android.graphics.Color.parseColor("#07021e"))
                                ),
                                shape = RoundedCornerShape(20.dp)
                            ) {
                                Text(
                                    text = "Destruction",
                                    fontSize = 20.sp
                                )
                            }
                        }
                    }
                }
            }
            /*Box(
                modifier = Modifier
                    .padding(20.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    text = "Application built by\na Gaiman's fan work.",
                    color = Color.White,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(top = 1.dp)
                )
            } */

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(
                        color = Color(android.graphics.Color.parseColor("#07021e"))
                    )
                    .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                    .shadow(3.dp, shape = RoundedCornerShape(20.dp))

            ) {
                val home: Painter = painterResource(id = R.drawable.home)
                val interaction: Painter = painterResource(id = R.drawable.interaction)
                val logout: Painter = painterResource(id = R.drawable.logout)
                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(80.dp)

                ) {
                    Image(
                        painter = home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(top = 6.dp, start = 8.dp, end = 8.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(80.dp)

                ) {
                    Image(
                        painter = interaction,
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .padding(top = 1.dp, start = 3.dp, end = 8.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, bottom = 12.dp, end = 12.dp)
                        .height(90.dp)
                        .width(80.dp)

                ) {
                    Image(
                        painter = logout,
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .padding(top = 1.dp, start = 3.dp, end = 8.dp)
                    )
                }
            }
        }
    }

    @Preview
    @Composable
    private fun previewFirstPage() {
        FirstPage()
    }
}
