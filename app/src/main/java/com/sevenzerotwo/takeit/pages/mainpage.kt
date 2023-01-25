package com.sevenzerotwo.takeit.pages

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Mainpage {

   @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
   @OptIn(ExperimentalMaterial3Api::class)
   @Preview
   @Composable
   fun mainpage()
   {
       var namee = "John Doe"
       Scaffold()
       {padding ->

           Text(text = "Hello , $namee")


       }
   }
}