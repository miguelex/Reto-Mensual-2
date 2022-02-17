package com.miguelandelgado.starwars.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.miguelandelgado.starwars.Navigation.AppScreens
import com.miguelandelgado.starwars.R
import com.miguelandelgado.starwars.ui.theme.StarWarsTheme

@Composable
fun MenuScreen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar(backgroundColor = MaterialTheme.colors.onSurface) {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Menú principal")
        }
    }) {
        MenuBodyContent(navController)
    }
}

@Composable
fun MenuBodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.onBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = {
            navController.navigate(route = AppScreens.ListPeopleScreen.route + "/personajes")
        })
        {
            Image(
                painter = painterResource(R.drawable.personajes),
                contentDescription = "personajes",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate(route = AppScreens.ListFilmScreen.route + "/peliculas")
        }) {
            Image(
                painter = painterResource(R.drawable.peliculas),
                contentDescription = "peliculas",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate(route = AppScreens.ListSpaceshipScreen.route + "/naves")
        }) {
            Image(
                painter = painterResource(R.drawable.naves),
                contentDescription = "naves",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate(route = AppScreens.ListVehicleScreen.route + "/vehiculos")
        }) {
            Image(
                painter = painterResource(R.drawable.vehiculos),
                contentDescription = "vehiculos",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate(route = AppScreens.ListSpecieScreen.route + "/especies")
        }) {
            Image(
                painter = painterResource(R.drawable.especies),
                contentDescription = "especies",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate(route = AppScreens.ListPlanetScreen.route + "/planetas")
        }) {
            Image(
                painter = painterResource(R.drawable.planetas),
                contentDescription = "planetas",
                modifier = Modifier.width(250.dp).heightIn(90.dp),
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.popBackStack()
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.onSurface))
        {
            Text("Volver atrás")
        }
    }
}
