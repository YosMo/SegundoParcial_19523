package com.example.segundoparcial_19523.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.segundoparcial_19523.views.ListView

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "InfoView/{image}/{profesion}", arguments = listOf(
            navArgument("image") {type = NavType.IntType},
            navArgument("profesion") {type = NavType.StringType}
        )) {
                parameters ->
            val image = parameters.arguments?.getInt("image") ?: 0
            val profesion = parameters.arguments?.getString("profesion") ?: ""

            InfoView(navController, image, profesion)
        }

    }
}

@Composable
fun InfoView(navController: NavHostController, image: Int, profesion: String) {

}
