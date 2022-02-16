package com.miguelandelgado.starwars.Navigation

sealed class AppScreens (val route: String){
    object InitialScreen: AppScreens("initial_screen")
    object MenuScreen: AppScreens("menu_screen")
}
