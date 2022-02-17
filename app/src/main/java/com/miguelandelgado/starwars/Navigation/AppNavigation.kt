package com.miguelandelgado.starwars.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.miguelandelgado.starwars.Screens.*

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = AppScreens.InitialScreen.route ){
        composable(route = AppScreens.InitialScreen.route){
            InitialScreen(navController)
        }
        composable(route = AppScreens.MenuScreen.route) {
            MenuScreen(navController)
        }
        composable(route = AppScreens.ListPeopleScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListPeopleScreen(navController, it.arguments?.getString("text"))
        }
        composable(route = AppScreens.ListFilmScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListFilmScreen(navController, it.arguments?.getString("text"))
        }
        composable(route = AppScreens.ListSpaceshipScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListSpaceshipScreen(navController, it.arguments?.getString("text"))
        }
        composable(route = AppScreens.ListVehicleScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListVehicleScreen(navController, it.arguments?.getString("text"))
        }
        composable(route = AppScreens.ListSpecieScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListSpecieScreen(navController, it.arguments?.getString("text"))
        }
        composable(route = AppScreens.ListPlanetScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            ListPlanetScreen(navController, it.arguments?.getString("text"))
        }

    }
}