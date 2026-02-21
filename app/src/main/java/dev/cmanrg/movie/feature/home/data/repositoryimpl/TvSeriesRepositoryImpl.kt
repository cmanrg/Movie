package dev.cmanrg.movie.feature.home.data.repositoryimpl

import dev.cmanrg.movie.feature.home.domain.model.TvSeries
import dev.cmanrg.movie.feature.home.domain.repository.TvSeriesRepository

class TvSeriesRepositoryImpl (): TvSeriesRepository {
    override suspend fun getAiringTodaySeries(): List<TvSeries> {
        TODO("Not yet implemented")
    }

    override suspend fun getOnTheAirSeries(): List<TvSeries> {
        TODO("Not yet implemented")
    }

    override suspend fun getPopularSeries(): List<TvSeries> {
        TODO("Not yet implemented")
    }

    override suspend fun getTopRatedSeries(): List<TvSeries> {
        TODO("Not yet implemented")
    }
}