package daf.demotdd.usecase

import org.springframework.stereotype.Component

@Component
class CurrencyUseCaseImpl : CurrencyUseCase {
    override fun getAllCurrencies(): List<String> {
        val currencies = listOf("USD:1", "COP:3500")
        return currencies
    }
}