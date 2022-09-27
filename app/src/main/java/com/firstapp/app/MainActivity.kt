package com.firstapp.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private Button button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            override public void onClick(View v) {
                openMainActivity2();
            }
        });
    }

    public class openMainActivity2 {
        Intent intent = new Intent(this, MainActivity2.class)
                startActivity(intent);
    }
}