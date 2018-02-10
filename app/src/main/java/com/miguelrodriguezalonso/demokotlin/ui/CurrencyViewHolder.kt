package com.miguelrodriguezalonso.demokotlin.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import com.miguelrodriguezalonso.demokotlin.domain.Currency
import kotlinx.android.synthetic.main.item_currency.view.*
import java.text.DecimalFormat

/**
 * Created by Miguel Rodríguez Alonso on 3/2/18.
 */
class CurrencyViewHolder(view: View, private val itemClick: (Currency) -> Unit) : RecyclerView.ViewHolder(view) {

    fun bindForecast(currency: Currency) {
        with(currency) {
            itemView.name.text = id.capitalize()
            itemView.code.text = symbol
            itemView.price.text = "${DecimalFormat("0.##").format(priceUsd)} $"
            itemView.setOnClickListener { itemClick(this) }
        }
    }
}