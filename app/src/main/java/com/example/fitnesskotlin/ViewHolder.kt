package com.example.fitnesskotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycle_view_template, parent, false)) {
    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtRep: TextView? = null
    private var txtSet: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.image_view)
        txtTitle = itemView.findViewById(R.id.Title_view)
        txtRep= itemView.findViewById(R.id.Rep_view)
        txtSet = itemView.findViewById(R.id.Set_view)
    }

    fun bind(data: GymData){
        imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtRep?.text = data.txtRep
        txtSet?.text = data.txtSet

    }

}