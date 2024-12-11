package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.model.WeatherInfo
import com.plcoding.weatherapp.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}