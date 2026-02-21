package dev.cmanrg.movie.feature.home.domain.repository

import dev.cmanrg.movie.feature.home.domain.model.Movie

interface MovieRepository {

    suspend fun getNowPlayingMovies(): List<Movie>
    suspend fun getPopularMovies(): List<Movie>
    suspend fun getTopRatedMovies(): List<Movie>
    suspend fun getUpcomingMovies(): List<Movie>

}