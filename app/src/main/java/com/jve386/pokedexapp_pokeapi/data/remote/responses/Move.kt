package com.jve386.pokedexapp_pokeapi.data.remote.responses

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)