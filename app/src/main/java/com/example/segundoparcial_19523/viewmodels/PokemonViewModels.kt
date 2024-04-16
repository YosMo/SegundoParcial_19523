package com.example.example.viewmodels

import com.example.example.models.Pokemon
import com.example.segundoparcial_19523.R


class PokemonViewModels {
    init {}

    fun getPokemonList(): ArrayList<Pokemon> {
        var pokemonList: ArrayList<Pokemon> = ArrayList<Pokemon>()

        pokemonList.add(Pokemon(R.drawable.pokemon01, "Spirigatito"))
        pokemonList.add(Pokemon(R.drawable.pokemon02, "Fuecoco"))
        pokemonList.add(Pokemon(R.drawable.pokemon03, "Quaxly"))

        return pokemonList
    }
}