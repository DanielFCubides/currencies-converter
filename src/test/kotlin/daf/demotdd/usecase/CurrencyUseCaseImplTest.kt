package daf.demotdd.usecase

import daf.demotdd.model.Currency
import daf.demotdd.repository.CurrencyRepository
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock

class CurrencyUseCaseImplTest {


    @Test
    fun getAllCurrencies() {
        val currencyRepository = mock(CurrencyRepository::class.java)
        val currencyList = listOf(Currency("US", "1"))
        Mockito.`when`(currencyRepository.getAllCurrencies()).thenReturn(currencyList)
        val useCase = CurrencyUseCaseImpl(currencyRepository)
        val currenciesResult = useCase.getAllCurrencies()
        val currenciesExpected = listOf("US1")
        assertEquals(currenciesExpected, currenciesResult)

    }


}
