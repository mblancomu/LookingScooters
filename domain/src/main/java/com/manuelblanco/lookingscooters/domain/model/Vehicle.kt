package com.manuelblanco.lookingscooters.domain.model

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
data class Vehicle(
    val id: String,
    val transportType: String,
    val batteryLevel: Int?,
    val lat: Double?,
    val lng: Double?,
    val maxSpeed: Int?,
    val vehicleType: String?,
    var hasHelmetBox: Boolean?
)