package com.example.stokkuai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.stokkuai.presentation.theme.StokkuAITheme
import com.example.stokkuai.presentation.ui.screen.auth.login.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StokkuAITheme(dynamicColor = false) {
//                RootNavigationGraph(
//                    navController = rememberNavController(),
//                )
                LoginScreen()
            }
        }
    }
}