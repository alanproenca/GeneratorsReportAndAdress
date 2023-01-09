package com.example.generatorsreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private lateinit var bt_report_two: Bottom
class reportGeneratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_generator)

        bt_report_two.setOnClichListner {

            ToSecondView()

        }

    }

    private fun ToSecondView(){

        val bt_report_two = Intent(this,activity_report_generator_two::class.java)
        startActivity(activity_report_generator_two)
    }
}