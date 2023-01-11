package com.example.generatorsreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class reportGeneratorActivity : AppCompatActivity() {

    private lateinit var bt_report_two: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_generator)


        bt_report_two= findViewById(R.id.bt_report_two)

        bt_report_two.setOnClickListener {


            val i = Intent(this, activity_report_generator_two::class.java)
            startActivity(i)
        }
    }
}