package com.alan.mvvplogin.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alan.mvvplogin.R

@Composable
fun Homescreen() {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {


        Text(
            text = "Welcome to Android programing",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 28.sp
        )
        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "Alan first app wow", color = Color.Green,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Image(
          painter = painterResource(id = R.drawable.duck),
            contentDescription = "Daffy-Duck",
            modifier = Modifier.fillMaxWidth()
        )


    }
}

@Preview(showBackground = true)
@Composable
fun Homepreview(){
    Homescreen()
}