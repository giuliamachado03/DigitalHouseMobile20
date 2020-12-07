package com.example.revisaodesafio3.listagem.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.revisaodesafio3.R
import kotlinx.android.synthetic.main.fragment_lista.view.*

class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val mensagem = view.findViewById<TextView>(R.id.txtMensagem)

    fun bind(categoria: String){

        mensagem.text = categoria.capitalize()
    }

}
