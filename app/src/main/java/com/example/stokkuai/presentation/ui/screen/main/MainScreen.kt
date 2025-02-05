package com.example.stokkuai.presentation.ui.screen.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.stokkuai.R
import com.example.stokkuai.presentation.ui.component.BottomNavigation
import com.example.stokkuai.presentation.navigation.graph.MainNavGraph
import com.example.stokkuai.presentation.navigation.model.Screen
import com.example.stokkuai.presentation.theme.StokkuAITheme

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            Box {
                FloatingActionButton(
                    containerColor = MaterialTheme.colorScheme.primary,
                    onClick = {
                        navController.navigate(Screen.Scan.route) {
                            popUpTo(navController.graph.findStartDestination().id){
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                    elevation = FloatingActionButtonDefaults.elevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 0.dp
                    ),
                    shape = CircleShape,
                    modifier = Modifier
                        .size(60.dp)
                        .align(Alignment.Center)
                        .offset(y = 80.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.icon_scan),
                        contentDescription = "Scan",
                        tint = Color.White,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        },
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

@Preview
@Composable
private fun MainScreenPreview() {
    StokkuAITheme(dynamicColor = false) {
        MainScreen()
    }
}