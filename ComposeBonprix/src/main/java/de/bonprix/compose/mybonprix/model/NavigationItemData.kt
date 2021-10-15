package de.bonprix.compose.mybonprix.model

import androidx.compose.ui.graphics.Color

data class NavigationItemData(
    val label: String,
    val iconResId: Int,
    val color: Color,
    val isSelected: Boolean,
)
