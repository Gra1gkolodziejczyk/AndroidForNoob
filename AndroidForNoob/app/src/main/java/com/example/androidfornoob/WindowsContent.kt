package com.example.androidfornoob

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
public fun Home(navController: NavController){

    val image: Painter = painterResource(id = R.drawable.android)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = image,
                    contentDescription = "Description de l'image Android",
                    modifier = Modifier
                        .size(200.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    "J'adore le développement Android !",
                    fontSize = 20.sp,
                    color = Color.Green
                )
                Button(onClick = {navController.navigate(WindowRoute.SettingsScreen.route)}) {
                    Text(text = "Click me boiiiiiiiiiiiii")
                }
            }
        }

    }
}

@Composable
fun SettingsScreen(navController: NavController){
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
       Column {
           Text(
            "Here Settings",
            fontSize = 20.sp,
            color = Color.Green
            )
            Button(onClick = {navController.navigate(WindowRoute.Home.route)}) {
                Text(text = "Click me ") }
       }
    }
}