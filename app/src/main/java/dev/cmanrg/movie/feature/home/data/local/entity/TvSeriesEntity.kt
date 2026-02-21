package dev.cmanrg.movie.feature.home.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tv")
data class TvSeriesEntity(
    @PrimaryKey val id: Int,
    val name: String,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "vote_average") val voteAverage: Double,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    val cachedAt: Long,
)