package com.example.example_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var start: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        start = findViewById(R.id.start)

        start.setOnClickListener({
            var intent = Intent(this, GameActivity_01::class.java)
            startActivity(intent)
        })


    }


}