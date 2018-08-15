package com.zensolutions.coderswag.Services

import com.zensolutions.coderswag.Model.Category
import com.zensolutions.coderswag.Model.Product

object DataService {
    val catergories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product ("Devslope Graphic Beanie", "$18", "hat1"),
            Product("Devslope Hat Black", "$20", "hat2"),
            Product("Devslope Hat White", "$18", "hat3"),
            Product("Devslope Hat Snapback", "$22", "hat4")
    )

    val hoodies= listOf(
            Product ("Devslope Hoodie Gray", "$44", "hoodie1"),
            Product ("Devslope Hoodie Red", "$42", "hoodie2"),
            Product ("Devslope Gray Hoodie ", "$38", "hoodie3"),
            Product ("Devslope Black Hoodie", "$50", "hoodie4")
    )

    val shirts= listOf(
            Product("Devslope Shirt Black", "20", "shirt1"),
            Product("Devslope Badge Light Gray", "18", "shirt2"),
            Product("Devslope Logo Shirt Red ", "15", "shirt3"),
            Product("Devslope Hustle", "10", "shirt4"),
            Product("Kickflip studios", "22", "shirt5")
    )

    val digitalGood= listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}