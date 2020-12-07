package com.example.revisaodesafio3.listagem.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.revisaodesafio3.R

class ListaAdapter(
    private val dataSet: List<String>,
    private val listener: (String) -> Unit
) : RecyclerView.Adapter<ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_lista_item, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val item = dataSet[position]

        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }


    override fun getItemCount() = dataSet.size

}