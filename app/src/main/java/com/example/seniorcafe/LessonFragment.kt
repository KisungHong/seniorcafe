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
    private var categoryData = ArrayList<Category>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(inflater,container,false)

        // 카테고리
        categoryData.apply {
            add(Category("아웃도어/여행",R.drawable.plane))
            add(Category("운동/스포츠",R.drawable.tennis))
            add(Category("인문학/책/글",R.drawable.book))
            add(Category("외국/언어",R.drawable.language))
            add(Category("문화/공연/축제",R.drawable.festival))
            add(Category("음악/악기",R.drawable.music))
            add(Category("공예/만들기",R.drawable.paint))
            add(Category("업종/직무",R.drawable.briefcase))
            add(Category("댄스/무용",R.drawable.dance))
            add(Category("봉사활동",R.drawable.volunteer))
            add(Category("사교/인맥",R.drawable.social_activity))
            add(Category("차/오토바이",R.drawable.car))
            add(Category("사진/영상",R.drawable.camera))
            add(Category("야구관람",R.drawable.baseball))
            add(Category("게임/오락",R.drawable.game))
            add(Category("요리/제조",R.drawable.cook))
            add(Category("반려동물",R.drawable.pets))
            add(Category("가족",R.drawable.family))
        }

        val categoryRVAdapter = CategoryRVAdapter(categoryData)
        binding.categoryRv.adapter = categoryRVAdapter
        binding.categoryRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)



        // 추천 클래스
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