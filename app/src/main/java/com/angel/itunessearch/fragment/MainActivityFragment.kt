package com.angel.itunessearch.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angel.itunessearch.R

class MainActivityFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainActivityFragmentView.newInstance())
                .commitNow()
        }
    }
}