package de.bonprix.compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.ottogroup.ogkit.styles.ProfileStyles

val BonprixProfileStyles: ProfileStyles
    @Composable
    get() = ProfileStyles.create(
        usernameTextStyle = MaterialTheme.typography.h5.copy(
            color = MaterialTheme.colors.onSurface,
            textAlign = TextAlign.Center
        ),
        sectionTitleTextStyle = MaterialTheme.typography.subtitle1.copy(
            color = MaterialTheme.colors.onSurface
        ),
        itemTitleTextStyle = MaterialTheme.typography.body1.copy(
            color = bonprixGrey60
        ),
        loginButtonTextStyle = MaterialTheme.typography.button.copy(
            textAlign = TextAlign.Center
        ),
        logoutButtonTextStyle = MaterialTheme.typography.button.copy(
            color = MaterialTheme.colors.onSurface,
            textAlign = TextAlign.Center
        )
    )
