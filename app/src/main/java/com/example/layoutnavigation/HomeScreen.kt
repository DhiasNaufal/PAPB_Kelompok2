package com.example.layoutnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class HomeScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_screen,container, false)
        view.findViewById<Button>(R.id.btn_1).setOnClickListener{
            Navigation.findNavController(view).navigate((R.id.action_homeScreen_to_secondPage2))
        }
        // Inflate the layout for this fragment
        return view
    }
}