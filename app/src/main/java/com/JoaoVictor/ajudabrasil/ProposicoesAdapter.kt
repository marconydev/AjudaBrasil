package com.JoaoVictor.ajudabrasil

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ProposicoesAdapter(val list: List<Proposicao>, val context: Context): RecyclerView.Adapter<ProposicoesAdapter.ViewHolder>() {


    //componente generico do layout, "item_proposicao"
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val siglaTipo: TextView = itemView.findViewById(R.id.tv_sigla_tipo);
        val ementa: TextView = itemView.findViewById(R.id.ementa);
        val ano: TextView = itemView.findViewById(R.id.tv_ano);
        val detalhes :  Button = itemView.findViewById(R.id.btn_detalhes);


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflando o layout
        val view = LayoutInflater.from(context).inflate(R.layout.item_proposicao, parent, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int  = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val proposicao = list[position]
        holder.apply {
            siglaTipo.text = proposicao.siglaTipo
            ementa.text = proposicao.ementa
            ano.text = proposicao.ano.toString()
        }
    }
}