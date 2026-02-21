package dev.cmanrg.movie.feature.home.domain.repository

import dev.cmanrg.movie.feature.home.domain.model.TvSeries

interface TvSeriesRepository {

    suspend fun getAiringTodaySeries(): List<TvSeries>
    suspend fun getOnTheAirSeries(): List<TvSeries>
    suspend fun getPopularSeries(): List<TvSeries>
    suspend fun getTopRatedSeries(): List<TvSeries>


}