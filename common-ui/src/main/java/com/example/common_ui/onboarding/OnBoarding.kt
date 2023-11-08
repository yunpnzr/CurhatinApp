package com.example.common_ui.onboarding

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.common_ui.ui.theme.CurhatinAppTheme

@Composable
fun OnBoarding(
    modifier: Modifier = Modifier
){

}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true,
    device = Devices.PIXEL_4
)
fun OnBoardingPreview(){
    CurhatinAppTheme {
        OnBoarding()
    }
}