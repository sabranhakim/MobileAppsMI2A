package com.sabran.mobileappsmi2a.model

import com.sabran.mobileappsmi2a.R

data class ModelMovie(
    val gambar : Int,
    val nama : String
)
    object Movielist {
        fun getModel(): List<ModelMovie> {
            val itemModel1 = ModelMovie(
                R.drawable.avatar,
                "Avatar"
            )
            val itemModel2 = ModelMovie(
                R.drawable.batman,
                "Batman"
            )
            val itemModel3 = ModelMovie(
                R.drawable.end_game,
                "End Game"
            )
            val itemModel4 = ModelMovie(
                R.drawable.hulk,
                "Hulk"
            )
            val itemModel5 = ModelMovie(
                R.drawable.inception,
                "Inception"
            )
            val itemModel6 = ModelMovie(
                R.drawable.jumanji,
                "Jumanji"
            )
            val itemModel7 = ModelMovie(
                R.drawable.jurassic_world,
                "Jurassic World"
            )
            val itemModel8 = ModelMovie(
                R.drawable.lucy,
                "Lucy"
            )
            val itemModel9 = ModelMovie(
                R.drawable.spider_man,
                "Spider Man"
            )
            val itemModel10 = ModelMovie(
                R.drawable.venom,
                "Venom"
            )

            val itemList: ArrayList<ModelMovie> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)
            itemList.add(itemModel4)
            itemList.add(itemModel5)
            itemList.add(itemModel6)
            itemList.add(itemModel7)
            itemList.add(itemModel8)
            itemList.add(itemModel9)
            itemList.add(itemModel10)

            return itemList
        }
    }