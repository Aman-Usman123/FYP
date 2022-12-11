package com.example.bidapp

import android.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment=FirstFragments()
        val fm:androidx.fragment.app.FragmentManager=supportFragmentManager
        fm.beginTransaction().add(R.id.mainlayout,firstFragment).commit()

    }
}