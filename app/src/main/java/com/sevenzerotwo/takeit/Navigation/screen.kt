package com.sevenzerotwo.takeit.Navigation

open class screen  (val route:String){
    object AuthPage1: screen(route = "AuthPage1")
    object AuthPage2: screen(route = "AuthPage2")
    object SignUpScreen: screen(route = "SignUpScreen")
}