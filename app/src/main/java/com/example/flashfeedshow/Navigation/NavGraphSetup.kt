package com.example.flashfeedshow.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.flashfeedshow.UI.ArticleScreen
import com.example.flashfeedshow.UI.NewsScreen
import com.example.flashfeedshow.Util.Constants.Companion.NEWS_SCREEN
import com.example.flashfeedshow.ViewModal.NewsScreenViewModel

@Composable
fun NavGraphSetup(
    navController: NavHostController
) {
    val argKey = "web_url"
    NavHost(
        navController = navController,
        startDestination = NEWS_SCREEN
    ) {
        composable(route = NEWS_SCREEN) {
            val viewModel : NewsScreenViewModel = hiltViewModel()
            NewsScreen(
                state = viewModel.state,
                onEvent = viewModel::onEvent,
                onReadFullStoryButtonClicked = { url ->
                    navController.navigate("article_screen?$argKey=$url")
                }
            )
        }
        composable(
            route = "article_screen?$argKey={$argKey}",
            arguments = listOf(navArgument(name = argKey){
                type = NavType.StringType
            })
        ) { backStackEntry ->
            ArticleScreen(
                url = backStackEntry.arguments?.getString(argKey),
                onBackPressed = { navController.navigateUp() }
            )
        }
    }
}