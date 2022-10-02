package com.example.layoutnavigation

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity","in method onCreate")
        Toast.makeText(applicationContext,"onCreate",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","in method onStart")
        Toast.makeText(applicationContext,"onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "in method onResume")
        Toast.makeText(applicationContext,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","in method onPause")
        Toast.makeText(applicationContext,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity","in method onDestroy")
        Toast.makeText(applicationContext,"onDestroy",Toast.LENGTH_SHORT).show()
    }

}