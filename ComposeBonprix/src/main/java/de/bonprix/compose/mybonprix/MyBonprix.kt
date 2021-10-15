package de.bonprix.compose.mybonprix

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ottogroup.ogkit.profile.Profile
import com.ottogroup.ogkit.profile.model.User
import de.bonprix.compose.mybonprix.data.fakeBottomNavigationItemsData
import de.bonprix.compose.mybonprix.data.fakeSections
import de.bonprix.compose.ui.theme.BonprixTheme

@Composable
fun MyBonprix() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBarContainer() },
        bottomBar = { BottomNavigationContainer() }
    ) { innerPadding ->
        ProfileContainer(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
private fun TopAppBarContainer() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.onSurface
    ) {
        Text(
            text = "My bonprix",
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
private fun ProfileContainer(
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier) {
        var userIsLoggedIn by remember { mutableStateOf(false) }

        Profile(
            modifier = Modifier.fillMaxWidth(),
            user = User("Niklas"),
            sections = fakeSections,
            userIsLoggedIn = userIsLoggedIn,
            onLogin = { userIsLoggedIn = true },
            onLogout = { userIsLoggedIn = false }
        )
    }
}

@Composable
private fun BottomNavigationContainer() {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.onSurface,
    ) {
        for (bottomNavigationItemData in fakeBottomNavigationItemsData) {
            BottomNavigationItem(
                selected = bottomNavigationItemData.isSelected,
                onClick = { },
                icon = {
                    Icon(
                        painter = painterResource(bottomNavigationItemData.iconResId),
                        contentDescription = null,
                        tint = bottomNavigationItemData.color,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = bottomNavigationItemData.label,
                        style = MaterialTheme.typography.caption,
                        color = bottomNavigationItemData.color
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun MyBonprixPreview() {
    BonprixTheme {
        MyBonprix()
    }
}
