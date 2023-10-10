package com.alan.mvvplogin.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.navigation.ROUTE_HOME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpassword by remember { mutableStateOf(TextFieldValue("")) }

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ){

     Text(text = "Register Here",
          color = Color.Red,
          fontFamily = FontFamily.Default,
          fontSize = 30.sp
         )

        Spacer(modifier = Modifier.height(30.dp))
        
        OutlinedTextField(value =name ,
                          label = { Text(text = "Enter name",
                                        fontFamily = FontFamily.Default,
                                        fontSize = 30.sp,
                                        color = Color.Gray
                              )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                         onValueChange = {name=it})

        OutlinedTextField(value =email ,
            label = { Text(text = "Enter Email",
                fontFamily = FontFamily.Default,
                fontSize = 30.sp,
                color = Color.Gray
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {name=it})


        OutlinedTextField(value =password ,
            label = { Text(text = "Enter Password",
                fontFamily = FontFamily.Default,
                fontSize = 30.sp,
                color = Color.Gray
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {name=it})

        OutlinedTextField(value =confirmpassword ,
            label = { Text(text = "Conform Password",
                fontFamily = FontFamily.Default,
                fontSize = 25.sp,
                color = Color.Gray
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {name=it})


     Spacer(modifier = Modifier.height(40.dp))


        Button(onClick = { navController.navigate(ROUTE_HOME) },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth()) 
        {
            
        Text(text = "Click To Login",
            fontSize = 24.sp)


        }







    }





}

@Preview
@Composable
fun registerpre() {
    RegisterScreen(rememberNavController())


}