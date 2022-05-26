package com.example.movieapplication.database

import com.example.movieapplication.models.MovieResponse
import com.example.movieapplication.models.details.MovieDetailsResponse
import com.example.movieapplication.models.images.ImagesResponse
import retrofit2.Response

interface MovieRepositoryHelper {
    suspend fun  popularMovies(page:Int): Response<MovieResponse>
    suspend fun  topRatedMovies(page:Int): Response<MovieResponse>
    suspend fun getSimilar(id:Int): Response<MovieResponse>
    suspend fun getSearchDetails(query:String,page:Int): Response<MovieResponse>
    suspend fun getDetails(id :Int):Response<MovieDetailsResponse>
    suspend fun getImages(id:Int):Response<ImagesResponse>
    suspend fun getMovieWithGenre(id:Int): Response<MovieResponse>
}