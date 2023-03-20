package com.example.seniorcafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.seniorcafe.databinding.FragmentMenuBinding
import com.google.gson.Gson

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
            add(Menu("♥ 찜한 클래스️/클럽"))
            add(Menu("\uD83D\uDD0D️ 최근 본 클래스️/클럽"))
            add(Menu("\uD83D\uDCDD 내 활동 기록"))
            add(Menu("\uD83D\uDEE0️ 클래스️/클럽 만들기"))
        }

        val menuRVAdapter = MenuRVAdapter(menuData)
        binding.menuListRv.adapter = menuRVAdapter
        binding.menuListRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        menuRVAdapter.setMyItemClickListener(object : MenuRVAdapter.MyItemClickListener{
            override fun onItemClick(menu: Menu) {
                (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, MenuDetailFragment().apply {
                    arguments = Bundle().apply {
                        val gson = Gson()
                        val menuJson = gson.toJson(menu)
                        putString("menu", menuJson)
                    }
                }).commitAllowingStateLoss()
            }

        })


        return binding.root
    }

}