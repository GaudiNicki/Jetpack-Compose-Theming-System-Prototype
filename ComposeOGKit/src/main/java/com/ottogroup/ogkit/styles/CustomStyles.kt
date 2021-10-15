package com.ottogroup.ogkit.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.google.accompanist.systemuicontroller.LocalSystemUiController
import com.google.accompanist.systemuicontroller.rememberAndroidSystemUiController

@Composable
fun CustomStylesTheme(
    systemBarStyles: SystemBarStyles,
    profileStyles: ProfileStyles = CustomStyles.profileStyles,
    content: @Composable () -> Unit
) {
    val systemUiController = rememberAndroidSystemUiController()

    CompositionLocalProvider(
        LocalSystemUiController provides systemUiController,
        LocalProfileStyles provides profileStyles
    ) {
        LocalSystemUiController.current.apply {
            setNavigationBarColor(systemBarStyles.navigationBarColor)
            setStatusBarColor(systemBarStyles.statusBarColor)
        }
        content()
    }
}

object CustomStyles {
    val profileStyles: ProfileStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalProfileStyles.current
}
