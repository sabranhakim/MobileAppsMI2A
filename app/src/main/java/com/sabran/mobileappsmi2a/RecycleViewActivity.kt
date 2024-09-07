package com.sabran.mobileappsmi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappsmi2a.adapter.BukuAdapter
import com.sabran.mobileappsmi2a.model.ModelBuku

class RecycleViewActivity : AppCompatActivity() {

    private lateinit var rv_data : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rv_data = findViewById(R.id.rv_data)

        val listBuku = listOf(
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "UdaCoding"),
            ModelBuku(judul = "Buku Android Kotlin2 2024", penerbit = "Riski Syahputra"),
            ModelBuku(judul = "Buku Android Kotlin3 2024", penerbit = "UdaCoding"),
            ModelBuku(judul = "Buku Android Kotlin4 2024", penerbit = "Riski Syahputra"),
            ModelBuku(judul = "Buku Android Kotlin5 2024", penerbit = "UdaCoding"),
        )

        val nBukuAdapter = BukuAdapter(listBuku)
        rv_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}