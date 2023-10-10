package com.alan.mvvplogin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alan.mvvplogin.ui.theme.screens.Calc.CalculatorScreen
import com.alan.mvvplogin.ui.theme.screens.Intent.IntentScreen
import com.alan.mvvplogin.ui.theme.screens.home.Homescreen
import com.alan.mvvplogin.ui.theme.screens.login.LoginScreen
import com.alan.mvvplogin.ui.theme.screens.products.ProductScreen
import com.alan.mvvplogin.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_HOME) {

    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_PRODUCT){
           ProductScreen(navController)
        }
        composable(ROUTE_CALCULATOR){
            CalculatorScreen(navController)
        }
        composable(ROUTE_INTENT){
            IntentScreen(navController)
        }

    }

}