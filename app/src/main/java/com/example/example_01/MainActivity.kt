package com.example.example_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var start: ImageView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        start = findViewById(R.id.start)
        btn = findViewById(R.id.btn)

        start.setOnClickListener({
            var intent1 = Intent(this, GameActivity_01::class.java)
            startActivity(intent1)
        })

        btn.setOnClickListener({
            var intent2 = Intent(this, GameActivity_02::class.java)
            startActivity(intent2)
        })

    }

}