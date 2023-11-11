package com.example.curhatinapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.common_ui.onboarding.OnBoarding
import com.example.common_ui.splashscreen.SplashScreen
import com.example.curhatinapp.navigation.Screen

@Composable
fun MainApp(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(Screen.SplashScreen.route){
            SplashScreen(
                navController = navController
            )
        }
        composable(Screen.OnBoarding.route){
            OnBoarding(
                navController = navController
            )
        }
    }
}