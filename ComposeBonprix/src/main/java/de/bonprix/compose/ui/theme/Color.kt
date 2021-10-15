package de.bonprix.compose.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val bonprixRed = Color(0xFFD21929)
val bonprixWhite = Color(0xFFFFFFFF)
val bonprixGrey60 = Color(0xFF666666)

val BonprixColorPalette = lightColors(
    primary = bonprixRed,
    onPrimary = bonprixWhite,
    secondary = bonprixRed,
    onSecondary = bonprixWhite
)
