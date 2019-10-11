package daf.demotdd.repository

import daf.demotdd.model.Currency

interface CurrencyRepository {
    fun getAllCurrencies(): List<Currency>
    fun getCurrencyByName(currencyName: String): String
}
