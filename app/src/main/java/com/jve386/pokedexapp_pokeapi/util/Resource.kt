package com.jve386.pokedexapp_pokeapi.util

/* SEALED CLASS deprecated
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource <T>(data)
} */

enum class ResourceStatus {
    SUCCESS,
    ERROR,
    LOADING
}

sealed interface Resource<T> {
    val status: ResourceStatus
    val data: T?
    val message: String?

    data class Success<T>(override val data: T) : Resource<T> {
        override val status = ResourceStatus.SUCCESS
        override val message: String? = null
    }

    data class Error<T>(override val message: String, override val data: T? = null) : Resource<T> {
        override val status = ResourceStatus.ERROR
    }

    data class Loading<T>(override val data: T? = null) : Resource<T> {
        override val status = ResourceStatus.LOADING
        override val message: String? = null
    }
}