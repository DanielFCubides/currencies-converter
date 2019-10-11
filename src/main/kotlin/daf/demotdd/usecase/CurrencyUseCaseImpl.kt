package daf.demotdd.usecase

import daf.demotdd.repository.CurrencyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CurrencyUseCaseImpl(@Autowired var currencyRepository: CurrencyRepository) : CurrencyUseCase {


    override fun getAllCurrencies(): List<String> {
        val currencies = currencyRepository.getAllCurrencies()
//        println(currencyRepository.getAllCurrencies())
//        val currencies = listOf("USD:1", "COP:3500")
        return currencies.stream().map { x -> }
    }
}