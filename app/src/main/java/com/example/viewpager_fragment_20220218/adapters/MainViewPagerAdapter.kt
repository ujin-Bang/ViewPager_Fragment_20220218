package com.example.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

       return when(position) {
           0 -> NameFragment()
           1 -> BirthYearFragment()
           else -> HelloFragment()
       }

    }
}