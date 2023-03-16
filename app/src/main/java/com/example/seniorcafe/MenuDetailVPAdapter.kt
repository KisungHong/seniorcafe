package com.example.seniorcafe

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MenuDetailVPAdapter(fragment:Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int =2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MenuLessonFragment()
            else -> MenuClubFragment()
        }
    }
}