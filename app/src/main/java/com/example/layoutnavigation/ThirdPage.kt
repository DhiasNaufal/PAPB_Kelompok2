package com.example.layoutnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation

class ThirdPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third_page,container, false)

        view.findViewById<ImageButton>(R.id.back_btn_3).setOnClickListener{
            Navigation.findNavController(view).navigate((R.id.action_thirdPage_to_secondPage))
        }
        return view
    }
}