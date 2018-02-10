package com.miguelrodriguezalonso.demokotlin.data

import com.google.gson.Gson
import java.net.URL

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
class CurrenciesRequest{

    companion object {
        private const val URL = "https://api.coinmarketcap.com"
        private const val ENDPOINT  = "/v1/ticker"
        private const val LIMIT = 10
        private const val COMPLETE_URL = "$URL/$ENDPOINT/?limit=$LIMIT"
    }

    fun execute() : List<Currency> {
        val currenciesJsonStr = URL(COMPLETE_URL).readText()
        return Gson().fromJson(currenciesJsonStr , Array<Currency>::class.java).toList()
    }
}