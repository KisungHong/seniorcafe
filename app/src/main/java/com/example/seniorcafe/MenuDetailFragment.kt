package com.example.seniorcafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.seniorcafe.databinding.FragmentMenuDetailBinding
import com.google.android.material.tabs.TabLayoutMediator

class MenuDetailFragment : Fragment() {
    lateinit var binding : FragmentMenuDetailBinding

    private val information = arrayListOf("클래스", "클럽")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuDetailBinding.inflate(inflater, container, false)

        binding.backButton.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MenuFragment()).commitAllowingStateLoss()
        }

        val menuDetailAdapter = MenuDetailVPAdapter(this)
        binding.detailPageVp.adapter = menuDetailAdapter
        TabLayoutMediator(binding.detailPageTb, binding.detailPageVp){
            tab, position -> tab.text = information[position]
        }.attach()

        return binding.root
    }
}