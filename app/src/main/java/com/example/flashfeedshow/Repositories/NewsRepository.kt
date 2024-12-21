package com.example.flashfeedshow.Repositories

import com.example.flashfeedshow.Util.Resource
import com.example.flashfeedshow.modal.Article

interface NewsRepository {
    suspend fun getTopHeadlines(
        category: String
    ): Resource<List<Article>>

    suspend fun searchForNews(
        query: String
    ): Resource<List<Article>>
}