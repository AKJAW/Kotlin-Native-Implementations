package localization

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

class IosLocaleProvider : LocaleProvider {

    override fun getLanguage(): Language =
        Language(NSLocale.currentLocale.languageCode)
}

actual fun createLocaleProvider(): LocaleProvider =
    IosLocaleProvider()