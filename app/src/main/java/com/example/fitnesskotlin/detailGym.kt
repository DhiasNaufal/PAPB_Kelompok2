package com.example.fitnesskotlin

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class detailGym: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            supportActionBar?.hide()
            setContentView(R.layout.details_workout)

    }
}