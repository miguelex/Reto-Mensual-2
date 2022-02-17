package com.miguelandelgado.starwars.Screens

import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.miguelandelgado.starwars.Navigation.AppScreens
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.miguelandelgado.starwars.R
import com.miguelandelgado.starwars.ui.theme.StarWarsTheme

@Composable
fun InitialScreen(navController: NavController){
    Box {
        Image(
            painter = painterResource(R.drawable.title),
            contentDescription = "titulo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Scaffold(
            backgroundColor = Color.Transparent
        ) {
            BodyContent(navController)
        }
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick ={
            navController.navigate(route = AppScreens.MenuScreen.route)
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.onSurface))
        {
            Text("ENTRAR")
        }

    }
}