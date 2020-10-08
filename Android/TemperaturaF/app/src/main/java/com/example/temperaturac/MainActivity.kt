package com.example.temperaturac

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun converterF(temperaturaC: Double): Double {
            return (temperaturaC * 9 / 5) + 32
        }

        btnConverter.setOnClickListener {
            txtRetorno.text = "${converterF(edtxtDigiteTemperatura.text.toString().toDouble())}°F"}
        }
    }

