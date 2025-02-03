package com.example.stokkuai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.stokkuai.ui.screen.home.HomeScreen
import com.example.stokkuai.ui.theme.StokkuAITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StokkuAITheme {
                HomeScreen()
            }
        }
    }
}