package com.example.example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameActivity_02 : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game02)

        btn = findViewById(R.id.btn)
        txv = findViewById(R.id.txv)

        btn.setOnClickListener({
            finish()
        })

    }
}