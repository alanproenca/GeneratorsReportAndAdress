package com.example.generatorsreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    private lateinit var btnReport: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnReport = findViewById(R.id.icReport)

        btnReport.setOnClickListener {

          val i = Intent(this, reportGeneratorActivity::class.java )
          startActivity(i)
        }

    }
}