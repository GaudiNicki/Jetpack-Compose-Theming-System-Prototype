package de.lascana.compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ottogroup.ogkit.styles.ProfileStyles

val LascanaProfileStyles: ProfileStyles
    @Composable
    get() = ProfileStyles.create(
        logoutButtonTextStyle = MaterialTheme.typography.button.copy(
            color = lascanaPink,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        ),
        usernameTextStyle = MaterialTheme.typography.h5.copy(
            color = lascanaPink
        ),
        sectionTitleTextStyle = MaterialTheme.typography.subtitle1.copy(
            color = lascanaPurple,
        )
    )
