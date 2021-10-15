package de.lascana.compose.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val lascanaBlack = Color(0xFF000000)
val lascanaPink = Color(0xFFBC096D)
val lascanaPurple = Color(0xFF5B1F67)
val lascanaWhite = Color(0xFFFFFFFF)
val lascanaMediumGrey = Color(0xFFF8F8F8)

val LascanaColorPalette = lightColors(
    primary = lascanaPurple,
    onPrimary = lascanaWhite,
    secondary = lascanaPurple,
    onSecondary = lascanaWhite,
    surface = lascanaMediumGrey,
    onSurface = lascanaBlack
)
