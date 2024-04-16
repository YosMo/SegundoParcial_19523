package com.example.example.models

import androidx.annotation.DrawableRes

data class Personaje(
    val profesion: String,
    val genero: String,
    val edad: Int,
    @DrawableRes val image: Int
)
