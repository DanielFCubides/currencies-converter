package daf.demotdd.delivery

import daf.demotdd.usecase.CurrencyUseCaseImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CurrencyController() {


    @Autowired
    lateinit var currencyUseCase: CurrencyUseCaseImpl


    @GetMapping("/currency")
    fun getAllCurrencies(): List<String> =
            currencyUseCase.getAllCurrencies()

    @PostMapping("/currency")
    fun AddCurrency(): String =
            "Implement me"

}
