package com.example.recyclerviewwhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conversa1 = Conversas("Giulia", "Consegui!", "21:15")
        val conversa2 = Conversas("Gabi", "Tudo bem?", "20:17")
        val conversa3 = Conversas("Heitor", "Opa!", "17:56")

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.listaConversas)
        val viewAdapter: MeuAdapter = MeuAdapter(arrayListOf(conversa1,conversa2,conversa3))


        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter


            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}