import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import localization.createLocaleProvider

@Composable
fun App() {
    val localeProvider = remember { createLocaleProvider() }
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text("${getPlatformName()} Language: ${localeProvider.getLanguage().value}")
        }
    }
}

expect fun getPlatformName(): String