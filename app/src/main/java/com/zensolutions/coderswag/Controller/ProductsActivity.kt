package com.zensolutions.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.zensolutions.coderswag.Adapters.ProductsRecyclerAdapter
import com.zensolutions.coderswag.R
import com.zensolutions.coderswag.Services.DataService
import com.zensolutions.coderswag.Utils.EXTRA_CATERGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var mAdapter : ProductsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATERGORY)

        mAdapter= ProductsRecyclerAdapter(this, DataService.getProducts(categoryType))

        var spanCount= 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount= 4
        }

        val screenSize= resources.configuration.screenWidthDp
        if(screenSize>720){
            spanCount= 3
        }

        val layoutManager= GridLayoutManager(this, spanCount)
        lv_products_list.layoutManager= layoutManager
        lv_products_list.adapter= mAdapter
    }


}
