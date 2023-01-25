package com.sevenzerotwo.takeit.pages.funksionss

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import com.sevenzerotwo.takeit.Navigation.screen
import com.sevenzerotwo.takeit.pages.AuthVerify

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
    fun templatee(text: String, mode : String) : String
    {

        var isPassVis = remember { mutableStateOf(false) }

        var icnsPassVis = remember { mutableStateOf(false) }

        var vall = remember { mutableStateOf("") }

        Box(
            Modifier
                .fillMaxWidth()
        )
        {
            if(mode == "email") {
                Column {

                    Text(text = text)
                    TextField(
                        value = vall.value,
                        onValueChange = { vall.value = it },
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
            } else if(mode == "password") {
                Column {

                    Text(text = text)
                    TextField(modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        value = vall.value,
                        onValueChange = { vall.value = it },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password,
                            imeAction = ImeAction.Done
                        ),
                        visualTransformation = if (isPassVis.value) VisualTransformation.None else PasswordVisualTransformation(),
                        singleLine = true,
                        trailingIcon = {
                            IconButton(
                                onClick = { isPassVis.value = !isPassVis.value })
                            {
                                Icon(
                                    imageVector = if (isPassVis.value) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                    contentDescription = "Password"
                                )
                            }
                        },
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
        return vall.value
    }


    //Sign In Button
    @Composable
    fun signbutton(button_text: String,navController : NavController, navTo  : String) {
        Button(
            onClick = {navController.navigate(navTo) },
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


    @Composable
    fun authsignbutton(button_text: String, mode : String, context : Context, email : String, password : String, confrimpassd : String?) {
        val classAuthVerify = AuthVerify()
        if (mode == "signup") {
            Button(
                onClick = { classAuthVerify.createAccount(context, email, password) },
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
        else if(mode == "signin")
        {

            Button(
                onClick = { classAuthVerify.createAccount(context, email, password) },
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


    @Composable
    fun NoAccountPresent(siz: TextUnit) {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Don't have an account? ", fontSize = siz,
                color = Color.Black,

                )

            Text(text = "Sign Up",
                fontSize = siz,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable { })


        }
    }
}
