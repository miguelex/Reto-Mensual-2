package com.miguelandelgado.starwars.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.miguelandelgado.starwars.Screens.InitialScreen
import com.miguelandelgado.starwars.Screens.MenuScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = AppScreens.InitialScreen.route ){
        composable(route = AppScreens.InitialScreen.route){
            InitialScreen(navController)
        }
        composable(route = AppScreens.MenuScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })) {
            MenuScreen(navController, it.arguments?.getString("text"))
        }

    }
}