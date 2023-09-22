package com.dflch.horoscapp.ui.detail

import com.dflch.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState()
    data class Error(val error: String): HoroscopeDetailState()
    data class Success(val predition: String, val sing: String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
}