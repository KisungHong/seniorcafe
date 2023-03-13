package com.example.seniorcafe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.ItemOtherLessonBinding

class OtherLessonRvAdapter(private val otherLessonList: ArrayList<OtherLesson>) : RecyclerView.Adapter<OtherLessonRvAdapter.ViewHolder>() {
    inner class ViewHolder(val binding : ItemOtherLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(otherLesson: OtherLesson) {
            binding.itemOtherLessonTitleTv.text = otherLesson.OtherLessonTitle
            binding.itemOtherLessonTeacherTv.text = otherLesson.OtherLessonTeacher
            binding.itemOtherLessonCoverImgIv.setImageResource(otherLesson.OtherLessonCoverImg!!)
            binding.itemOtherLessonBadgeTitleTv.text = otherLesson.OtherLessonBadge
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding : ItemOtherLessonBinding = ItemOtherLessonBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = otherLessonList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(otherLessonList[position])
        holder.itemView.setOnClickListener {  }
    }
}