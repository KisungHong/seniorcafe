package com.example.seniorcafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.seniorcafe.databinding.FragmentPostItBinding

class PostItFragment : Fragment() {
    lateinit var binding : FragmentPostItBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostItBinding.inflate(inflater, container,false)
        binding.backButton.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, LessonFragment()).addToBackStack(null).commitAllowingStateLoss()
        }
        return binding.root
    }
}