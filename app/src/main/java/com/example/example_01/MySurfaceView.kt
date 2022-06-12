package com.example.example_01

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceView

class MySurfaceView(context: Context?, attrs: AttributeSet?): SurfaceView(context, attrs), SurfaceHolder.Callback {

    lateinit var surfaceHolder: SurfaceHolder
    lateinit var BG: Bitmap

    /* 設定地鼠屬性 */
    lateinit var mouse1: Mouse
    lateinit var mouse2: Mouse
    lateinit var mouse3: Mouse
    lateinit var mouse4: Mouse
    lateinit var mouse5: Mouse
    lateinit var mouse6: Mouse
    lateinit var mouse7: Mouse
    lateinit var mouse8: Mouse
    lateinit var mouse9: Mouse
    lateinit var mouse10: Mouse

    /* 宣告觸控遊戲屬性 */
    lateinit var Player: Bitmap
    var PlayerX: Float = 0f
    var PlayerY: Float = 0f
    var Score: Int = 0  // 成績
    var Shooting: Int = 0   // 消失時間

    init {
        surfaceHolder = getHolder()
        BG = BitmapFactory.decodeResource(getResources(), R.drawable.ground)
        surfaceHolder.addCallback(this)

        /* 設定觸控遊戲初始值 */
        Player = BitmapFactory.decodeResource(getResources(), R.drawable.hammer)

        /* 設定地鼠初始值 */
        mouse1 = Mouse(context!!)
        mouse2 = Mouse(context!!)
        mouse2.MouseX = 1080
        mouse2.MouseY = 380
        mouse3 = Mouse(context!!)
        mouse3.MouseX = 900
        mouse3.MouseY = 280
        mouse4 = Mouse(context!!)
        mouse4.MouseX = 660
        mouse4.MouseY = 400
        mouse5 = Mouse(context!!)
        mouse5.MouseX = 660
        mouse5.MouseY = 120
        mouse6 = Mouse(context!!)
        mouse6.MouseX = 500
        mouse6.MouseY = 280
        mouse7 = Mouse(context!!)
        mouse7.MouseX = 360
        mouse7.MouseY = 140
        mouse8 = Mouse(context!!)
        mouse8.MouseX = 370
        mouse8.MouseY = 400
        mouse9 = Mouse(context!!)
        mouse9.MouseX = 40
        mouse9.MouseY = 140
        mouse10 = Mouse(context!!)
        mouse10.MouseX = 70
        mouse10.MouseY = 350
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

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }

    private fun drawSomething(canvas: Canvas) {
        var SrcRext: Rect = Rect(0, 0, BG.width, BG.height)
        var w: Int = BG.width / 3
        var h: Int = BG.height / 3
        var DestRect: Rect = Rect(0, 0, w, h)
        canvas.drawBitmap(BG, SrcRext, DestRect, null)

        mouse1.draw(canvas)
        mouse2.draw(canvas)
        mouse3.draw(canvas)
        mouse4.draw(canvas)
        mouse5.draw(canvas)
        mouse6.draw(canvas)
        mouse7.draw(canvas)
        mouse8.draw(canvas)
        mouse9.draw(canvas)
        mouse10.draw(canvas)
    }

}