package org.tech.town.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(v: View){

    }

    fun clearButtonClicked(view: View) {}
    fun historyButtonClicked(view: View) {}
    fun resultButtonClicked(view: View) {}
}