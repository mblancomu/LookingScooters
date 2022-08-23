package com.manuelblanco.lookingscooters.di

import com.manuelblanco.lookingscooters.data.remote.TransportApi
import com.manuelblanco.lookingscooters.data.remote.TransportApi.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Manuel Blanco Murillo on 23/8/22.
 */

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideApi(): com.manuelblanco.lookingscooters.data.remote.TransportApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(com.manuelblanco.lookingscooters.data.remote.TransportApi::class.java)
    }
}