package com.manuelblanco.lookingscooters.data.remote.repositories

import com.manuelblanco.lookingscooters.data.remote.TransportApi
import com.manuelblanco.lookingscooters.domain.model.Vehicle
import com.manuelblanco.lookingscooters.domain.repositories.TransportRepository
import com.manuelblanco.lookingscooters.shared.network.Resource

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
class TransportRepositoryImpl(
    private val api: TransportApi
) : TransportRepository {

    override suspend fun getVehicles(
        apiKey: String
    ): Resource<List<Vehicle>> {
        return try{
            val transportDto = api.getVehicles("")

            Resource.Success(
                data = transportDto.vehicles.mapNotNull {
                    it
                }
            )
        }catch(e:Exception) {
            e.printStackTrace()
            Resource.Error(
                error = e.localizedMessage?:"A error occurred"
            )
        }
    }
}