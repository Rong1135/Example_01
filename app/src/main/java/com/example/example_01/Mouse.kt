package com.example.example_01

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect

class Mouse(context: Context) {

    // 設定屬性
    val res = context.resources
    var MouseX: Int = 1250
    var MouseY: Int = 140
    var w: Int
    var h: Int
    var image: Bitmap
    var SrcRect: Rect
    lateinit var DestRect: Rect

    var count: Int = 1

    // 設定初始變數值
    init {
        image = BitmapFactory.decodeResource(res, R.drawable.m1)
        w = image.width / 8
        h = image.height / 8
        MouseX -= w     //螢幕右邊飛出
        SrcRect = Rect(0, 0, image.width, image.height)
    }

    // 繪圖處理
    fun draw(canvas: Canvas) {
        DestRect = Rect(MouseX, MouseY, MouseX+w, MouseY+h)
        canvas.drawBitmap(image, SrcRect, DestRect, null)
    }

}