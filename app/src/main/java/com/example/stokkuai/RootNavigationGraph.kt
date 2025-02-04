package com.example.stokkuai

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stokkuai.ui.navigation.graph.authNav
import com.example.stokkuai.ui.navigation.model.Screen
import com.example.stokkuai.ui.screen.main.MainScreen

@Composable
fun RootNavigationGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        route = Screen.Root.route,
        startDestination = Screen.Auth.route
    ) {
        authNav()
        composable(route = Screen.Main.route) {
            MainScreen()
        }
    }
}