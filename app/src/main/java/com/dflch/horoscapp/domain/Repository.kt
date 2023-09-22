package com.dflch.horoscapp.domain

import com.dflch.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing: String): PredictionModel?
}