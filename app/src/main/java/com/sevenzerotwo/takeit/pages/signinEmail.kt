package com.sevenzerotwo.takeit.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sevenzerotwo.takeit.R

class signinEmail {

    val func = funktions()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun emailloginpage(navController: NavController) {

        var emaill by remember { mutableStateOf("") }

        var passd by remember { mutableStateOf("") }

        var confirmpassd by remember { mutableStateOf("") }


        Scaffold(Modifier.fillMaxSize()) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            ) {


                // Box for Star nd the Sign Up Big text
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
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
                //End for Box for star and Big Sign Up text


                // Box for Email, Create Password and Confirm Password TextBox
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)

                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {


                        // Box for Email TextBox
                        func.templatee(textboxValue = emaill, text = "Email")
                        //End for Box For Email TextBox


                        //Box for Create Password TextBox
                        func.templatee(textboxValue = passd, text = "Create a Password")
                        //End for Box For Create Password Button


                        //Box for Confirm Password TextBox
                        func.templatee(textboxValue = confirmpassd, text = "Confirm Password")
                        //End for Box For Confirm Password TextBox


                        Spacer(modifier = Modifier.height(8.dp))


                        //Box for Login Button
                        func.signinbutton(button_text = "Login In")
                        //End for Box For Login Button


                        Text(
                            text = "--------  Or Register with  --------",
                            fontSize = 12.sp,
                            lineHeight = 125.sp
                        )


                        //Box For 3 log in buttons
                        Box(
                            Modifier.fillMaxWidth()
                        ) {
                            Row(
                                Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {

                                func.logobutton(
                                    pid = painterResource(id = R.drawable.google),
                                    contentDesc = "googlelogin"
                                )

                                func.logobutton(
                                    pid = painterResource(id = R.drawable.fb),
                                    contentDesc = "facebooklogin"
                                )

                                func.logobutton(
                                    pid = painterResource(id = R.drawable.message),
                                    contentDesc = "emaillogin"
                                )
                            }
                        }
                        //End for 3 login Buttons

                        //Box for Already have an account Sign in
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.25F)
                        ) {
                            func.accountPresent(siz = 12.sp)
                        }
                        // End of Box for Already have an account Sign in
                    }
                }
            }

        }
    }
}



