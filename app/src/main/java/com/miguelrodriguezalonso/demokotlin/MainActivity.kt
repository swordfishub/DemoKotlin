package com.miguelrodriguezalonso.demokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Miguel Rodríguez Alonso on 2/2/18.
 */
class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = ForecastListAdapter(obtainData()) {
            startActivity(Intent(this.baseContext, DetailActivity::class.java))
        }
    }

    private fun obtainData() : List<Forecast> = listOf(
            Forecast("03/02/18", "Soleado", 6, 0),
            Forecast("03/02/18", "Soleado", 6, 0),
            Forecast("03/02/18", "Soleado", 6, 0))

}

