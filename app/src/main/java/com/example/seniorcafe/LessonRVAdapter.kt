package com.example.seniorcafe

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.seniorcafe.databinding.FragmentMenuBinding
import com.example.seniorcafe.databinding.ItemTodayLessonBinding

class LessonRVAdapter(private val lessonList : ArrayList<Lesson>) : RecyclerView.Adapter<LessonRVAdapter.ViewHolder>() {

    interface LessonRVClickListener {
        fun onItemClick(lesson: Lesson)
    }

    private lateinit var lItemClickListener : LessonRVClickListener
    fun setLessonRVClickListener(itemClickListener : LessonRVClickListener) {
        lItemClickListener = itemClickListener
    }
    inner class ViewHolder(val binding: ItemTodayLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(lesson: Lesson) {
            binding.itemLessonTitleTv.text = lesson.lessonTitle
            binding.itemLessonTeacherTv.text = lesson.teacher
            binding.itemLessonCoverImgIv.setImageResource(lesson.lessonCoverImg!!)
            binding.itemLessonBadgeTitleTv.text = lesson.lessonBadge
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding : ItemTodayLessonBinding = ItemTodayLessonBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = lessonList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lessonList[position])
        holder.itemView.setOnClickListener{ lItemClickListener.onItemClick(lessonList[position])}
    }
}