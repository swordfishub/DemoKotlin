package com.miguelrodriguezalonso.demokotlin.domain

import android.icu.text.DateTimePatternGenerator
import android.text.format.DateUtils
import java.sql.Timestamp
import java.util.*
import com.miguelrodriguezalonso.demokotlin.data.Currency as DataCurrency

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
class CurrenciesDataMapper {

    fun convertToDomain(currencies: List<DataCurrency>) : List<Currency> {

        return currencies.map { convertCurrencyToDomain(it) }
    }

    private fun convertCurrencyToDomain(currency: DataCurrency): Currency {

        return Currency(
                currency.id,
                currency.symbol,
                currency.rank.toInt(),
                currency.priceUsd.toDouble(),
                currency.priceBtc.toDouble(),
                currency.dayVolumeUsd.toDouble(),
                currency.marketCapUsd.toDouble(),
                currency.availableSupply.toDouble(),
                currency.totalSupply.toDouble(),
                currency.percentChangeHour.toDouble(),
                currency.percentChangeDay.toDouble(),
                currency.percentChangeWeek.toDouble(),
                convertDate(currency.lastUpdated))
    }

    private fun convertDate(date: String) : Date = Date(date.toLong())
}