package com.sevenzerotwo.takeit.pages

import android.content.Context
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AuthVerify : ComponentActivity() {
    private lateinit var auth: FirebaseAuth


    fun createAccount(context: Context, email: String, password: String) {
        auth = Firebase.auth

        Toast.makeText(context, "called createaccount", Toast.LENGTH_LONG).show()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(context, "Sign In Successfully", Toast.LENGTH_LONG).show()


                } else {
                    Toast.makeText(context, "Sign In NOT Successfully", Toast.LENGTH_LONG).show()

                }
            }
    }


    fun signIn(context : Context, email: String, password: String) {
        auth = Firebase.auth
        Toast.makeText(context, "called signin method", Toast.LENGTH_LONG).show()

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(context, "Sign In Successfull", Toast.LENGTH_LONG).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(context, "Sign In NOT Successfull", Toast.LENGTH_LONG).show()

                }
            }
    }
}