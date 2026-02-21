package dev.cmanrg.movie.feature.home.data.remote.dto

import kotlinx.serialization.SerialName

data class TvSeriesResponseDto(
    val page: Int,
    @SerialName("total_pages") val totalPages: Int,
    @SerialName("total_results") val totalResults: Int,
    @SerialName("results") val results: List<TvSeriesDto>
)