package com.sabran.mobileappsmi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnClick : Button
    private lateinit var btnNextPage : Button
    private lateinit var btnLatihan2 : Button
    private lateinit var btnKalkulatorSederhana : Button
    private lateinit var btnPassingData : Button
    private lateinit var btnListView : Button
    private lateinit var btnRecycleView : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClickHere)
        btnNextPage = findViewById(R.id.btnNextPage)
        btnLatihan2 = findViewById(R.id.btnLatihan2)
        btnKalkulatorSederhana = findViewById(R.id.btnKalkulatorSederhana)
        btnPassingData = findViewById(R.id.btnPassingData)
        btnListView = findViewById(R.id.btnListView)
        btnRecycleView = findViewById(R.id.btnRecycleView)

        // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
        // untuk widget yang dipakai, harus dideklarasi dahulu
        // kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnClick.setOnClickListener() {
            Toast.makeText(this, "Anda Menekan Tombol", Toast.LENGTH_SHORT).show()
        }

        btnNextPage.setOnClickListener() {
            // untuk pindah page : intent
            // intent ada 2, yaitu intent implicit dan intent explicit
            // intent implicit : intent yang dibuat sendiri dan yang berlaku didalam project
            // intent explicit : kita memanggil pihak ketiga / third party / library = gmaps, etc

            val intentMenu2 = Intent(this@MainActivity, PageKeduaActivity::class.java)
            startActivity(intentMenu2)
        }

        btnLatihan2.setOnClickListener() {
            val intentMenu3 = Intent(this@MainActivity, PageLatihan2Activity::class.java)
            startActivity(intentMenu3)
        }

        btnKalkulatorSederhana.setOnClickListener() {
            val intentMenu4 = Intent(this@MainActivity, KalkulatorSederhanaActivity::class.java)
            startActivity(intentMenu4)
        }

        btnPassingData.setOnClickListener() {
            val intentMenu5 = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intentMenu5)
        }
        btnListView.setOnClickListener() {
            val intentMenu5 = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intentMenu5)
        }
        btnRecycleView.setOnClickListener() {
            val intentMenu5 = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intentMenu5)
        }
    }
}