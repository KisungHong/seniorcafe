package com.example.seniorcafe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.ItemMenuListBinding

class MenuRVAdapter(private val menuList: ArrayList<Menu>) :
    RecyclerView.Adapter<MenuRVAdapter.ViewHolder>() {

    interface MyItemClickListener {
        fun onItemClick()
    }

    private lateinit var mItemClickListener : MyItemClickListener
    fun setMyItemClickListener(itemClickListener : MyItemClickListener) {
        mItemClickListener = itemClickListener
    }

    inner class ViewHolder(val binding: ItemMenuListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(menu: Menu) {
            binding.itemMenuTv.text = menu.menuTitle
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMenuListBinding =
            ItemMenuListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = menuList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(menuList[position])
        holder.itemView.setOnClickListener { mItemClickListener.onItemClick() }
    }
}