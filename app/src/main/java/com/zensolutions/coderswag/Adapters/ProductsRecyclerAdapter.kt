package com.zensolutions.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.zensolutions.coderswag.Model.Product
import com.zensolutions.coderswag.R

class ProductsRecyclerAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsRecyclerAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsRecyclerAdapter.ProductHolder {
        val view= LayoutInflater.from(parent?.context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductsRecyclerAdapter.ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImg= itemView?.findViewById<ImageView>(R.id.iv_product_image_item)
        val productName= itemView?.findViewById<TextView>(R.id.tv_product_name_item)
        val productPrice= itemView?.findViewById<TextView>(R.id.tv_product_price_item)

        fun bindProduct(product: Product, contect: Context){
            val resourceId= context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImg?.setImageResource(resourceId)
            productName.text= product.title
            productPrice.text= product.price
        }
    }
}