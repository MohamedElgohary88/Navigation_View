package com.example.navigation_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Navigation View"

        val actionToogle = ActionBarDrawerToggle(
            this,
            drawer_layout,
        R.string.draw_open,
        R.string.draw_close)

        drawer_layout.addDrawerListener(actionToogle)
        actionToogle.syncState()

    }
}