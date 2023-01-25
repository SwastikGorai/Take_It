package com.sevenzerotwo.takeit.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sevenzerotwo.takeit.Navigation.screen
import com.sevenzerotwo.takeit.R
import com.sevenzerotwo.takeit.pages.funksionss.funktions

@OptIn(ExperimentalMaterial3Api::class)


class AuthPage1 {

    val func = funktions()

    @Composable
    fun Authpage(navController: NavController) {
        Scaffold(Modifier.fillMaxSize()) { padding ->

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(36.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(0.5F)
                        .padding(18.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.illustration),
                        contentDescription = "Illustration",
//                    colorFilter = ColorFilter.tint(Color(0xfff1f3f4)),
//                    modifier = Modifier
//                        .width(width = 316.dp)
//                        .height(height = 273.dp)
                    )
                }



                Box(Modifier.weight(0.2F))
                {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            text = "Explore the app",
                            color = Color.Black,
                            lineHeight = 130.sp,
                            style = TextStyle(
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Spacer(modifier = Modifier.height(16.dp))

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

                    }

                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
//                    .background(color = Color.White)
                        .weight(0.3F)
                ) {
                    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly)
                    {

                        //Sign In Button
                        func.signbutton("Sign In", navController, screen.SignInScreen1.route )
                        // End of Sign In Button


                        Button(
                            onClick = { navController.navigate(screen.SignUpScreen1.route)},
                            border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            shape = RoundedCornerShape(24)
                        )
                        {
                            Text(
                                text = "Sign Up",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                lineHeight = 125.sp,
                                style = TextStyle(
                                    fontSize = 18.sp
                                )
                            )
                        }
                    }

                }
            }
        }

    }
}



