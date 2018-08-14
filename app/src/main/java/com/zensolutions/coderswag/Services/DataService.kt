package com.zensolutions.coderswag.Services

import com.zensolutions.coderswag.Model.Categroy
import com.zensolutions.coderswag.Model.Product

object DataService {
    val catergories = listOf(
            Categroy("SHIRTS", "shirtimage"),
            Categroy("HOODIES", "hoodieimage"),
            Categroy("HATS", "hatimage"),
            Categroy("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product ("Devslope Graphic Beanie", "$18", "hat01"),
            Product("Devslope Hat Black", "$20", "hat02"),
            Product("Devslope Hat White", "$18", "hat03"),
            Product("Devslope Hat Snapback", "$22", "hat04")
    )

    val hoodies= listOf(
            Product ("Devslope Hoodie Gray", "$44", "hoodie01"),
            Product ("Devslope Hoodie Red", "$42", "hoodie02"),
            Product ("Devslope Gray Hoodie ", "$38", "hoodie03"),
            Product ("Devslope Black Hoodie", "$50", "hoodie04")
    )

    val shirts= listOf(
            Product("Devslope Shirt Black", "20", "shirt01"),
            Product("Devslope Badge Light Gray", "18", "shirt02"),
            Product("Devslope Logo Shirt Red ", "15", "shirt03"),
            Product("Devslope Hustle", "10", "shirt04"),
            Product("Kickflip studios", "22", "shirt05")
    )
}