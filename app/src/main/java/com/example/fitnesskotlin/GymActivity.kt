package com.example.fitnesskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class GymActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_gym)


        val LogButton = findViewById<ImageView>(R.id.Log_button)

        LogButton.setOnClickListener{
            val Intent = Intent(this, LogActivity::class.java)
            startActivity(Intent)
        }


        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter




    }


    private fun init(){

        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<GymData>()
        data.add(GymData(R.drawable.pushups,"Push Up","20 Reps","3 Sets"))
        data.add(GymData(R.drawable.skipping,"Skipping","40 Reps","2 Sets"))
        data.add(GymData(R.drawable.squat,"Squat","20 Reps","4 Sets"))
        data.add(GymData(R.drawable.pushups,"Push Up","20 Reps","3 Sets"))
        data.add(GymData(R.drawable.skipping,"Skipping","40 Reps","2 Sets"))
        data.add(GymData(R.drawable.squat,"Squat","20 Reps","4 Sets"))
        data.add(GymData(R.drawable.pushups,"Push Up","20 Reps","3 Sets"))
        data.add(GymData(R.drawable.skipping,"Skipping","40 Reps","2 Sets"))
        data.add(GymData(R.drawable.squat,"Squat","20 Reps","4 Sets"))


        adapter = MyAdapter(data)
    }
}