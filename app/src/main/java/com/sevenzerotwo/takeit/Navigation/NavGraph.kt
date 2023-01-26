package com.sevenzerotwo.takeit.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sevenzerotwo.takeit.pages.AuthPage1
import com.sevenzerotwo.takeit.pages.signin.signin22
import com.sevenzerotwo.takeit.pages.signin11
import com.sevenzerotwo.takeit.pages.signup.signup33
//import com.sevenzerotwo.takeit.pages.Authpage22
import com.sevenzerotwo.takeit.pages.signup11
import com.sevenzerotwo.takeit.pages.signup22

class NavGraph {

    @Composable
    fun Navigation(){
        val nav = rememberNavController( )
        NavHost(navController = nav, startDestination = screen.mainAuthPage.route ){
            composable(route = screen.mainAuthPage.route){
                AuthPage1().Authpage(navController = nav)
            }
            composable(route = screen.SignUpScreen1.route){
                signup11().Authpage2(navController = nav)
            }
            composable(route = screen.SignUpScreen2.route){
                signup22().emailsignuppage(navController = nav)
            }

            composable(route = screen.SignUpScreen3.route){
                signup33().createAbout(navController = nav)
            }

            composable(route = screen.SignInScreen1.route){
                signin11().Authpage2(navController = nav)
            }
            composable(route = screen.SignInScreen2.route){
                signin22().emailsigninpage(navController = nav)
            }
        }

    }
}