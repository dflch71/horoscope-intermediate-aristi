package com.dflch.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.dflch.horoscapp.data.provider.HoroscopeProvider
import com.dflch.horoscapp.domain.model.HoroscopeInfo
import com.dflch.horoscapp.domain.model.HoroscopeInfo.Aries
import com.dflch.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.dflch.horoscapp.domain.model.HoroscopeInfo.Taurus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(
    private val horoscopeProvider: HoroscopeProvider
) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init { _horoscope.value = horoscopeProvider.getHoroscopes() }
}