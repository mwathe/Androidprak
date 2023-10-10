package com.alan.mvvplogin.ui.theme.screens.Calc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.navigation.ROUTE_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(navController:NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf(TextFieldValue("")) }
     Column(horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Top,
         modifier = Modifier
             .fillMaxSize()
             .background(Color.Cyan)){

         Text(text="Answer",
             color= Color.Magenta,
             fontSize = 30.sp)
         OutlinedTextField(value = firstnum,
             onValueChange = {firstnum=it},
         keyboardOptions = KeyboardOptions( keyboardType =  KeyboardType.Number),
             label = {Text(text = "Enter  first number",
                 color = Color.Black,
                 fontSize = 30.sp
             )
             }
             )
         OutlinedTextField(value = secondnum,
             onValueChange = {secondnum=it},
             keyboardOptions = KeyboardOptions( keyboardType =  KeyboardType.Number),
             label = {Text(text = "Enter  SECOND number",
                 color = Color.Black,
                 fontSize = 30.sp
             )
             }
         )
         Button(onClick = {navController.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "+",
                 fontSize = 25.sp)


         }
         Button(onClick = { navController.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "-",
                 fontSize = 25.sp)


         }
         Button(onClick = { navController.navigate (ROUTE_LOGIN) },
             colors = ButtonDefaults.buttonColors(Color.Green),
             shape = CircleShape,
             modifier = Modifier.fillMaxWidth())
         {

             Text(text = "*",
                 fontSize = 25.sp)


         }


     }



}


@Preview
@Composable
fun  calPreview () {
    CalculatorScreen(rememberNavController())
}