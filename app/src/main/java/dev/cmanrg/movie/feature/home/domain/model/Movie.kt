package dev.cmanrg.movie.feature.home.domain.model

import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,
    val title: String,
    val posterPath: String,
    val voteAverage: Double,
    val voteCount: Int
)
