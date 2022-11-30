package com.example.fitnesskotlin.fragments.List

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewTreeLifecycleOwner
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitnesskotlin.R
import com.example.fitnesskotlin.data.ExViewModel
import com.example.fitnesskotlin.data.exerciseLog
import com.example.fitnesskotlin.databinding.FragmentLogListBinding

class LogList : Fragment() {

    private lateinit var mExViewModel : ExViewModel

    private var _binding: FragmentLogListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentLogListBinding.inflate(inflater, container, false)

//        val adapter = LogListAdapter()
//        val recyclerView = binding.LogListRecyclerview
//        recyclerView.adapter = adapter
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//
//
//        mExViewModel = ViewModelProvider(this).get(ExViewModel::class.java)
//        mExViewModel.readAllData.observe(viewLifecycleOwner, Observer { exerciseLog ->
//            adapter.setData(exerciseLog)
//        })
        binding.fabNote.setOnClickListener{
            findNavController().navigate(R.id.action_logList_to_logAdd)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}