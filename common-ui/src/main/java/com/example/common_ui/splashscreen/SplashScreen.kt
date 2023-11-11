package com.example.common_ui.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.common_ui.R
import com.example.common_ui.ui.theme.CurhatinAppTheme

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navController : NavHostController
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .size(150.dp),
            painter = painterResource(R.drawable.logo_paper),
            contentDescription = "logo"
        )
    }
}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true,
    device = Devices.PIXEL_4
)
fun SplashScreenPreview(){
    CurhatinAppTheme {
        SplashScreen(navController = rememberNavController())
    }
}