package com.miguelrodriguezalonso.demokotlin.domain

import java.util.*

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
data class Currency(
        val id: String,
        val symbol: String,
        val rank: Int,
        val priceUsd: Double,
        val priceBtc: Double,
        val dayVolumeUsd: Double,
        val marketCapUsd: Double,
        val availableSupply: Double,
        val totalSupply: Double,
        val percentChangeHour: Double,
        val percentChangeDay: Double,
        val percentChangeWeek: Double,
        val lastUpdated: Date
)