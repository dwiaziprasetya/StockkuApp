package com.example.stokkuai.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.stokkuai.presentation.navigation.model.Screen
import com.example.stokkuai.presentation.ui.screen.welcome.WelcomeScreen

fun NavGraphBuilder.authNav(){
    navigation(
        startDestination = Screen.Welcome.route,
        route = Screen.Auth.route
    ) {
        composable(Screen.Welcome.route) {
            WelcomeScreen()
        }
    }
}
