package com.example.stokkuai

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        startDestination = Screen.Auth.route,
        modifier = Modifier
            .navigationBarsPadding()
    ) {
        authNav()
        composable(route = Screen.Main.route) {
            MainScreen()
        }
    }
}