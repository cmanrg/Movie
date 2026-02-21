package dev.cmanrg.movie.feature.home.data.remote

import dev.cmanrg.movie.feature.home.data.remote.dto.TvSeriesResponseDto
import retrofit2.http.GET

interface TvSeriesApiServices {

    @GET("tv/airing_today")
    suspend fun getAiringTodayTvSeries(): TvSeriesResponseDto
    @GET("tv/on_the_air")
    suspend fun getOnTheAirTvSeries(): TvSeriesResponseDto
    @GET("tv/popular")
    suspend fun getPopularTvSeries(): TvSeriesResponseDto
    @GET("tv/top_rated")
    suspend fun getTopRatedTvSeries(): TvSeriesResponseDto
}