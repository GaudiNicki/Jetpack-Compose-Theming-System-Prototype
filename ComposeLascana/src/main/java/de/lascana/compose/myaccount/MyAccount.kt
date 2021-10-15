package de.lascana.compose.myaccount

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ottogroup.ogkit.profile.Profile
import com.ottogroup.ogkit.profile.model.User
import de.lascana.compose.R
import de.lascana.compose.myaccount.data.fakeSections

@Composable
fun MyAccount() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBarContainer() }
    ) { innerPadding ->
        ProfileContainer(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
private fun TopAppBarContainer() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.primary,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Toolbar()
    }
}

@Composable
private fun Toolbar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(R.drawable.toolbar_icon_menu),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
        )

        Icon(
            painter = painterResource(R.drawable.toolbar_logo),
            contentDescription = null,
            modifier = Modifier
                .padding(horizontal = 40.dp)
        )

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.padding(0.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.search_toolbar_icon),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
            Icon(
                painter = painterResource(R.drawable.toolbar_icon_favorites),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
            Icon(
                painter = painterResource(R.drawable.account_toolbar_icon),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
            Icon(
                painter = painterResource(R.drawable.ic_cart),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .size(24.dp)
            )
        }
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

@Preview
@Composable
private fun TopAppBarPreview() {
    TopAppBarContainer()
}
