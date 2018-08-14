package com.zensolutions.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.zensolutions.coderswag.Model.Catergroy
import com.zensolutions.coderswag.R
import com.zensolutions.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Catergroy>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.catergories)

        lv_category_list.adapter = adapter
    }
}
