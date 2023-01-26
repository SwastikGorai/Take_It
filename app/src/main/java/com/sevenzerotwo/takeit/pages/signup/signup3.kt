package com.sevenzerotwo.takeit.pages.signup

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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

class signup33 {
    val func = funktions()

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun createAbout(navController: NavController) {
        val context = LocalContext.current

        var FirstName by remember { mutableStateOf("") }

        var LastName by remember { mutableStateOf("") }

        var Address by remember { mutableStateOf("") }

        var phno by remember { mutableStateOf("") }

        var pincode by remember { mutableStateOf("") }

        Scaffold(Modifier.fillMaxSize()) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(12.dp)
            ) {


                // Box for Star and About Yourself Big text
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                    Image(
                        painter = painterResource(id = R.drawable.star_8),
                        contentDescription = "star",
                        modifier = Modifier.padding(vertical = 12.dp)
                    )
                }

                Text(
                    text = "About Yourself",
                    Modifier.padding(12.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                )
                //End for Box for star and Big Sign Up text

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

                        // Row For First and Last name
                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top)
                        {
                            Box(Modifier.weight(0.5F).padding(end = 6.dp)){
                                FirstName = func.templatee(text = "First name", mode = "name")
                            }

                            Box(Modifier.weight(0.5F).padding(start = 6.dp)){
                                LastName = func.templatee(text = "Last name", mode = "name")
                            }

                        }
                        // End of Row for First and Last name


                        // Address
                        Address = func.templatee(text = "Address", mode = "email" )
                        // End for Address

                        // Phone number
                        phno = func.templatee(text = "Phone Number", mode = "phonenumber")
                        // End of Phone  number

                        // Pin Code
                        pincode = func.templatee(text = "PIN Code", mode = "pincode")

                        func.accDetails(
                            button_text = "Create Account",
                            firstName = FirstName,
                            lastName = LastName ,
                            address = Address,
                            phnno = phno,
                            pin = pincode
                        )
                    }
                }
            }
        }
    }

}