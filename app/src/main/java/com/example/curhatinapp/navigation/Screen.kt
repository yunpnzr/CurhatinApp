package com.example.curhatinapp.navigation

sealed class Screen (val route: String){
    object OnBoarding : Screen("onboarding")
}