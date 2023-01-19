package com.sevenzerotwo.takeit.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sevenzerotwo.takeit.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Authpage2()
{
    Scaffold(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {

        Box(Modifier.background(Color(0xFFE6E6FA)).padding(12.dp))
        {
            Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

                Image(
                    painter = painterResource(id = R.drawable.illustration),
                    contentDescription = "Illustration",
//                    colorFilter = ColorFilter.tint(Color(0xfff1f3f4)),
//                    modifier = Modifier
//                        .width(width = 316.dp)
//                        .height(height = 273.dp)
                )

                Text(
                    text = "Explore the app",
                    color = Color.Black,
                    lineHeight = 130.sp,
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Shop and earn cool rewards!",
                    color = Color.Black.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center,
                    lineHeight = 125.sp,
                    style = TextStyle(
                        fontSize = 17.sp
                    ),
                    modifier = Modifier
                        .width(width = 319.dp)
                )

                Button(
                    onClick = { },
                    border = BorderStroke(1.dp, Color.White),
                    modifier = Modifier.fillMaxWidth().height(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(50)
                )
                {
            }




            }
        }

    }
}