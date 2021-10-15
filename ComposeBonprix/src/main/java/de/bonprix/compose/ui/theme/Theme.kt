package de.bonprix.compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.ottogroup.ogkit.styles.CustomStylesTheme
import com.ottogroup.ogkit.styles.SystemBarStyles

@Composable
fun BonprixTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = BonprixColorPalette,
        typography = BonprixTypography,
        shapes = BonprixShapes,
    ) {
        CustomStylesTheme(
            systemBarStyles = SystemBarStyles.create(),
            profileStyles = BonprixProfileStyles,
            content = content
        )
    }
}
