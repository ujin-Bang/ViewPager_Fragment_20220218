package com.example.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {

        if(position == 0){
            return NameFragment()
        }
        else if(position ==1) {
            return BirthYearFragment()
        }
        else if(position ==2) {
            return HelloFragment()
        }
        else if(position ==3) {
            return  etc1Fragment()
        }
        else {
            return  etc2Fragment()
        }

    }
}