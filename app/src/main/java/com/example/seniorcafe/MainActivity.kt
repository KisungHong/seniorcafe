package com.example.seniorcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.seniorcafe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Seniorcafe)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.mainBnv.itemIconTintList = null
//
//        val navController = supportFragmentManager.findFragmentById(R.id.main_frm)?.findNavController()
//        navController?.let {
//            binding.mainBnv.setupWithNavController(it)
//        }


        initBottomNavigation()
    }


    private fun initBottomNavigation() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, LessonFragment())
            .commitAllowingStateLoss()

        binding.mainBnv.setOnItemSelectedListener{ item ->
            when (item.itemId) {

                R.id.lessonFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, LessonFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.clubFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ClubFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.menuFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MenuFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false}
    }
}