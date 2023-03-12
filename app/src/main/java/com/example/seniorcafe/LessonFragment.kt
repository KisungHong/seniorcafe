package com.example.seniorcafe

import android.os.Bundle
import android.provider.MediaStore.Audio.Albums
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
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
            add(Lesson("골프가 처음이시라구요?","별내 임진한",R.drawable.golf1,"운동/스포츠"))
            add(Lesson("손주들이 찾는 맛집","의정부 백종원",R.drawable.cook1, "요리"))
            add(Lesson("자식 다 필요없다. 고양이가 최고다","인천 고영희",R.drawable.pets1, "펫"))
        }

        val lessonRVAdapter = LessonRVAdapter(lessonData)
        binding.todayLessonRv.adapter = lessonRVAdapter
        binding.todayLessonRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)


        return binding.root
    }

}