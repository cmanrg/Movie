package dev.cmanrg.movie.feature.home.data.mapper

import dev.cmanrg.movie.feature.home.data.local.entity.MovieEntity
import dev.cmanrg.movie.feature.home.data.remote.dto.MovieDto
import dev.cmanrg.movie.feature.home.domain.model.Movie

fun MovieDto.toEntity(): MovieEntity {
    return MovieEntity(
        id = id,
        title = title,
        posterPath = posterPath,
        voteAverage = voteAverage,
        voteCount = voteCount,
        cachedAt = System.currentTimeMillis()
    )
}

fun MovieEntity.toDomain(): Movie{
    return Movie(
        id = id,
        title = title,
        posterPath = posterPath,
        voteAverage = voteAverage,
        voteCount = voteCount
    )
}