package com.example.example_01

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.SurfaceView

class MySurfaceView(context: Context?, attrs: AttributeSet?): SurfaceView(context, attrs), SurfaceHolder.Callback {

    lateinit var surfaceHolder: SurfaceHolder
    lateinit var BG: Bitmap

    init {
        surfaceHolder = getHolder()
        BG = BitmapFactory.decodeResource(getResources(), R.drawable.ground)
        surfaceHolder.addCallback(this)
    }

    override fun surfaceCreated(p0: SurfaceHolder) {
        var canvas: Canvas = surfaceHolder.lockCanvas()
            drawSomething(canvas)
        surfaceHolder.unlockCanvasAndPost(canvas)
    }

    override fun surfaceChanged(p0: SurfaceHolder, p1: Int, p2: Int, p3: Int) {

    }

    override fun surfaceDestroyed(p0: SurfaceHolder) {

    }

    private fun drawSomething(canvas: Canvas) {
        var SrcRext: Rect = Rect(0, 0, BG.width, BG.height)
        var w: Int = BG.width / 3
        var h: Int = BG.height / 3
        var DestRect: Rect = Rect(0, 0, w, h)
        canvas.drawBitmap(BG, SrcRext, DestRect, null)
    }

}