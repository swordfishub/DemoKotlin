package com.miguelrodriguezalonso.demokotlin.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.miguelrodriguezalonso.demokotlin.R
import com.miguelrodriguezalonso.demokotlin.domain.Currency

/**
 * Created by Miguel Rodríguez Alonso on 2/2/18.
 */
class CurrenciesAdapter(private val itemClick: (Currency) -> Unit) : RecyclerView.Adapter<CurrencyViewHolder>() {

    var currencies: List<Currency> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent, false)
        return CurrencyViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(viewHolder: CurrencyViewHolder, position: Int) {
        viewHolder.bindForecast(currencies[position])
    }

    override fun getItemCount(): Int = currencies.size

}