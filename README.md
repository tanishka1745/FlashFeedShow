NewsApp is an MVVM Jetpack Compose app built by android platform using kotlin as programming language.

fetches news from an API https://newsapi.org/ and cache the results
support searching news
support dividing news by categories


# Libararies and Technologies Used
Jetpack Compose for UI
Compose navigation
MVVM: Android architecture used to separate logic code from ui and save the application state in case the configuration changes.
Material3 Design
Retrofit + Gson Converter: Fetch news from rest api as a gson file and convert it to a kotlin object.
Coroutines: Executing some code in the background
Dagger hilt: Dependency injection
Coil: loading images with Jetpack Compose
