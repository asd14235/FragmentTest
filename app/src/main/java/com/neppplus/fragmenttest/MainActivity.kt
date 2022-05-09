package com.neppplus.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : fragmentTrainingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdapter = fragmentTrainingAdapter(supportFragmentManager)
        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues() {
        MainViewPager.adapter = mAdapter

    }
}