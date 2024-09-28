package com.sabran.mobileappsmi2a.model

import android.content.Context
import com.sabran.mobileappsmi2a.R

data class ModelBuah(
    val gambar : Int,
    val nama : String,
    val lokasi : String,
    val deskripsi : String
)

object Mocklist {
    fun getModel(context: Context) : List<ModelBuah>{
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            "apple",
            "Indonesia",
            context.getString(R.string.st_apel)
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur",
            "Nepal",
            context.getString(R.string.st_anggur)
        )
        val itemModel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk",
            "Brazil",
            context.getString(R.string.st_jeruk)
        )
        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "Pear",
            "Belanda",
            context.getString(R.string.st_pear)
        )
        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            "Strawberry",
            "Swedia",
            context.getString(R.string.st_strawberry)
        )
        val itemModel6 = ModelBuah(
            R.drawable.orange,
            "Orange",
            "Thailand",
            context.getString(R.string.st_jeruk)
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
