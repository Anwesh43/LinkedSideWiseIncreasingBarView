package com.anwesh.uiprojects.linkedincreasingbarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.sidewiseincreasingbarview.SideWiseIncreasingBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SideWiseIncreasingBarView.create(this)
    }
}
