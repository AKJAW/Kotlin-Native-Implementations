package calendar

import localization.Language
import localization.LocaleProvider
import localization.createLocaleProvider
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

// https://github.com/JetBrains/compose-multiplatform/issues/3135
class DayOfWeekNameProviderContractTest {

    @Test
    fun `Day number 1 is Monday`() =
        longNameTestCase(dayNumber = 1, "Monday")

    @Test
    fun `Day number 2 Tuesday`() =
        longNameTestCase(dayNumber = 2, "Tuesday")

    @Test
    fun `Day number 3 Wednesday`() =
        longNameTestCase(dayNumber = 3, "Wednesday")

    @Test
    fun `Day number 4 Thursday`() =
        longNameTestCase(dayNumber = 4, "Thursday")

    @Test
    fun `Day number 5 Friday`() =
        longNameTestCase(dayNumber = 5, "Friday")

    @Test
    fun `Day number 6 Saturday`() =
        longNameTestCase(dayNumber = 6, "Saturday")

    @Test
    fun `Day number 7 Sunday`() =
        longNameTestCase(dayNumber = 7, "Sunday")

    private fun longNameTestCase(dayNumber: Int, expectedName: String) {
        val sut =
            createDayOfWeekNameProvider(FakeLocaleProvider("en"))

        val result = sut.getLongName(dayNumber)

        assertEquals(expectedName, result)
    }
}

class FakeLocaleProvider(
    private val languageCode: String
) : LocaleProvider {

    override fun getLanguage(): Language =
        Language(languageCode)
}
