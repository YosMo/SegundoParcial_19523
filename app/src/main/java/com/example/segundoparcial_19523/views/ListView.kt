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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.example.components.DataCard
import com.example.example.viewmodels.PersonajeViewModels
import com.example.segundoparcial_19523.R

@Composable
fun ListView(navController: NavHostController) {

    val viewModel = PersonajeViewModels()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(text = "¿Eres niñio o niñia? ")
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.oak),
                contentDescription = "Img",
                modifier = Modifier.clip(CircleShape)
            )
        }

        LazyColumn {
            items(viewModel.getPersonajeList()) {
                    person ->
                DataCard(navController, person.profesion, person.genero, person.edad, person.image)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ListView(navController = rememberNavController())
}