package com.example.stokkuai.presentation.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stokkuai.presentation.navigation.model.Screen
import com.example.stokkuai.presentation.ui.screen.account.AccountScreen
import com.example.stokkuai.presentation.ui.screen.history.HistoryScreen
import com.example.stokkuai.presentation.ui.screen.home.HomeScreen
import com.example.stokkuai.presentation.ui.screen.scan.ScanScreen
import com.example.stokkuai.presentation.ui.screen.stocklist.StockListScreen

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
        composable(route = Screen.Scan.route) {
            ScanScreen()
        }
        composable(route = Screen.StockList.route) {
            StockListScreen()
        }
        composable(route = Screen.UserAccount.route) {
            AccountScreen()
        }
        composable(route = Screen.History.route) {
            HistoryScreen()
        }
    }
}