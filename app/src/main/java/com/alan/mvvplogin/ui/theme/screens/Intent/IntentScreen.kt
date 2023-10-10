package com.alan.mvvplogin.ui.theme.screens.Intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.navigation.ROUTE_LOGIN
import com.alan.mvvplogin.navigation.ROUTE_PRODUCT

@Composable

fun IntentScreen(navContoller: NavHostController) {
// create the following buttons :
//         camera , sms , dail, email, share, call

     Column (
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Top,
         modifier = Modifier
             .fillMaxWidth()
             .background(Color.LightGray)

     ){

         Button(onClick = {
             navContoller.navigate(ROUTE_PRODUCT) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "Camera",
                 fontSize = 25.sp)


         }
         Button(onClick = { navContoller.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "sms",
                 fontSize = 25.sp)


         }


         Button(onClick = {navContoller.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "Dial",
                 fontSize = 25.sp)


         }

         Button(onClick = { navContoller.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "email",
                 fontSize = 25.sp)


         }

         Button(onClick = {navContoller.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "Share",
                 fontSize = 25.sp)


         }
         Button(onClick = {navContoller.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "call",
                 fontSize = 25.sp)


         }



     }




}


@Preview
@Composable
fun Intentpre() {
    IntentScreen(rememberNavController())
}