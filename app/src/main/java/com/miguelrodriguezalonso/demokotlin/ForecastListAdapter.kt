package com.miguelrodriguezalonso.demokotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Miguel Rodríguez Alonso on 2/2/18.
 */
class ForecastListAdapter(private val forecastList: List<Forecast>, private val itemClick: (Forecast) -> Unit) : RecyclerView.Adapter<ForecastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_forecast, parent, false)
        return ForecastViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(viewHolder: ForecastViewHolder, position: Int) {
        viewHolder.bindForecast(forecastList[position])
    }

    override fun getItemCount(): Int = forecastList.size

}