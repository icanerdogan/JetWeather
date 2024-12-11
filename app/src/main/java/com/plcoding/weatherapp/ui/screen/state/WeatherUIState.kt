package com.plcoding.weatherapp.ui.screen.state

import com.plcoding.weatherapp.domain.model.WeatherInfo

data class WeatherUIState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)