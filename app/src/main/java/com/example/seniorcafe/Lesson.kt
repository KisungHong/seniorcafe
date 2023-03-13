package com.example.seniorcafe

data class Lesson(
    var lessonTitle : String? = "",
    var teacher : String? = "",
    var lessonCoverImg : Int? = null,
    var lessonBadge : String? = ""
)

data class OtherLesson(
    var OtherLessonTitle : String? = "",
    var OtherLessonTeacher : String? = "",
    var OtherLessonCoverImg : Int? = null,
    var OtherLessonBadge : String? = ""
)
