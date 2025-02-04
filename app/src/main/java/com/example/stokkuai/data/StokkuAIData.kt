package com.example.stokkuai.data

import com.example.stokkuai.R
import com.example.stokkuai.data.model.ImageSliderItem

object StokkuAIData {
    val sliderImage = listOf(
        ImageSliderItem(
            imageResId = R.drawable.image_welcome_1,
            title = "Stock Management Issues?",
            description = "Struggling with messy inventory? Keeping track of stock manually can be confusing and time-consuming."
        ),

        ImageSliderItem(
            imageResId = R.drawable.image_welcome_2,
            title = "Simplify with Smart Scanning",
            description = "Easily manage your inventory—just scan and let the app handle the rest, ensuring accuracy and efficiency."
        ),
    )
}