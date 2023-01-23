package com.sevenzerotwo.takeit.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class funktions {

    @Composable
    fun logobutton(pid: Painter, contentDesc: String) {
        Button(
            onClick = { },
            border = BorderStroke(1.dp, Color.Gray),
            modifier = Modifier
                .height(60.dp)
                .width(90.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(20)
        ) {
            Image(
                painter = pid,
                contentDescription = contentDesc
            )
        }

    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun templatee(textboxValue: String, text: String) {
        var vall = textboxValue
        Box(
            Modifier
                .fillMaxWidth()
        )
        {
            Column {

                Text(text = text)
                TextField(
                    value = vall,
                    onValueChange = { vall = it },
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        disabledLabelColor = Color.White,
                        selectionColors = TextSelectionColors(
                            handleColor = Color.Black,
                            backgroundColor = Color.Gray
                        ),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent


                    )

                )

            }

        }
    }


    //Sign In Button
    @Composable
    fun signinbutton(button_text: String) {
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(24)
        )
        {
            Text(
                text = button_text,
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 125.sp,
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }


    //Already have an account, Sign In
    @Composable
    fun accountPresent(siz: TextUnit) {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account? ", fontSize = siz,
                color = Color.Black,

                )

            Text(text = "Sign In",
                fontSize = siz,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable { })


        }
    }
}
