package com.sevenzerotwo.takeit.pages

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
class AuthVerify :  ComponentActivity() {
    private lateinit var auth: FirebaseAuth




    fun createAccount(context : Context) {
        auth = Firebase.auth
        Toast.makeText(context, "called createaccount", Toast.LENGTH_LONG).show()
        val classAuth22 = Authpage22()
        val emaill = "swas@gmail.com"
        val passd = "12345678"
        // [START create_user_with_email]
        auth.createUserWithEmailAndPassword(emaill, passd)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
//                    classAuth22.onklik.value = false

                    Toast.makeText(context, "Sign In Successfully", Toast.LENGTH_LONG).show()


                } else {
//                    classAuth22.onklik.value = false
                    Toast.makeText(context, "Sign In NOT Successfully", Toast.LENGTH_LONG).show()

                }
            }
        // [END create_user_with_email]
    }


    @Composable
    private fun signIn(email: String, password: String) {
        var emaill = "swas@gmail.com"
        var passd = "12345678"
        val context = LocalContext.current
        // [START sign_in_with_email]
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(context, "Sign In Successfull", Toast.LENGTH_LONG).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(context, "Sign In NOT Successfull", Toast.LENGTH_LONG).show()

                }
            }
        // [END sign_in_with_email]
    }
}