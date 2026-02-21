package dev.cmanrg.movie.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.cmanrg.movie.feature.home.data.local.dao.MovieDao
import dev.cmanrg.movie.feature.home.data.local.dao.TvSeriesDao
import dev.cmanrg.movie.feature.home.data.local.entity.MovieEntity
import dev.cmanrg.movie.feature.home.data.local.entity.TvSeriesEntity

@Database(
    entities = [MovieEntity::class, TvSeriesEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao
    abstract fun tvSeriesDao(): TvSeriesDao

}