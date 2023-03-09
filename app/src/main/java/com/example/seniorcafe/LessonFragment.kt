package com.example.seniorcafe

import android.os.Bundle
import android.provider.MediaStore.Audio.Albums
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.seniorcafe.databinding.FragmentClubBinding
import com.example.seniorcafe.databinding.FragmentLessonBinding

class LessonFragment : Fragment() {

    lateinit var binding : FragmentLessonBinding
    private var lessonData = ArrayList<Lesson>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(inflater,container,false)

        lessonData.apply {
            add(Lesson("첫번째 레슨","첫번째 선생님",R.drawable.cook1))
            add(Lesson("첫번째 레슨","첫번째 선생님",R.drawable.cook1))
        }

        return binding.root
    }

}