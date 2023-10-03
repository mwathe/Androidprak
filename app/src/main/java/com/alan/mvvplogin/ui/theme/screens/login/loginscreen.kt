package com.alan.mvvplogin.ui.theme.screens.login


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var Password by remember { mutableStateOf(TextFieldValue("")) }
    var ConfirmPassword by remember { mutableStateOf(TextFieldValue("")) }


    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)

    ){


        Text(text = "Login here",
            color = Color.Blue,
            fontFamily = FontFamily.Default,
            fontSize = 30.sp)


        Spacer(modifier = Modifier.height(50.dp))



        OutlinedTextField(value = email, onValueChange ={
           email = it
        },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = {
                Text(
                    text = "Enter email" ,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    )
            }

        )

        OutlinedTextField(value = Password, onValueChange ={
            Password = it
        },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = {
                Text(
                    text = "Enter password" ,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }

        )
//        OutlinedTextField(value = ConfirmPassword,
//            onValueChange ={
//            ConfirmPassword = it
//        },
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            label = {
//                Text(
//                    text = "Confirm password" ,
//                    fontSize = 30.sp,
//                    fontFamily = FontFamily.SansSerif,
//                )
//            }
//
//        )

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "Click To Login",
                fontSize = 25.sp)


        }
Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth())
        {

            Text(text = "Does't have account Register",
                fontSize = 25.sp)


        }

}



}

@Preview
@Composable
fun loginscreepre() {

    LoginScreen()

}