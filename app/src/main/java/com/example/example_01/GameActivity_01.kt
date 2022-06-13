package com.example.example_01

import android.content.Intent
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class GameActivity_01 : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var job: Job
    lateinit var mySurfaceView: MySurfaceView   // 背景繪製

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game01)

        txv = findViewById(R.id.txv)
        mySurfaceView = findViewById(R.id.mysv)

        job = GlobalScope.launch(Dispatchers.Main) {
            for (i in 30 downTo 1) {
                txv.text = "剩餘時間： $i"  // update text
                delay(1000)

                val canvas: Canvas = mySurfaceView.holder.lockCanvas()
                    mySurfaceView.drawSomething(canvas)
                mySurfaceView.holder.unlockCanvasAndPost(canvas)
            }
            finish()
        }

    }
}