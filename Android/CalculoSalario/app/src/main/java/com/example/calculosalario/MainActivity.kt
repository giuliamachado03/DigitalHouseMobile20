package com.example.calculosalario

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun calcularSalario(horas: Double, valorHora: Double): Double {
            return horas * valorHora
        }

        btnCalcular.setOnClickListener {
            txtCalculo.text = "R$${
                calcularSalario(
                    edtxtHoras.text.toString().toDouble(),
                    edtxtValor.text.toString().toDouble()
                )
            }"
        }
    }
}