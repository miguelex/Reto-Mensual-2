package com.miguelandelgado.starwars.Navigation

sealed class AppScreens (val route: String){
    object InitialScreen: AppScreens("initial_screen")
    object MenuScreen: AppScreens("menu_screen")
    object ListPeopleScreen: AppScreens("list_people_screen")
    object ListFilmScreen: AppScreens("list_film_screen")
    object ListSpaceshipScreen: AppScreens("list_spaceship_screen")
    object ListVehicleScreen: AppScreens("list_vehicle_screen")
    object ListSpecieScreen: AppScreens("list_specie_screen")
    object ListPlanetScreen: AppScreens("list_planet_screen")
}
