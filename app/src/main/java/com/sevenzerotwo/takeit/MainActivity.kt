package com.sevenzerotwo.takeit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sevenzerotwo.takeit.Navigation.NavGraph
import com.sevenzerotwo.takeit.pages.AuthPage1
import com.sevenzerotwo.takeit.pages.AuthVerify
import com.sevenzerotwo.takeit.pages.Authpage22
import com.sevenzerotwo.takeit.pages.signinEmail
import com.sevenzerotwo.takeit.ui.theme.TakeItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavGraph().Navigation()
        }
    }
}

