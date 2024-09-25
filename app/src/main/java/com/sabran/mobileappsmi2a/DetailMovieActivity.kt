package com.sabran.mobileappsmi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var txtDetailMovie : TextView
    private lateinit var imgDetailMovie : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imgDetailMovie = findViewById(R.id.imgDetailMovie)

        //get data dari intent
        val detailTeks = intent.getStringExtra("nama")
        val detailImg = intent.getIntExtra("gambar", 0)

        //set data ke widget
        txtDetailMovie.setText(detailTeks)
        imgDetailMovie.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}