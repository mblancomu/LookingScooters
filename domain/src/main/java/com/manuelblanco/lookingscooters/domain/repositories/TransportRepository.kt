package com.manuelblanco.lookingscooters.domain.repositories

import com.manuelblanco.lookingscooters.domain.model.Vehicle
import jdk.internal.loader.Resource

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
interface TransportRepository {

    suspend fun getVehicles(apiKey: String): Resource<List<Vehicle>>
}