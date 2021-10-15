package de.bonprix.compose.mybonprix.data

import com.ottogroup.ogkit.profile.model.ImageItem
import com.ottogroup.ogkit.profile.model.Section
import com.ottogroup.ogkit.profile.model.TextItem
import de.bonprix.compose.R
import de.bonprix.compose.mybonprix.model.NavigationItemData
import de.bonprix.compose.ui.theme.bonprixGrey60
import de.bonprix.compose.ui.theme.bonprixRed

val fakeSections = listOf(
    Section(
        title = "My data",
        items = listOf(
            TextItem("My account"),
            TextItem("Order overview"),
        )
    ),
    Section(
        title = "Customer Service",
        items = listOf(
            TextItem("Our customer services"),
            TextItem("Consulting"),
            TextItem("Write us a mail"),
            TextItem("Call us: 0404 - 6462321"),
        )
    ),
    Section(
        title = "Fashion Connect Store",
        items = listOf(
            ImageItem(
                R.drawable.fashion_connect,
                "Fashion Connect Store"
            ),
        )
    ),
    Section(
        title = "bonprix App",
        items = listOf(
            TextItem("Rate the app"),
            TextItem("Send your feedback about the app"),
            TextItem("Recommend the app"),
            TextItem("What is new?"),
        )
    ),
    Section(
        title = "About bonprix",
        items = listOf(
            TextItem("Become a fan"),
            TextItem("Our company"),
            TextItem("Legal notice"),
        )
    ),
    Section(
        title = "Settings",
        items = listOf(
            TextItem("Notifications"),
            TextItem("Change country"),
        )
    ),
)

val fakeBottomNavigationItemsData = listOf(
    NavigationItemData(
        label = "Home",
        iconResId = R.drawable.logo,
        color = bonprixGrey60,
        isSelected = false
    ),
    NavigationItemData(
        label = "Assortment",
        iconResId = R.drawable.ic_assortment,
        color = bonprixGrey60,
        isSelected = false
    ),
    NavigationItemData(
        label = "Wishlist",
        iconResId = R.drawable.ic_heart,
        color = bonprixGrey60,
        isSelected = false
    ),
    NavigationItemData(
        label = "Cart",
        iconResId = R.drawable.ic_cart,
        color = bonprixGrey60,
        isSelected = false
    ),
    NavigationItemData(
        label = "My bonprix",
        iconResId = R.drawable.ic_user,
        color = bonprixRed,
        isSelected = false
    ),
)
