package com.example.flashfeedshow.modal

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)