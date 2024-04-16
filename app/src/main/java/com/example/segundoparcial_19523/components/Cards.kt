package com.example.segundoparcial_19523.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.segundoparcial_19523.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataCards(navController: NavHostController, profesion: String, genero: String, edad: Int, image: Int) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF2F2F2)),
        onClick = {
            navController.navigate("DataView/$image/$profesion")
        }
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Icono",
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = profesion, fontSize = 10.sp)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = genero, fontSize = 10.sp)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "$edad años", fontSize = 10.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    DataCards(navController = rememberNavController(), "Caca", "Hombre", 65, R.drawable.oak)
}