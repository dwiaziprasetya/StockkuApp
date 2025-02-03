package com.example.stokkuai.ui.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stokkuai.ui.navigation.model.Screen
import com.example.stokkuai.ui.screen.home.HomeScreen

@Composable
fun MainNavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        route = Screen.Main.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
    }
}