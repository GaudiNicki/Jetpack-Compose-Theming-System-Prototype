package de.lascana.compose.myaccount.data

import com.ottogroup.ogkit.profile.model.ImageItem
import com.ottogroup.ogkit.profile.model.Section
import com.ottogroup.ogkit.profile.model.TextItem
import de.lascana.compose.R

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
        title = "An Lascana Image",
        items = listOf(
            ImageItem(
                R.drawable.lascana,
                "Lascana"
            ),
        )
    ),
    Section(
        title = "Lascana App",
        items = listOf(
            TextItem("Rate the app"),
            TextItem("Send your feedback about the app"),
            TextItem("Recommend the app"),
            TextItem("What is new?"),
        )
    ),
    Section(
        title = "About Lascana",
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
