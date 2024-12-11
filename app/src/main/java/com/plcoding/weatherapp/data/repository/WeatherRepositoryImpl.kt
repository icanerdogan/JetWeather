package com.plcoding.weatherapp.data.repository

import com.plcoding.weatherapp.data.mapper.toWeatherInfo
import com.plcoding.weatherapp.data.remote.WeatherAPIService
import com.plcoding.weatherapp.domain.model.WeatherInfo
import com.plcoding.weatherapp.domain.repository.WeatherRepository
import com.plcoding.weatherapp.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPIService
): WeatherRepository {


    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}