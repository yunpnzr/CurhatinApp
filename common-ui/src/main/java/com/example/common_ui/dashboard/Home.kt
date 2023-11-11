package com.example.common_ui.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.common_ui.ui.theme.CurhatinAppTheme

@Composable
fun Home(
    modifier: Modifier = Modifier
){

}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
fun HomePreview(){
    CurhatinAppTheme {
        Home()
    }
}