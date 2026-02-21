package dev.cmanrg.movie.feature.home.data.repositoryimpl

import dev.cmanrg.movie.feature.home.domain.model.Movie
import dev.cmanrg.movie.feature.home.domain.repository.MovieRepository

class MovieRepositoryImpl() : MovieRepository {
    override suspend fun getNowPlayingMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun getPopularMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun getTopRatedMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun getUpcomingMovies(): List<Movie> {
        TODO("Not yet implemented")
    }
}