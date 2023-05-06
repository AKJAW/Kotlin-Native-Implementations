package localization

import java.util.Locale

class AndroidLocaleProvider : LocaleProvider {

    override fun getLanguage(): Language = Language(Locale.getDefault().language)
}

actual fun createLocaleProvider(): LocaleProvider = AndroidLocaleProvider()