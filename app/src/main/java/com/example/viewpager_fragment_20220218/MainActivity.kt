package com.example.viewpager_fragment_20220218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_fragment_20220218.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    fun setupEvents(){

    }
    fun setValues(){
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

//        재사용성 무시하도록 하는 코드예시(사용성 개선)
        mainViewPager.offscreenPageLimit = 5

    }
}