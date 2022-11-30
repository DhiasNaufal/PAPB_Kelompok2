package com.example.fitnesskotlin.fragments.List

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskotlin.MyAdapter
import com.example.fitnesskotlin.R
import com.example.fitnesskotlin.data.exerciseLog
import com.example.fitnesskotlin.databinding.LogTemplateBinding
import com.google.android.material.datepicker.SingleDateSelector


class LogListAdapter(var exerciseLog: List<exerciseLog>) :RecyclerView.Adapter<LogListAdapter.MyViewHolder>() {
    private lateinit var binding: LogTemplateBinding

    private var exList = emptyList<exerciseLog>()

    inner class MyViewHolder(val binding: LogTemplateBinding):RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = LogTemplateBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return exList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exList[position]
        binding.NumberView.text = currentItem.id.toString()
        binding.NameView.text = currentItem.exName
        binding.RepLog.text = currentItem.exReps.toString()
        binding.SetsLog.text = currentItem.exSets.toString()

    }

    fun setData(exerciseLog: List<exerciseLog>){
        this.exList = exerciseLog
        notifyDataSetChanged()
    }
}