package com.example.flashfeedshow.di

import android.annotation.SuppressLint
import com.example.flashfeedshow.Network.NewsApiService
import com.example.flashfeedshow.Repositories.NewsRepository
import com.example.flashfeedshow.Repositories.NewsRepositoryImpl
import com.example.flashfeedshow.Util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @SuppressLint("SuspiciousIndentation")
    @Provides
    @Singleton
    fun provideNewsApi(): NewsApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(NewsApiService::class.java)
    }


    @Provides
    @Singleton
    fun provideNewsRepository(newsApiService: NewsApiService): NewsRepository {
        return NewsRepositoryImpl(newsApiService)
    }
}