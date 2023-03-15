package com.example.seniorcafe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {

    lateinit var binding: FragmentSearchBinding
//    lateinit var searchView: SearchView
    private lateinit var searchData: ArrayList<CategorySearch>
//    lateinit var searchResultData: ArrayList<CategorySearch>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

//        searchData.apply {
//            add(CategorySearch("운동/스포츠", R.drawable.soccer1, "골 때리는 할미들", "마포 메날두"))
//            add(CategorySearch("운동/스포츠", R.drawable.golf2, "슬라이스,훅 고쳐드립니다", "짭국진"))
//            add(CategorySearch("요리/제조", R.drawable.cook2, "손주들 입맛 사로잡는 양식", "강서 고든램지"))
//            add(CategorySearch("운동/스포츠", R.drawable.soccer2, "시니어프리미어리그(SPL)", "부천 손흥민"))
//            add(CategorySearch("펫", R.drawable.pets2, "우리집 강아지 길들이기", "안산 강형욱"))
//            add(CategorySearch("운동/스포츠", R.drawable.golf3, "라운딩에 필요한 공은 단 한개", "골프로"))
//            add(CategorySearch("사진/영상", R.drawable.senior1, "인물사진 촬영 레슨", "사진애호가"))
//            add(CategorySearch("요리/제조", R.drawable.cook3, "간단하게 만드는 한끼 식사", "요리왕 비룡"))
//            add(CategorySearch("사진/영상", R.drawable.senior2, "사진은 역시 흑백사진", "블랙잭"))
//            add(CategorySearch("운동/스포츠", R.drawable.soccer3, "축구 전술의 모든것", "용인 퍼거슨"))
//            add(CategorySearch("펫", R.drawable.pets3, "인생의 동반자, 우리집 강아지 건강챙기기"))
//            add(CategorySearch("사진/영상", R.drawable.senior3, "흑백사진 맛집", "김창욱"))
//        }

//        val searchAdapter = SearchAdapter(searchData)
//        binding.searchResultRv.adapter = searchAdapter
//        binding.searchResultRv.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        return binding.root
    }
}


//        val searchAdapter = SearchAdapter(searchData)
//        binding.searchResultRv.adapter = searchAdapter
//        binding.searchResultRv.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//
//
//        searchData = tempSearch()
//        getSearchResultList()
//
//        val searchViewTextListener: SearchView.OnQueryTextListener =
//            object : SearchView.OnQueryTextListener {
//                override fun onQueryTextSubmit(query: String?): Boolean {
//                    return false
//                }
//
//                override fun onQueryTextChange(s: String?): Boolean {
//                    searchAdapter.filter.filter(s)
//                    return false
//
//                }
//
//            }
//        searchView = binding.searchView.findViewById(R.id.searchView)
//        searchView.setOnClickListener {
//
//            searchView.isIconified = false
//
//
//        }
//        searchView.setOnQueryTextListener(searchViewTextListener)
//
//
//        return binding.root
//    }
//
//
//    private fun tempSearch(): ArrayList<CategorySearch> {
//        var tempSearch = searchData.apply {
//            add(CategorySearch("운동/스포츠", R.drawable.soccer1, "골 때리는 할미들", "마포 메날두"))
//            add(CategorySearch("운동/스포츠", R.drawable.golf2, "슬라이스,훅 고쳐드립니다", "짭국진"))
//            add(CategorySearch("요리/제조", R.drawable.cook2, "손주들 입맛 사로잡는 양식", "강서 고든램지"))
//            add(CategorySearch("운동/스포츠", R.drawable.soccer2, "시니어프리미어리그(SPL)", "부천 손흥민"))
//            add(CategorySearch("펫", R.drawable.pets2, "우리집 강아지 길들이기", "안산 강형욱"))
//            add(CategorySearch("운동/스포츠", R.drawable.golf3, "라운딩에 필요한 공은 단 한개", "골프로"))
//            add(CategorySearch("사진/영상", R.drawable.senior1, "인물사진 촬영 레슨", "사진애호가"))
//            add(CategorySearch("요리/제조", R.drawable.cook3, "간단하게 만드는 한끼 식사", "요리왕 비룡"))
//            add(CategorySearch("사진/영상", R.drawable.senior2, "사진은 역시 흑백사진", "블랙잭"))
//            add(CategorySearch("운동/스포츠", R.drawable.soccer3, "축구 전술의 모든것", "용인 퍼거슨"))
//            add(CategorySearch("펫", R.drawable.pets3, "인생의 동반자, 우리집 강아지 건강챙기기"))
//            add(CategorySearch("사진/영상", R.drawable.senior3, "흑백사진 맛집", "김창욱"))
//
//        }
//        return tempSearch
//    }
//
//    private fun getSearchResultList() {
//        searchResultData = arrayListOf()
//    }
//
//
//    }


