package localization

data class Language(val value: String)

interface LocaleProvider {

    fun getLanguage(): Language
}

expect fun createLocaleProvider(): LocaleProvider