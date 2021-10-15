package com.ottogroup.ogkit.styles

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

data class ProfileStyles internal constructor(
    val usernameTextStyle: TextStyle,
    val sectionTitleTextStyle: TextStyle,
    val itemTitleTextStyle: TextStyle,
    val loginButtonTextStyle: TextStyle,
    val logoutButtonTextStyle: TextStyle
) {
    companion object {
        @Composable
        fun create(
            usernameTextStyle: TextStyle = MaterialTheme.typography.h5,
            sectionTitleTextStyle: TextStyle = MaterialTheme.typography.subtitle1,
            itemTitleTextStyle: TextStyle = MaterialTheme.typography.body1,
            loginButtonTextStyle: TextStyle = MaterialTheme.typography.button,
            logoutButtonTextStyle: TextStyle = MaterialTheme.typography.button
        ) = ProfileStyles(
            usernameTextStyle,
            sectionTitleTextStyle,
            itemTitleTextStyle,
            loginButtonTextStyle,
            logoutButtonTextStyle,
        )
    }
}

internal val LocalProfileStyles = staticCompositionLocalOf<ProfileStyles> {
    error("ProfileStyles need to be set by provider")
}
