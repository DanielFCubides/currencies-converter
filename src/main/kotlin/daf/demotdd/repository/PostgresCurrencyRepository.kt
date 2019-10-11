package daf.demotdd.repository

import daf.demotdd.model.Currency
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository

@Repository
class PostgresCurrencyRepository : CurrencyRepository {

    @Autowired
    private val jdbcTemplate: JdbcTemplate? = null

    override fun getAllCurrencies(): List<Currency> {
        val currencyList: List<Currency> = jdbcTemplate!!.query("select * from currency", RowMapper { rs, _ ->
            Currency(rs.getString("name"), rs.getString("dollar_conversion"))
        })
        return currencyList

    }

    override fun getCurrencyByName(currencyName: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}