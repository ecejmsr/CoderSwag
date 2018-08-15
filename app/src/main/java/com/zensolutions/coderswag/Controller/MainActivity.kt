package com.zensolutions.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.zensolutions.coderswag.Adapters.CategoryRecycleAdapter
import com.zensolutions.coderswag.R
import com.zensolutions.coderswag.Services.DataService
import com.zensolutions.coderswag.Utils.EXTRA_CATERGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter= CategoryRecycleAdapter(this, DataService.catergories){
            category -> val productIntent= Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATERGORY, category.title)
            startActivity(productIntent)
        }
        lv_category_list.adapter= mAdapter

        val layoutManager = LinearLayoutManager(this)
        lv_category_list.layoutManager= layoutManager
        lv_category_list.setHasFixedSize(true)
    }

}
