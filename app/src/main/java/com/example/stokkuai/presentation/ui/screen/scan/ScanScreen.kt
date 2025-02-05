package com.example.stokkuai.presentation.ui.screen.scan

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stokkuai.presentation.theme.StokkuAITheme

@Composable
fun ScanScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Scan Screen",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScanScreenPreview() {
    StokkuAITheme {
        ScanScreen()
    }
}