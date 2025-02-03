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

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier
            .drawWithContent {
                drawContent()
                drawLine(
                    color = Color(0xFFE3E3E3),
                    start = Offset(0f, 0f),
                    end = Offset(size.width, 0f),
                    strokeWidth = 2f
                )
            }
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
                title = "Scan",
                icon = painterResource(R.drawable.icon_scan),
                iconSelected = painterResource(R.drawable.icon_scan),
                screen = Screen.Scan
            ),
            BottomBarItem(
                title = "Stock",
                icon = painterResource(R.drawable.icon_chart_stock),
                iconSelected = painterResource(R.drawable.icon_chart_stock),
                screen = Screen.StockList
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
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        Text(
                            text = item.title,
                            fontWeight = FontWeight.Medium,
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