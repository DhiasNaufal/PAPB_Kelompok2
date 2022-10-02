package com.example.onboarding

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NextScreen : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextscreeen)
        Log.i("NextActivity","in method onCreate")
        Toast.makeText(applicationContext,"onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("NextActivity","in method onStart")
        Toast.makeText(applicationContext,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("NextActivity","in method onPause")
        Toast.makeText(applicationContext,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("NextActivity","in method onResume")
        Toast.makeText(applicationContext,"onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NextActivity","in method onDestroy")
        Toast.makeText(applicationContext,"onDestroy", Toast.LENGTH_SHORT).show()
    }
}