package com.dflch.horoscapp.data

import android.util.Log
import com.dflch.horoscapp.data.network.HoroscopeApiService
import com.dflch.horoscapp.domain.Repository
import com.dflch.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sing: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sing) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("dflch","Ha ocurrido un error ${it.message}") }

        return null
    }
}