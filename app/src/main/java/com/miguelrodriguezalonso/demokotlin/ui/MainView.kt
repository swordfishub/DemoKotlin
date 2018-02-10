package com.miguelrodriguezalonso.demokotlin.ui

import com.miguelrodriguezalonso.demokotlin.domain.Currency

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
interface MainView {

    fun addItemsToList(items: List<Currency>)
    fun showLoading(show: Boolean)
    fun goToCurrencyDetail(currency: Currency)
}