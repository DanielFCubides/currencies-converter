package daf.demotdd.usecase

import daf.demotdd.repository.CurrencyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import kotlin.streams.toList

@Component
class CurrencyUseCaseImpl(@Autowired var currencyRepository: CurrencyRepository) : CurrencyUseCase {


    override fun getAllCurrencies(): List<String> {
        val currencies = currencyRepository.getAllCurrencies()
        return currencies.stream().map { x ->
            x.name + x.dollarConversion
        }.toList()
    }
}