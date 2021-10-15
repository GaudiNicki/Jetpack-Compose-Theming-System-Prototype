package de.bonprix.compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import de.bonprix.compose.R

private val ubuntu = FontFamily(
    Font(R.font.ubuntu_light, FontWeight.Light),
    Font(R.font.ubuntu_regular),
    Font(R.font.ubuntu_medium, FontWeight.Medium),
    Font(R.font.ubuntu_bold, FontWeight.Bold)
)

val BonprixTypography = Typography(
    h2 = TextStyle(
        fontFamily = ubuntu,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),
    h5 = TextStyle(
        fontFamily = ubuntu,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = ubuntu,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
    caption = TextStyle(
        fontFamily = ubuntu,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
    )
)
