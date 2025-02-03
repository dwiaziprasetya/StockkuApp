package com.example.stokkuai.ui.navigation.model

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Scan : Screen("scan")
    data object StockList : Screen("stockList")
    data object Main : Screen("main")
    data object Detail : Screen("detail")
    data object Root : Screen("root")
    data object History : Screen("history")
    data object UserAccount : Screen("userAccount")
}