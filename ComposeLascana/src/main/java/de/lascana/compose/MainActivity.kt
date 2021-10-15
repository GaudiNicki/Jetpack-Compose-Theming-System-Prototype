package de.lascana.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import de.lascana.compose.myaccount.MyAccount
import de.lascana.compose.ui.theme.LascanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LascanaTheme(window = window) {
                MyAccount()
            }
        }
    }
}
