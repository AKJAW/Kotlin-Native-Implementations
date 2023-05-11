package calendar

import localization.LocaleProvider
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSLocale

class IosDayOfWeekNameProvider(
    private val localeProvider: LocaleProvider
) : DayOfWeekNameProvider {

    override fun getLongName(dayNumber: Int): String? {
        val dateFormatter = NSDateFormatter().apply {
            this.locale = NSLocale(localeProvider.getLanguage().value)
        }
        val index = dayNumber % 7
        return dateFormatter.weekdaySymbols[index].toString()
    }
}

actual fun createDayOfWeekNameProvider(localeProvider: LocaleProvider): DayOfWeekNameProvider =
    IosDayOfWeekNameProvider(localeProvider)
