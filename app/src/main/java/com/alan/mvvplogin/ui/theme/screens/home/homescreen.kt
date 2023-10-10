package com.alan.mvvplogin.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.R
import com.alan.mvvplogin.navigation.ROUTE_HOME
import com.alan.mvvplogin.navigation.ROUTE_LOGIN
import com.alan.mvvplogin.navigation.ROUTE_PRODUCT
import com.alan.mvvplogin.ui.theme.screens.register.registerpre

@Composable
fun Homescreen(navController: NavHostController) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {


        Text(
            text = "Welcome to Android programing",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "Alan Emobilis  app", color = Color.White,
            fontFamily = FontFamily.Default,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navController.navigate (ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "LoGIN",
                fontSize = 25.sp)


        }


        Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = { navController.navigate (ROUTE_PRODUCT) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "Products",
                fontSize = 25.sp)


        }

        Spacer(modifier = Modifier.height(30.dp))

        Image(
         painter = painterResource(id = R.drawable.duck),
            contentDescription = "Daffy-Duck",
            modifier = Modifier.fillMaxWidth()
       )


        Button(onClick = { navController.navigate (ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "Calculator",
                fontSize = 25.sp)


        }


        Button(onClick = { navController.navigate (ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "LoGIN",
                fontSize = 25.sp)


        }

        Button(onClick = { navController.navigate (ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "INTENT",
                fontSize = 25.sp)


        }


    }
}











@Preview(showBackground = true)
@Composable
fun Homepreview(){
    Homescreen(rememberNavController())

}