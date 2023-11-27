package com.example.circledrawing1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int =2



    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> InputFragment()
            1 -> CircleFragment()
            else -> InputFragment()
        }
    }
}