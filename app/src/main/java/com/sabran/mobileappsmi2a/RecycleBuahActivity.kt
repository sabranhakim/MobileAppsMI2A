package com.sabran.mobileappsmi2a

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappsmi2a.adapter.BuahAdapter
import com.sabran.mobileappsmi2a.model.Mocklist
import com.sabran.mobileappsmi2a.model.ModelBuah

class RecycleBuahActivity : AppCompatActivity() {

    private lateinit var rv_buah: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah)
        rv_buah = findViewById(R.id.rv_buah)

        rv_buah.layoutManager = GridLayoutManager(this, 1)
        val adapter = BuahAdapter(Mocklist.getModel(this) as ArrayList<ModelBuah>, this)
        rv_buah.adapter = adapter

        //prepareDataBuah()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

//    private fun prepareDataBuah() {
//        val itemModel1 = ModelBuah(
//            R.drawable.apple,
//            "apple",
//            "Indonesia",
//            R.string.st_apel.toString()
//        )
//        val itemModel2 = ModelBuah(
//            R.drawable.grapes,
//            "Anggur",
//            "Nepal",
//            R.string.st_anggur.toString()
//        )
//        val itemModel3 = ModelBuah(
//            R.drawable.orange,
//            "Jeruk",
//            "Brazil",
//            R.string.st_jeruk.toString()
//        )
//        val itemModel4 = ModelBuah(
//            R.drawable.pear,
//            "Pear",
//            "Belanda",
//            R.string.st_pear.toString()
//        )
//        val itemModel5 = ModelBuah(
//            R.drawable.strawberry,
//            "Strawberry",
//            "Swedia",
//            R.string.st_strawberry.toString()
//        )
//        val itemModel6 = ModelBuah(
//            R.drawable.orange,
//            "Orange",
//            "Thailand",
//            R.string.st_jeruk.toString()
//        )
//    }
}