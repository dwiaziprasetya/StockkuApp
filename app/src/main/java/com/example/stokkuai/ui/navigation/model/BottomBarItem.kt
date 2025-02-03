package com.example.stokkuai.ui.navigation.model

import androidx.compose.ui.graphics.painter.Painter

data class BottomBarItem(
    val title: String,
    val icon: Painter,
    val iconSelected: Painter,
    val screen: Screen
)
