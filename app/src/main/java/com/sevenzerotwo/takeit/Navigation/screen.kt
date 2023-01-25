package com.sevenzerotwo.takeit.Navigation

open class screen  (val route:String){
    object mainAuthPage: screen(route = "mainAuthPage")
    object SignUpScreen1: screen(route = "signupScreen1")
    object SignUpScreen2: screen(route = "signupScreen2")

    object SignInScreen1: screen(route = "signinScreen1")

    object SignInScreen2: screen(route = "signinScreen2")


}