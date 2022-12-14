package com.example.fitnesskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimerActivity(private var btnDone: Button) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        btnDone.setOnClickListener() {
            intent = Intent(this, FinishActivity::class.java)
            startActivity(intent)
        }
    }
}