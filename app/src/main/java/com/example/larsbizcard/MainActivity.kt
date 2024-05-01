package com.example.larsbizcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton



@Composable
fun BusinessCard() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TopSection()
        Spacer(modifier = Modifier.height(16.dp))
        BottomSection()
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}

@Composable
fun TopSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        Text("Lars Swenson", fontSize = 24.sp, textAlign = TextAlign.Center)
        Text("Android Developer", fontSize = 18.sp, textAlign = TextAlign.Center)
        Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = "Android Logo", modifier = Modifier.size(100.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun TopSectionPreview() {
    TopSection()
}

@Composable
fun BottomSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Filled.Phone, contentDescription = "Phone", tint = Color(0xFF3ddc84))
            Spacer(modifier = Modifier.width(8.dp))
            Text("(206) 718-3398")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color(0xFF3ddc84))
            Spacer(modifier = Modifier.width(8.dp))
            Text("lars.swenson@gmail.com")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Filled.LocationOn, contentDescription = "Location", tint = Color(0xFF3ddc84))
            Spacer(modifier = Modifier.width(8.dp))
            Text("4158 12th Ave S")
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.insta), contentDescription = "Instagram", modifier = Modifier.size(30.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text("instagram.com/larsswenson")
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun BottomSectionPreview() {
    BottomSection()
}
