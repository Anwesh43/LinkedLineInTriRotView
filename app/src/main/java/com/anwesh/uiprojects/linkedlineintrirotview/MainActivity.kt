package com.anwesh.uiprojects.linkedlineintrirotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.lineintrirotview.LineInTriRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineInTriRotView.create(this)
    }
}
