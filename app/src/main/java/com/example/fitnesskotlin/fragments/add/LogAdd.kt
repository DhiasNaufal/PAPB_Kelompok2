package com.example.fitnesskotlin.fragments.add

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.fitnesskotlin.R
import com.example.fitnesskotlin.data.ExViewModel
import com.example.fitnesskotlin.data.exerciseLog
import com.example.fitnesskotlin.databinding.FragmentLogAddBinding

class LogAdd : Fragment() {
    private var _binding: FragmentLogAddBinding? = null
    private val binding get() = _binding!!

    private lateinit var mExViewModel: ExViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLogAddBinding.inflate(inflater, container, false)

        mExViewModel = ViewModelProvider(this).get(ExViewModel::class.java)

        binding.AddButton.setOnClickListener{
            insertDataToDatabase()
        }
        return binding.root
    }

    private fun insertDataToDatabase() {
        val exName = binding.ExName.text.toString()
        val exReps = binding.RepsBox.text
        val exSets = binding.SetsBox.text

        if(inputCheck(exName, exReps, exSets)){
            val exerciseLog = exerciseLog(0 ,exName, Integer.parseInt(exReps.toString()),Integer.parseInt(exSets.toString()))
            mExViewModel.addExercise(exerciseLog)
            Toast.makeText(requireContext(),"Added",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_logAdd_to_logList)
        }else{
            Toast.makeText(requireContext(),"Fill out All fields",Toast.LENGTH_LONG).show()
        }

    }

    private fun inputCheck(exName:String, exReps:Editable, exSets:Editable):Boolean{
        return !(TextUtils.isEmpty(exName)&&exReps.isEmpty()&&exSets.isEmpty())
    }
}