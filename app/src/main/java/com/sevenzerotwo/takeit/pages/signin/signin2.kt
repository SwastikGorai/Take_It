package com.sevenzerotwo.takeit.pages.signin
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sevenzerotwo.takeit.R
import com.sevenzerotwo.takeit.pages.funksionss.funktions

class signin22 {

    val func = funktions()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun emailsigninpage(navController: NavController) {

        val context = LocalContext.current

        var emaill by remember { mutableStateOf("") }

        var passd by remember { mutableStateOf("") }

//        var confirmpassd by remember { mutableStateOf("") }


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
                    text = "Sign In",
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
                        emaill = func.templatee( text = "Email",  mode = "email")
                        //End for Box For Email TextBox


                        //Box for Create Password TextBox
                        passd = func.templatee( text = "Password",  mode = "password")
                        //End for Box For Create Password Button


                        Spacer(modifier = Modifier.height(8.dp))


                        //Box for Login Button
                      func.authsignbutton(
                          navController = navController,
                            button_text = "Sign In",
                            mode = "signin" ,
                            context = context  ,
                            email = emaill ,
                            password = passd ,
                            confrimpassd = ""
                        )
                        //End for Box For Login Button


                        Text(
                            text = "--------  Or Sign in with  --------",
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
                            func.NoAccountPresent(siz = 12.sp, navController)
                        }
                        // End of Box for Already have an account Sign in
                    }
                }
            }

        }
    }
}


