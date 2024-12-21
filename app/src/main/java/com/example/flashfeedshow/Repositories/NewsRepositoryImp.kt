package com.example.flashfeedshow.Repositories

import com.example.flashfeedshow.Network.NewsApiService
import com.example.flashfeedshow.Util.Resource
import com.example.flashfeedshow.modal.Article

class NewsRepositoryImpl(
    private val newsApiService: NewsApiService
) : NewsRepository {
    override suspend fun getTopHeadlines(category: String): Resource<List<Article>> {
        return try {
            val response = newsApiService.getBreakingNews(category = category)
            Resource.Success(data = response.articles)
        } catch (e: Exception) {
            Resource.Error("Failed to fetch News ${e.message}")
        }
    }

    override suspend fun searchForNews(query: String): Resource<List<Article>> {
        return try {
            val response = newsApiService.searchForNews(query = query)
            Resource.Success(data = response.articles)
        } catch (e: Exception) {
            Resource.Error("Failed to fetch News ${e.message}")
        }
    }

}