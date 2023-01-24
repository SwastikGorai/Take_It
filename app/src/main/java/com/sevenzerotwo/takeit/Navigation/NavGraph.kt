package com.sevenzerotwo.takeit.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sevenzerotwo.takeit.pages.AuthPage1
import com.sevenzerotwo.takeit.pages.Authpage22
import com.sevenzerotwo.takeit.pages.signinEmail

class NavGraph {

    @Composable
    fun Navigation(){
        val nav = rememberNavController( )
        NavHost(navController = nav, startDestination = screen.AuthPage1.route ){
            composable(route = screen.AuthPage1.route){
                AuthPage1().Authpage(navController = nav)
            }
            composable(route = screen.AuthPage2.route){
                Authpage22().Authpage2(navController = nav)
            }
            composable(route = screen.SignUpScreen.route){
                signinEmail().emailloginpage(navController = nav)
            }
        }

    }
}