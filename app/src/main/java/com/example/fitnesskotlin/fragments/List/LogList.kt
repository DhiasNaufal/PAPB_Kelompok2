package com.example.fitnesskotlin.fragments.List

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitnesskotlin.R
import com.example.fitnesskotlin.databinding.FragmentLogListBinding

class LogList : Fragment() {

    private var _binding: FragmentLogListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentLogListBinding.inflate(inflater, container, false)

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