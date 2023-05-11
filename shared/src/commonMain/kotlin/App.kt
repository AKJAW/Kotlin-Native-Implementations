//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Button
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Text
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import calendar.createDayOfWeekNameProvider
//import localization.createLocaleProvider
//
//@Composable
//fun App() {
//    val localeProvider = remember { createLocaleProvider() }
//    val dayOfWeekNameProvider = remember { createDayOfWeekNameProvider(createLocaleProvider()) }
//    MaterialTheme {
//        var dayNumber by remember { mutableStateOf(1) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Spacer(Modifier.height(16.dp))
//            Text(
//                text = "${getPlatformName()} Language: ${localeProvider.getLanguage().value}",
//                style = MaterialTheme.typography.h6
//            )
//            Spacer(Modifier.height(32.dp))
//            val dayName = remember(dayNumber) { dayOfWeekNameProvider.getLongName(dayNumber) }
//            Text(
//                text = "Day of the week: $dayName",
//                style = MaterialTheme.typography.h6
//            )
//            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
//                Button(onClick = { dayNumber -= 1 }) {
//                    Text("Previous day")
//                }
//                Button(onClick = { dayNumber += 1 }) {
//                    Text("Next day")
//                }
//            }
//        }
//    }
//}

expect fun getPlatformName(): String