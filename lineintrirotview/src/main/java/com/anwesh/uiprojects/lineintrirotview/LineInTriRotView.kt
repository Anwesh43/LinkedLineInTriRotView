package com.anwesh.uiprojects.lineintrirotview

/**
 * Created by anweshmishra on 29/11/18.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Path
import android.app.Activity
import android.content.Context

val nodes : Int = 5
val lines : Int = 4
val scGap : Float = 0.05f
val scDiv : Double = 0.51
val color : Int = Color.parseColor("#283593")
val strokeFactor : Int = 90
val sizeFactor : Int = 3

class LineInTriRotView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}