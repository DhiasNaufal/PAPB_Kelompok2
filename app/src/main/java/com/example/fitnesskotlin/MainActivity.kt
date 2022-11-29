package com.example.fitnesskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val StartButton = findViewById<Button>(R.id.button)

        StartButton.setOnClickListener{
            val Intent = Intent(this, GymActivity::class.java)
            startActivity(Intent)
        }



    }
}