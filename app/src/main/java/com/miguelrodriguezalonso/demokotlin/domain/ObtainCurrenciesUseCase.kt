package com.miguelrodriguezalonso.demokotlin.domain

import com.miguelrodriguezalonso.demokotlin.data.CurrenciesRequest

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
class ObtainCurrenciesUseCase : UseCase<List<Currency>> {

    override fun execute(): List<Currency> {
        val currenciesRequest = CurrenciesRequest()
        return CurrenciesDataMapper().convertToDomain(currenciesRequest.execute())
    }

}