package com.sevenzerotwo.takeit.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sevenzerotwo.takeit.R

class signinEmail {


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun emailloginpage() {

        var emaill by remember { mutableStateOf("") }

        var passd by remember { mutableStateOf("") }

        var confirmpassd by remember { mutableStateOf("") }
        Scaffold(Modifier.fillMaxSize())
        {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            )
            {


                // Box for Star nd the Sign Up Big text
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd)
                {
                    Image(
                        painter = painterResource(id = R.drawable.star_8),
                        contentDescription = "star",
                        modifier = Modifier.padding(vertical = 12.dp)
                    )
                }

                Text(
                    text = "Sign Up",
                    Modifier.padding(12.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                )


                // Box for Email, Create Password and Confirm Password TextBox
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)

                )
                {
                    Column(
                        Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    )
                    {


                        // Box for Email TextBox
                        Box(
                            Modifier
                                .fillMaxWidth()
                        )
                        {
                            Column {

                                Text(text = "Email")
                                TextField(
                                    value = emaill,
                                    onValueChange = { emaill = it },
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
                        //End for Box For Email TextBox


                        //Box for Create Password TextBox
                        Box(
                            Modifier
                                .fillMaxWidth()
                        )
                        {
                            Column() {
                                Text(text = "Create a Password")
                                TextField(
                                    value = passd,
                                    onValueChange = { passd = it },
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
                        //End for Box For Create Password Button


                        //Box for Confirm Password TextBox
                        Box(
                            Modifier
                                .fillMaxWidth()
                        )
                        {
                            Column() {
                                Text(text = "Confirm Password")
                                TextField(
                                    value = confirmpassd,
                                    onValueChange = { confirmpassd = it },
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
                        //End for Box For Confirm Password TextBox


                        //Box for Login Button
                        Spacer(modifier = Modifier.height(8.dp))
                        Box(
                            Modifier
                                .fillMaxWidth()
                        )
                        {
                            Button(
                                onClick = { /*TODO*/ },
                                Modifier
                                    .fillMaxWidth()
                                    .height(54.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(20)
                            ) {
                                Text(text = "Log in", color = Color.White)
                            }

                        }
                        //End for Box For Login Button


                        Text(text = "--------  Or Register with  --------", fontSize = 12.sp, lineHeight = 125.sp)


                        //Box For Sigh in options
                        Box(
                            Modifier
                                .fillMaxWidth()
                        )
                        {
                            Row(
                                Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            )
                            {


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
                                        painter = painterResource(id = R.drawable.google),
                                        contentDescription = "googlelogin"
                                    )
                                }


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
                                        painter = painterResource(id = R.drawable.fb),
                                        contentDescription = "facebooklogin"
                                    )
                                }


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
                                        painter = painterResource(id = R.drawable.apple),
                                        contentDescription = "applelogin"
                                    )
                                }
                            }
                        }

                        //End for 3 login Buttons


                        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.25F))
                        {

                            Row(
                                Modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            )
                            {
                                Text(
                                    text = "Already have an account? ", fontSize = 12.sp,
                                    color = Color.Black,

                                    )

                                Text(
                                    text = "Sign In", fontSize = 12.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    textDecoration = TextDecoration.Underline,
                                    modifier = Modifier.clickable { })


                            }
                        }
                    }
                }
            }

        }
    }
}
