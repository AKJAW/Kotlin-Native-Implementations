package calendar

import localization.LocaleProvider
import localization.createLocaleProvider
import java.util.*

class AndroidDayOfWeekNameProvider(
    private val localeProvider: LocaleProvider
) : DayOfWeekNameProvider {

    override fun getLongName(dayNumber: Int): String? {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.DAY_OF_WEEK, dayNumber)
        val locale = Locale(localeProvider.getLanguage().value)
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)
    }
}

actual fun createDayOfWeekNameProvider(localeProvider: LocaleProvider): DayOfWeekNameProvider =
    AndroidDayOfWeekNameProvider(createLocaleProvider())
