package com.sevenzerotwo.takeit.pages
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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

class signin11 {

    val onklik = mutableStateOf(false)

    @Composable
    fun Authpage2(navController: NavController) {

        val func = funktions()

        val context = LocalContext.current

        val classAuthVerify = AuthVerify()


        Scaffold(
            Modifier
                .fillMaxSize()
                .padding(2.dp)
        ) { padding ->

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {


                Box(
                    Modifier
                        .padding(4.dp)
                        .clip(shape = RoundedCornerShape(24.dp))
                        .background(Color(0xFFE6E6FA))
                        .weight(0.9F)

                )
                {
                    Column(
                        Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {

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

                        Spacer(modifier = Modifier.height(12.dp))

                        Button(
                            onClick = { },
                            border = BorderStroke(1.dp, Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            shape = RoundedCornerShape(50)
                        )
                        {
                            Row(
                                Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = "google",
                                    modifier = Modifier.padding(end = 12.dp)
                                )

                                Text(
                                    text = "Continue with Google",
                                    fontSize = 16.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
//
                        }

                        Button(
                            onClick = { navController.navigate(screen.SignInScreen2.route) },
                            border = BorderStroke(1.dp, Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                            shape = RoundedCornerShape(50)
                        )


                        {
                            Row(
                                Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.message),
                                    contentDescription = "email",
                                    modifier = Modifier.padding(end = 12.dp)
                                )

                                Text(
                                    text = "Continue with Email",
                                    fontSize = 16.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }
//
                        }


                    }
                }

                Box(
                    Modifier
                        .weight(0.1F)
                        .fillMaxSize()
                )
                {
                    func.NoAccountPresent(siz = 16.sp, navController)
                }
            }

        }

    }


}

