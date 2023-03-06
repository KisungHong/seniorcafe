package com.example.seniorcafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.seniorcafe.databinding.FragmentClubBinding


class ClubFragment : Fragment() {

    lateinit var binding : FragmentClubBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClubBinding.inflate(inflater,container,false)
        return binding.root
    }

}