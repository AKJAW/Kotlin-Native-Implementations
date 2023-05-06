package calendar

interface DayOfWeekNameProvider {

    fun getLongName(dayNumber: Int): String?
}

expect fun createDayOfWeekNameProvider(): DayOfWeekNameProvider
