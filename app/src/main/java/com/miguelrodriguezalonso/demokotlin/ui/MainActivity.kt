package com.miguelrodriguezalonso.demokotlin.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.miguelrodriguezalonso.demokotlin.R
import com.miguelrodriguezalonso.demokotlin.domain.Currency
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Miguel Rodríguez Alonso on 2/2/18.
 */
class MainActivity : AppCompatActivity(), MainView{

    private val presenter = MainPresenter(this)

    //region AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = CurrenciesAdapter{
            presenter.onCurrencySelected(it)
        }

        presenter.onStart()
    }

    //endregion AppCompatActivity

    //region MainView

    override fun addItemsToList(items: List<Currency>) {
        (list.adapter as CurrenciesAdapter).currencies = items
    }

    override fun showLoading(show: Boolean) {
        progress.visibility = if (show) View.VISIBLE else View.GONE
    }

    override fun goToCurrencyDetail(currency: Currency) {
        startActivity(Intent(baseContext, DetailActivity::class.java))
    }

    //endregion MainView

}

