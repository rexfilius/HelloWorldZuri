package com.github.rexfilius.helloworldzuri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.buttonIncrement)
        val textView: TextView = findViewById(R.id.textView)

        var count = 0

        button.setOnClickListener {
            textView.text = count++.toString()
        }
    }

}