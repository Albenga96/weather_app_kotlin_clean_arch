package com.plcoding.weatherapp.data.remote.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name="hourly")
    val weatherData: WeatherDataDto
)