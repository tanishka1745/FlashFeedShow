package com.example.flashfeedshow.UI

import android.os.Parcel
import android.os.Parcelable
import androidx.compose.runtime.Composable
import com.example.flashfeedshow.modal.Article


sealed class NewsScreenEvent {
    data class OnNewsCardClicked(var article: Article) : NewsScreenEvent()
    data class OnCategoryChanged(var category: String) : NewsScreenEvent()
    data class OnSearchQueryChanged(var searchQuery: String) : NewsScreenEvent()
    object OnSearchIconClicked: NewsScreenEvent()
    object OnCloseIconClicked: NewsScreenEvent()
}