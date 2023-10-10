package com.alan.mvvplogin.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.R


@Composable
fun ProductScreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ){
        Text(
            text = "Welcome to Our Products",
            color = Color.Blue,
            fontFamily = FontFamily.Default,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(80.dp))
        Image(
                painter = painterResource(id = R.drawable.banana),
        contentDescription = "Banana",
        modifier = Modifier
            .size(200.dp)
            .background(Color.DarkGray)
            .padding(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.apple),
            contentDescription = "Apple",
            modifier =Modifier
                .size(200.dp)
                .background(Color.DarkGray)
                .padding(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mango),
            contentDescription = "Mango",
            modifier = Modifier
                .size(200.dp)
                .background(Color.DarkGray)
                .padding(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.pineaple),
            contentDescription = "Pineapple",
            modifier = Modifier
                .size(200.dp)
                .background(Color.DarkGray)
                .padding(20.dp)
        )
    }
}





@Preview
@Composable
fun Productpre() {

ProductScreen(rememberNavController())
    
}