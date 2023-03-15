package com.example.seniorcafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.seniorcafe.databinding.FragmentClubBinding
import com.example.seniorcafe.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    lateinit var binding : FragmentMenuBinding
    private var menuData = ArrayList<Menu>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater,container,false)

        // TODO button clickListener (fragment replace)

        menuData.apply {
            add(Menu("♥ 찜한 클럽️/클래스"))
            add(Menu("\uD83D\uDD0D️ 최근 본 클럽/클래스"))
            add(Menu("\uD83D\uDCDD 내 활동 기록"))
            add(Menu("\uD83D\uDEE0️ 클럽/클래스 만들기"))
        }

        val menuRVAdapter = MenuRVAdapter(menuData)
        binding.menuListRv.adapter = menuRVAdapter
        binding.menuListRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        return binding.root
    }

}