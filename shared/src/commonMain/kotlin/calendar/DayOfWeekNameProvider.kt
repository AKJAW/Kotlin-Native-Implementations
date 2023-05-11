package calendar

import localization.LocaleProvider

interface DayOfWeekNameProvider {

    fun getLongName(dayNumber: Int): String?
}

expect fun createDayOfWeekNameProvider(localeProvider: LocaleProvider): DayOfWeekNameProvider
