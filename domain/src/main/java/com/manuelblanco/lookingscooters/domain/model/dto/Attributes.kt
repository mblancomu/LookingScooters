package com.manuelblanco.lookingscooters.domain.model.dto

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
data class Attributes(
    var batteryLevel: Int?,
    var lat: Double?,
    var lng: Double?,
    var maxSpeed: Int?,
    var vehicleType: String?,
    var hasHelmetBox: Boolean?
)
