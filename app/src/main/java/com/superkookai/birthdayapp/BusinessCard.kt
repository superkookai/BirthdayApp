package com.superkookai.birthdayapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard() {
    Box(
        modifier = Modifier
            .background(Color(red = 210, green = 232, blue = 212))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TitleView()

        Column(modifier = Modifier.offset(y = 300.dp)) {
            ContactView()
        }
    }
}

@Composable
fun TitleView() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        MyLogo()

        Text("Jeniffer Doe", fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(vertical = 10.dp))
        
        Text("Android Developer Extraordinaire",
            color = Color(red = 0, green = 114, blue = 60),
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ContactView() {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        InfoView(icon = R.drawable.baseline_phone_24, "+11 (123) 444 555 666")
        InfoView(icon = R.drawable.baseline_share_24, "@AndroidDev")
        InfoView(icon = R.drawable.baseline_email_24, "jen.doe@android.com")
    }
}

@Composable
fun InfoView(icon: Int, text: String) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 20.dp)
    ) {
        Icon(painter = painterResource(id = icon), contentDescription = "icon",
            tint = Color(red = 0, green = 114, blue = 60),
            modifier = Modifier.padding(end = 30.dp))
        Text(text)
    }
}

@Composable
fun MyLogo() {
    Box(
        modifier = Modifier
            .background(Color(red = 7, green = 48, blue = 66),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(20.dp)
            .size(100.dp)
    ) {
        Image(painter = painterResource(R.drawable.android_logo),
            contentDescription = "android logo", contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}

@Preview(showBackground = true)
@Composable
fun PreviewInfo() {
    ContactView()
}