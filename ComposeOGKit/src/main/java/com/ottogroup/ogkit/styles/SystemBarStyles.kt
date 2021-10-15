package com.ottogroup.ogkit.styles

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class SystemBarStyles internal constructor(
    val navigationBarColor: Color,
    val statusBarColor: Color,
) {
    companion object {
        @Composable
        fun create(
            navigationBarColor: Color = MaterialTheme.colors.surface,
            statusBarColor: Color = MaterialTheme.colors.surface,
        ) = SystemBarStyles(
            navigationBarColor,
            statusBarColor
        )
    }
}
