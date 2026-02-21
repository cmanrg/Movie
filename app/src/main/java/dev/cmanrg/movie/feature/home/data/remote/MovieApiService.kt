package dev.cmanrg.movie.feature.home.data.remote

import dev.cmanrg.movie.feature.home.data.remote.dto.MovieResponseDto
import retrofit2.http.GET

interface MovieApiService {

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(): MovieResponseDto
    @GET("movie/popular")
    suspend fun getPopularMovies(): MovieResponseDto
    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(): MovieResponseDto
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(): MovieResponseDto
}

