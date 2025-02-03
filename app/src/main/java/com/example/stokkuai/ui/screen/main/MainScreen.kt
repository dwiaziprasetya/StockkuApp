package com.example.stokkuai.ui.screen.main

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stokkuai.ui.component.BottomNavigation
import com.example.stokkuai.ui.navigation.graph.MainNavGraph

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {
            BottomNavigation(navController = navController)
        }
    ) { innerPadding ->
        MainNavGraph(
            navController = navController,
            paddingValues = innerPadding
        )
    }
}