package com.example.layoutnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation

class SecondPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_page,container, false)

        view.findViewById<Button>(R.id.btn_2).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_secondPage_to_thirdPage2)
        }

        view.findViewById<ImageButton>(R.id.back_btn_1).setOnClickListener{
            Navigation.findNavController(view).navigate((R.id.action_secondPage_to_homeScreen))
        }

        return view
    }

}