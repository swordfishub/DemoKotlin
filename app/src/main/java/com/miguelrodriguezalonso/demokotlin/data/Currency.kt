package com.miguelrodriguezalonso.demokotlin.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */

data class Currency(
        val id: String,
        val symbol: String,
        val rank: String,
        @SerializedName("price_usd") val priceUsd: String,
        @SerializedName("price_btc") val priceBtc: String,
        @SerializedName("24h_volume_usd") val dayVolumeUsd: String,
        @SerializedName("market_cap_usd") val marketCapUsd: String,
        @SerializedName("available_supply") val availableSupply: String,
        @SerializedName("total_supply") val totalSupply: String,
        @SerializedName("percent_change_1h") val percentChangeHour: String,
        @SerializedName("percent_change_24h") val percentChangeDay: String,
        @SerializedName("percent_change_7d") val percentChangeWeek: String,
        @SerializedName("last_updated") val lastUpdated: String
)