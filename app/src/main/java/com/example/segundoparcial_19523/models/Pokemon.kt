package com.example.example.models

import androidx.annotation.DrawableRes

data class Pokemon(
    @DrawableRes val image: Int,
    val name: String,
)