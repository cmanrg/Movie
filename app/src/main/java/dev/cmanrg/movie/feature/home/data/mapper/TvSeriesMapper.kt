package dev.cmanrg.movie.feature.home.data.mapper

import dev.cmanrg.movie.feature.home.data.local.entity.TvSeriesEntity
import dev.cmanrg.movie.feature.home.data.remote.dto.TvSeriesDto
import dev.cmanrg.movie.feature.home.domain.model.TvSeries

fun TvSeriesDto.toEntity(): TvSeriesEntity {
    return TvSeriesEntity(
        id = id,
        name = name,
        posterPath = posterPath,
        voteAverage = voteAverage,
        voteCount = voteCount,
        cachedAt = System.currentTimeMillis()
    )
}

fun TvSeriesEntity.toDomain(): TvSeries {
    return TvSeries(
        id = id,
        name = name,
        posterPath = posterPath,
        voteAverage = voteAverage,
        voteCount = voteCount
    )
}