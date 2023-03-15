package com.example.seniorcafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.seniorcafe.databinding.FragmentLessonBinding
import com.example.seniorcafe.databinding.FragmentViewCategoryBinding

class ViewCategoryFragment : Fragment() {

    lateinit var binding : FragmentViewCategoryBinding
    private var categoryData = ArrayList<Category>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewCategoryBinding.inflate(inflater,container,false)


        // TODO back button : escape this window
        binding.backButton.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, LessonFragment()).addToBackStack(null).commitAllowingStateLoss()
        }


        // 카테고리
        categoryData?.apply {
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
        }

        val viewCategoryRVAdapter = ViewCategoryRVAdapter(categoryData)
        binding.categoryRv.adapter = viewCategoryRVAdapter
        binding.categoryRv.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)



        return binding.root
    }

}