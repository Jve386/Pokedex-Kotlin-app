package com.jve386.pokedexapp_pokeapi.data.remote.responses

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)