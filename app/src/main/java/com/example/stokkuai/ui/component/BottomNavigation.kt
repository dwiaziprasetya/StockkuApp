package com.example.stokkuai.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.stokkuai.R
import com.example.stokkuai.ui.navigation.model.BottomBarItem
import com.example.stokkuai.ui.navigation.model.Screen
import com.example.stokkuai.ui.theme.StokkuAITheme
import com.example.stokkuai.ui.theme.poppinsFontFamily

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavigationBar(
        containerColor = Color.White,
    ) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route
        val navigationItems = listOf(
            BottomBarItem(
                title = "Home",
                icon = painterResource(R.drawable.icon_home),
                iconSelected = painterResource(R.drawable.icon_home),
                screen = Screen.Home
            ),
            BottomBarItem(
                title = "History",
                icon = painterResource(R.drawable.icon_history),
                iconSelected = painterResource(R.drawable.icon_history),
                screen = Screen.History
            ),
            BottomBarItem(
                title = "",
                icon = painterResource(R.drawable.icon_scan),
                iconSelected = painterResource(R.drawable.icon_scan),
                screen = Screen.Scan
            ),
            BottomBarItem(
                title = "Stocks",
                icon = painterResource(R.drawable.icon_chart_stock),
                iconSelected = painterResource(R.drawable.icon_chart_stock),
                screen = Screen.StockList
            ),
            BottomBarItem(
                title = "Account",
                icon = painterResource(R.drawable.icon_user_account),
                iconSelected = painterResource(R.drawable.icon_user_account),
                screen = Screen.UserAccount
            ),
        )
        navigationItems.map { item ->
            val isSelected = currentRoute == item.screen.route
            NavigationBarItem(
                selected = isSelected,
                onClick = {},
                label = {
                    if (isSelected) {
                        Text(
                            text = item.title,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        Text(
                            text = item.title,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.outline
                        )
                    }
                },
                icon = {
                    if (isSelected) {
                        Icon(
                            painter = item.iconSelected,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        if (item.title != "") {
                            Icon(
                                painter = item.icon,
                                tint = MaterialTheme.colorScheme.outline,
                                contentDescription = item.title
                            )
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.background
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BottomNavigationPreview() {
    StokkuAITheme(dynamicColor = false) {
        BottomNavigation(
            navController = rememberNavController()
        )
    }
}