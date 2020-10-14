package com.example.novatelaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {
            val intent = Intent (this, NovaTela::class.java)

            intent.putExtra("NAME", "Giulia")

            startActivity(intent)
        }

        // Acessando a nova tela



        /*btnCliqueAqui.setOnClickListener {
            Toast.makeText(this, "Testando Toast", Toast.LENGTH_LONG).show()
        }*/
    }
}


// intent (chamar a variável e depois pegar na nova tela)