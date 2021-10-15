package de.lascana.compose.ui.theme

import android.view.Window
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.ottogroup.ogkit.styles.CustomStyles
import com.ottogroup.ogkit.styles.SystemBarStyles

@Composable
fun LascanaTheme(
    window: Window,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = LascanaColorPalette,
        typography = LascanaTypography,
        shapes = LascanaShapes,
    ) {
        CustomStyles(
            systemBarStyles = SystemBarStyles.create(window = window),
            profileStyles = LascanaProfileStyles
        ) {
            content()
        }
    }
}
