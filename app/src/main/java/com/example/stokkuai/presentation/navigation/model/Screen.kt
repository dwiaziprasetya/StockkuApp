package com.example.stokkuai.presentation.navigation.model

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Scan : Screen("scan")
    data object StockList : Screen("stockList")
    data object Main : Screen("main")
    data object Detail : Screen("detail")
    data object Root : Screen("root")
    data object History : Screen("history")
    data object Auth : Screen("auth")
    data object UserAccount : Screen("userAccount")
    data object Welcome : Screen("welcome")
}