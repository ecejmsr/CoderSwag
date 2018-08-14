package com.zensolutions.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zensolutions.coderswag.Model.Categroy
import com.zensolutions.coderswag.R
import com.zensolutions.coderswag.Services.DataService.catergories

class CategoryAdapter(context: Context, categories: List<Categroy>) : BaseAdapter()
{
    val context= context
    val categories= categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val catergoryView: View

        catergoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = catergoryView.findViewById(R.id.iv_catergories)
        val catergoryName: TextView = catergoryView.findViewById(R.id.tv_category_name)

        val category = catergories[position]

        val resourceId= context.resources.getIdentifier(category.img, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        catergoryName.text= category.title

        return catergoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}