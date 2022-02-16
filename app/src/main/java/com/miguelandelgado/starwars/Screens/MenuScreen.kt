package com.miguelandelgado.starwars.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.miguelandelgado.starwars.ui.theme.StarWarsTheme

@Composable
fun MenuScreen(navController: NavController, text: String?){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SecondScreen")
        }
    }) {
        MenuBodyContent(navController, text)
    }
}

@Composable
fun MenuBodyContent(navController: NavController, text: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("He navegado")
        text?.let {
            Text(it)
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Volver atrás")
        }
    }
}
