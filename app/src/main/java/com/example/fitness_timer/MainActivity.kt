package com.example.fitness_timer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        btnGetStartedListener()
    }

    private fun btnGetStartedListener(){
        button_start.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }


}