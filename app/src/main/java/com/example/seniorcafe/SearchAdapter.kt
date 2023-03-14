package com.example.seniorcafe

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.ItemSearchBoxBinding

class SearchAdapter(private val searchList: ArrayList<CategorySearch>) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>(), Filterable {
    inner class ViewHolder(val binding : ItemSearchBoxBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(categorySearch: CategorySearch) {
            binding.itemSearchClassificationTv.text = categorySearch.searchBadge
            binding.searchCoverImgIv.setImageResource(categorySearch.searchCoverImg!!)
            binding.itemSearchResultTitleTv.text = categorySearch.searchTitle
            binding.itemSearchResultManTv.text = categorySearch.searchMan
        }
    }
    inner class ItemFilter : Filter() {
        override fun performFiltering(charSequence: CharSequence): FilterResults {
            val filterString = charSequence.toString()
            val results = FilterResults()


            //검색이 필요없을 경우를 위해 원본 배열을 복제
            val filteredList: ArrayList<CategorySearch> = ArrayList<CategorySearch>()
            //공백제외 아무런 값이 없을 경우 -> 원본 배열
            if (filterString.trim { it <= ' ' }.isEmpty()) {
                results.values = searchList
                results.count = searchList.size

                return results
                //공백제외 2글자 이인 경우 -> 이름으로만 검색
            } else if (filterString.trim { it <= ' ' }.length <= 2) {
                for (searchLists in searchList) {
                    if (searchLists.searchTitle!!.contains(filterString)) {
                        filteredList.add(searchLists)
                    }
                }
                //그 외의 경우(공백제외 2글자 초과) -> 이름/전화번호로 검색
            } else {
                for (searchLists in searchList) {
                    if (searchLists.searchTitle!!.contains(filterString) || searchLists.searchTitle!!.contains(filterString) || searchLists.searchBadge!!.contains(filterString)) {
                        filteredList.add(searchLists)
                    }
                }
            }
            results.values = filteredList
            results.count = filteredList.size

            return results
        }

        @SuppressLint("NotifyDataSetChanged")
        override fun publishResults(charSequence: CharSequence?, filterResults: FilterResults) {
            searchList.clear()
            searchList.addAll(filterResults.values as ArrayList<CategorySearch>)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding : ItemSearchBoxBinding = ItemSearchBoxBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = searchList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(searchList[position])
        holder.itemView.setOnClickListener {  }
    }

    override fun getFilter(): Filter {
       return ItemFilter()
    }

}