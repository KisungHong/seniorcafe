package com.example.seniorcafe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.ItemCategoryBinding

class CategoryRVAdapter(private val categoryList: ArrayList<Category>) :
    RecyclerView.Adapter<CategoryRVAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) {
            binding.categoryCoverImgIv.setImageResource(category.categoryCoverImg!!)
            binding.categoryTitle.text = category.categoryTitle
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding : ItemCategoryBinding = ItemCategoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryList[position])
        holder.itemView.setOnClickListener {  }
    }
}