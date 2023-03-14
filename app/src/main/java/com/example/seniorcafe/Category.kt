package com.example.seniorcafe

data class Category(
    var categoryTitle : String? = "",
    var categoryCoverImg : Int? = null,
)

data class CategorySearch(
    var searchBadge : String? = "", //item_search_classification_tv
    var searchCoverImg : Int? = null, //search_cover_img_iv
    var searchTitle : String? = "", //item_search_result_title_tv
    var searchMan : String? = "",//item_search_result_man_tv
)
