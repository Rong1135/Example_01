package com.example.example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class GameActivity_01 : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var job: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game01)

        txv = findViewById(R.id.txv)

        job = GlobalScope.launch(Dispatchers.Main) {
            for (i in 30 downTo 1) {
                txv.text = "剩餘時間： $i"  // update text
                delay(1000)
            }
            txv.text = "時間到!"
        }

    }
}