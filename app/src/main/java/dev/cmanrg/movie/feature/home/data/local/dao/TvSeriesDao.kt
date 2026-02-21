package dev.cmanrg.movie.feature.home.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.cmanrg.movie.feature.home.data.local.entity.TvSeriesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TvSeriesDao {

    // Flow — Room notifica a la UI automáticamente cuando hay cambios
    @Query("SELECT * FROM tv")
    fun getAllTvSeries(): Flow<List<TvSeriesEntity>>

    // Suspend — solo insertar/borrar, operación puntual
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvSeries(movies: List<TvSeriesEntity>)

    @Query("DELETE FROM tv")
    suspend fun deleteAllTvSeries()

}