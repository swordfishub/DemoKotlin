package com.miguelrodriguezalonso.demokotlin.ui

import com.miguelrodriguezalonso.demokotlin.domain.Currency
import com.miguelrodriguezalonso.demokotlin.domain.ObtainCurrenciesUseCase
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
class MainPresenter(private val view: MainView){

    fun onStart(){

        async{
            view.showLoading(true)
            val currencies = ObtainCurrenciesUseCase().execute()
            uiThread {
                view.showLoading(false)
                view.addItemsToList(currencies)
            }
        }

    }

    fun onCurrencySelected(currency: Currency) {
        view.goToCurrencyDetail(currency)
    }
}