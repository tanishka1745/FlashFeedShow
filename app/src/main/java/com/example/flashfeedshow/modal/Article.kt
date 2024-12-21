package com.example.flashfeedshow.modal

import android.graphics.ImageDecoder

data class Article(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: ImageDecoder.Source,
    val title: String,
    val url: String,
    val urlToImage: String
)