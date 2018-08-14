package com.zensolutions.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.zensolutions.coderswag.Adapters.CategoryAdapter
import com.zensolutions.coderswag.Model.Categroy
import com.zensolutions.coderswag.R
import com.zensolutions.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter= CategoryAdapter(this, DataService.catergories)
        lv_category_list.adapter= mAdapter
    }
}
