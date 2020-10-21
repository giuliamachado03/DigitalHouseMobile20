package com.example.recyclerviewwhatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val dataSet: List<Conversas>): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder (view: View): RecyclerView.ViewHolder(view) {
        private val nome: TextView = view.findViewById(R.id.txtNome)
        private val mensagem: TextView = view.findViewById(R.id.txtMensagem)
        private val hora: TextView = view.findViewById(R.id.txtHora)

        fun bind(conversa: Conversas) {
            nome.text = conversa.nome
            mensagem.text = conversa.mensagem
            hora.text = conversa.hora
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.modelo_conversa, parent, false)

        return MeuViewHolder(view)
    }

    override fun getItemCount() = dataSet.size


    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}