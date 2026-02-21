package dev.cmanrg.movie.feature.home.domain.model

import com.google.gson.annotations.SerializedName

data class TvSeries(
    val id: Int,
    val name: String,
    val posterPath: String,
    val voteAverage: Double,
    val voteCount: Int
)
