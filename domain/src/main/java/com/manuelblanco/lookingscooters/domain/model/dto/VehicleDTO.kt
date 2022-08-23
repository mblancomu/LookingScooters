package com.manuelblanco.lookingscooters.domain.model.dto

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
data class VehicleDTO(
    val type       : String,
    val id         : String,
    val attributes : Attributes?
)
