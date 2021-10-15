package com.ottogroup.ogkit.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.ottogroup.ogkit.profile.model.ImageItem
import com.ottogroup.ogkit.profile.model.Item
import com.ottogroup.ogkit.profile.model.Section
import com.ottogroup.ogkit.profile.model.TextItem
import com.ottogroup.ogkit.profile.model.User
import com.ottogroup.ogkit.styles.CustomStyles
import java.util.Locale

@Composable
fun Profile(
    modifier: Modifier = Modifier,
    user: User,
    sections: List<Section>,
    userIsLoggedIn: Boolean,
    onLogin: () -> Unit,
    onLogout: () -> Unit
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 24.dp)
    ) {
        if (userIsLoggedIn) {
            UsernameHeader(
                username = user.username,
                textStyle = CustomStyles.profileStyles.usernameTextStyle
            )
        } else {
            LoginButton(
                onLogin = onLogin,
                textStyle = CustomStyles.profileStyles.loginButtonTextStyle
            )
        }

        SectionsContainer(
            sections = sections,
            sectionTitleTextStyle = CustomStyles.profileStyles.sectionTitleTextStyle,
            itemTitleTextStyle = CustomStyles.profileStyles.itemTitleTextStyle
        )

        if (userIsLoggedIn) {
            LogoutButton(
                onLogout = onLogout,
                textStyle = CustomStyles.profileStyles.logoutButtonTextStyle
            )
        }
    }
}

@Composable
private fun UsernameHeader(
    username: String,
    textStyle: TextStyle
) {
    Text(
        text = "Hello $username",
        style = textStyle,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    )
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
private fun LoginButton(
    textStyle: TextStyle,
    onLogin: () -> Unit
) {
    Button(
        onClick = onLogin,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
            )
    ) {
        Text(
            text = "LOGIN",
            style = textStyle,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 7.dp, bottom = 9.dp)
        )
    }
    Spacer(modifier = Modifier.height(24.dp))
}

@Composable
private fun LogoutButton(
    textStyle: TextStyle,
    onLogout: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp)
    ) {
        TextButton(
            onClick = onLogout,
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 7.dp,
                    bottom = 9.dp
                )
        ) {
            Text(
                text = "LOGOUT",
                style = textStyle,
            )
        }
    }
}

@Composable
private fun SectionsContainer(
    modifier: Modifier = Modifier,
    sections: List<Section>,
    sectionTitleTextStyle: TextStyle,
    itemTitleTextStyle: TextStyle
) {
    Column(modifier = modifier) {
        for (section in sections) {
            ProfileSection(
                section = section,
                titleTextStyle = sectionTitleTextStyle,
                itemTitleTextStyle = itemTitleTextStyle,
            )
        }
    }
}

@Composable
private fun ProfileSection(
    modifier: Modifier = Modifier,
    section: Section,
    titleTextStyle: TextStyle,
    itemTitleTextStyle: TextStyle,
) {
    Column(
        modifier.padding(bottom = 16.dp)
    ) {
        Text(
            text = section.title.toUpperCase(Locale.ROOT),
            style = titleTextStyle,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 9.dp,
                    bottom = 10.dp
                )
                .fillMaxWidth()
        )
        for (item in section.items) {
            ProfileItem(
                item = item,
                itemTitleTextStyle = itemTitleTextStyle
            )
        }
    }
}

@Composable
private fun ProfileItem(
    item: Item,
    itemTitleTextStyle: TextStyle
) {
    when (item) {
        is TextItem -> ProfileTextItem(
            textItem = item,
            titleTextStyle = itemTitleTextStyle
        )
        is ImageItem -> ProfileImageItem(imageItem = item)
    }
}

@Composable
private fun ProfileTextItem(
    textItem: TextItem,
    titleTextStyle: TextStyle
) {
    Text(
        text = textItem.title,
        style = titleTextStyle,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 15.dp,
                bottom = 12.dp
            )
            .fillMaxWidth()
    )
}

@Composable
private fun ProfileImageItem(imageItem: ImageItem) {
    Image(
        painter = painterResource(id = imageItem.drawableResId),
        contentDescription = imageItem.contentDescription,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}
