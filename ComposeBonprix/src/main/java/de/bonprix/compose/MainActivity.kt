package de.bonprix.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import de.bonprix.compose.mybonprix.MyBonprix
import de.bonprix.compose.ui.theme.BonprixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BonprixTheme {
                MyBonprix()
            }
        }
    }
}
