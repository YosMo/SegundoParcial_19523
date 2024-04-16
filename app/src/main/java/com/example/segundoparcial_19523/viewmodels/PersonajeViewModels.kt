package com.example.example.viewmodels


import com.example.example.models.Personaje
import com.example.segundoparcial_19523.R

class PersonajeViewModels {
    init {}

    fun getPersonajeList(): ArrayList<Personaje> {
        var personajeList: ArrayList<Personaje> = ArrayList<Personaje>()

        personajeList.add(Personaje("Estudiante", "chica", 12, R.drawable.female01))
        personajeList.add(Personaje("Estudiante", "chico", 10, R.drawable.male01))
        personajeList.add(Personaje("Youtuber", "chica", 14, R.drawable.female02))
        personajeList.add(Personaje("Profesor", "chico", 24, R.drawable.male02))
        personajeList.add(Personaje("Streamer", "chica", 24, R.drawable.female03))
        personajeList.add(Personaje("Pescador", "chico", 65, R.drawable.male03))
        personajeList.add(Personaje("Mecánico", "chica", 21, R.drawable.female04))
        personajeList.add(Personaje("Cocinero", "chico", 32, R.drawable.male04))

        return personajeList
    }
}