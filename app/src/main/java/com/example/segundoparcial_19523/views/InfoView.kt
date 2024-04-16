package com.example.segundoparcial_19523.views
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.example.R
import com.example.example.viewmodels.PokeViewModels
import com.example.example.viewmodels.PokemonViewModels
import com.example.segundoparcial_19523.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataView(navController: NavHostController, image: Int, profesion: String) {

    var name by remember {mutableStateOf("")}
    var pokemon by remember {mutableStateOf("")}
    var message by remember {mutableStateOf("Favor selecciona un pokemon")}
    val PokemonviewModel = PokemonViewModels()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = name,
            onValueChange = {name = it},
            leadingIcon = {
                Image (
                    painter = painterResource(id = image),
                    contentDescription = "Personaje"
                )
            },
            label = { Text(text = "¿Nombre?")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Selecciona un pokemon")

        Spacer(modifier = Modifier.height(20.dp))

        LazyRow {
            items(PokemonviewModel.getPokemonList()) { pokemon ->
                Card (
                    onClick = {pokemon = pokemon.name}
                ) {
                    Column (modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = pokemon.image),
                            contentDescription = pokemon.name,
                            modifier = Modifier.size(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = pokemon.name, modifier = Modifier.align(Alignment.CenterHorizontally))
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {navController.popBackStack()}
            ) {
                Text(text = "Regresar")
            }

            Button(
                onClick = {
                    message = "$profesion $name eligió $pokemon"
                }
            ) {
                Text(text = "Finalizar")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = message)
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_Data() {
    DataView(navController = rememberNavController(), R.drawable.oak, "Albañil")
}