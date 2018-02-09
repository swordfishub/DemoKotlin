package com.miguelrodriguezalonso.demokotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_forecast.view.*

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */
class ForecastViewHolder(view: View, private val itemClick: (Forecast) -> Unit) : RecyclerView.ViewHolder(view) {

    fun bindForecast(forecast: Forecast) {
        with(forecast) {
            itemView.date.text = date
            itemView.description.text = description
            itemView.maxTemperature.text = "${high}º"
            itemView.minTemperature.text = "${low}º"
            itemView.setOnClickListener { itemClick(this) }
        }
    }
}