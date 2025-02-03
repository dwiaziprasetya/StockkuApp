package com.example.stokkuai.ui.navigation.model

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Scan : Screen("scan")
    data object StockList : Screen("stockList")
}