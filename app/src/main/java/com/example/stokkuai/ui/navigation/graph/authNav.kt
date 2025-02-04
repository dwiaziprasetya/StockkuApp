package com.example.stokkuai.ui.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.stokkuai.ui.navigation.model.Screen

fun NavGraphBuilder.authNav(){
    navigation(
        startDestination = Screen.Welcome.route,
        route = Screen.Root.route
    ) {
        composable(Screen.Welcome.route) {
            WelcomeScreen()
        }
    }
}
