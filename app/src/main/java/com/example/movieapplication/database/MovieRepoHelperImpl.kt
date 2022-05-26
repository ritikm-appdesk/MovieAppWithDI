package com.example.movieapplication.database

import com.example.movieapplication.api.MovieApi
import com.example.movieapplication.models.MovieResponse
import com.example.movieapplication.models.details.MovieDetailsResponse
import com.example.movieapplication.models.images.ImagesResponse
import retrofit2.Response
import javax.inject.Inject

class MovieRepoHelperImpl @Inject constructor(private val movieApi:MovieApi):MovieRepositoryHelper{

    override suspend fun popularMovies(page: Int): Response<MovieResponse> = movieApi.getPopular(page = page)
    override suspend fun topRatedMovies(page: Int): Response<MovieResponse> = movieApi.getTopRated(page = page)
    override suspend fun getSimilar(id: Int): Response<MovieResponse> = movieApi.getSimilar(movieId = id)
    override suspend fun getSearchDetails(query: String, page: Int): Response<MovieResponse> = movieApi.getSearched(query = query, page = page)
    override suspend fun getDetails(id: Int): Response<MovieDetailsResponse>  = movieApi.getDetails(movieId = id)
    override suspend fun getImages(id: Int): Response<ImagesResponse>  = movieApi.getImages(movieId = id)
    override suspend fun getMovieWithGenre(id: Int): Response<MovieResponse>  = movieApi.getMovieViaGenre(genre = id)


}