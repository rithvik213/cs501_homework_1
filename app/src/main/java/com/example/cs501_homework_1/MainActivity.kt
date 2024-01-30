package com.example.cs501_homework_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find button using its ID
        val helloButton: Button = findViewById(R.id.hello)

        //find textview using its ID
        val textView: TextView = findViewById(R.id.hellotext)

        //use the button's on click listener to set string
        helloButton.setOnClickListener {
            textView.text = getString(R.string.hello_button_text)
        }
    }
}