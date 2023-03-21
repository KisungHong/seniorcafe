package com.example.seniorcafe

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Audio.Albums
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.seniorcafe.databinding.FragmentClubBinding
import com.example.seniorcafe.databinding.FragmentLessonBinding
import com.google.gson.Gson

class LessonFragment : Fragment() {

    lateinit var binding : FragmentLessonBinding
    private var lessonData = ArrayList<Lesson>()
    private var categoryData = ArrayList<Category>()
    private var otherLessonData = ArrayList<OtherLesson>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(inflater,container,false)


        // Toolbar clickListener(fragment replace)
        binding.icCategory.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, ViewCategoryFragment()).commitAllowingStateLoss()
        }
        binding.icSearch.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, SearchFragment()).commitAllowingStateLoss()
        }

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

        lessonRVAdapter.setLessonRVClickListener(object : LessonRVAdapter.LessonRVClickListener{
            override fun onItemClick(lesson: Lesson) {
                (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, PostItFragment().apply {
                    arguments = Bundle().apply {
                        val gson = Gson()
                        val lessonJson = gson.toJson(lesson)
                        putString("lesson", lessonJson)

                    }
                }).commitAllowingStateLoss()
            }

        })

        // 그 외 클래스
        otherLessonData.apply {
            add(OtherLesson("골 때리는 할미들","마포 메날두",R.drawable.soccer1, "운동/스포츠"))
            add(OtherLesson("슬라이스,훅 고쳐드립니다","짭국진",R.drawable.golf2,"운동/스포츠"))
            add(OtherLesson("손주들 입맛 사로잡는 양식","강서 고든램지",R.drawable.cook2, "요리/제조"))
            add(OtherLesson("시니어프리미어리그(SPL)","부천 손흥민",R.drawable.soccer2, "운동/스포츠"))
            add(OtherLesson("우리집 강아지 길들이기","안산 강형욱",R.drawable.pets2, "펫"))
            add(OtherLesson("라운딩에 필요한 공은 단 한개","골프로",R.drawable.golf3, "운동/스포츠"))
            add(OtherLesson("인물사진 촬영 레슨","사진애호가",R.drawable.senior1, "사진/영상"))
            add(OtherLesson("간단하게 만드는 한끼 식사","요리왕 비룡",R.drawable.cook3, "요리/제조"))
            add(OtherLesson("사진은 역시 흑백사진","블랙잭",R.drawable.senior2, "사진/영상"))
            add(OtherLesson("축구 전술의 모든것","용인 퍼거슨",R.drawable.soccer3, "운동/스포츠"))
            add(OtherLesson("인생의 동반자, 우리집 강아지 건강챙기기","Dnang Pirell",R.drawable.pets3, "펫"))
            add(OtherLesson("흑백사진 맛집","김창욱",R.drawable.senior3, "사진/영상"))


        }

        val otherLessonRvAdapter = OtherLessonRvAdapter(otherLessonData)
        binding.otherLessonRv.adapter = otherLessonRvAdapter


        return binding.root
    }

}