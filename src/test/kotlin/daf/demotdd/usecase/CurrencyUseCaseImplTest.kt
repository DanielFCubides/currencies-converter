package daf.demotdd.usecase

import daf.demotdd.model.Currency
import daf.demotdd.repository.CurrencyRepository
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class CurrencyUseCaseImplTest {


    @Test
    fun getAllCurrencies() {
        val currencyRepository = mock(CurrencyRepository::class.java)
        val useCase = CurrencyUseCaseImpl(currencyRepository)
        val currenciesResult = useCase.getAllCurrencies()
        val currenciesExpected = listOf(Currency("US", "1"))
        assertEquals(currenciesExpected, currenciesResult)

    }


}
