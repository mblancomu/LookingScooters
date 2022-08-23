package com.manuelblanco.lookingscooters.data.remote

import com.manuelblanco.lookingscooters.domain.model.dto.TransportDTO
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */
interface TransportApi {
    @GET("/v1/json/9ec3a017-1c9d-47aa-8c38-ead2bfa9b339/c284fd9a-c94e-4bfa-8f26-3a04ddf15b47")
    suspend fun getVehicles(
        @Query("apiKey") apiKey: String
    ): TransportDTO

    companion object{
        const val BASE_URL = "https://api.jsonstorage.net"
    }
}
