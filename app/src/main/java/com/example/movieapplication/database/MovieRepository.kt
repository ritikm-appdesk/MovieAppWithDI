package com.example.movieapplication.database

import javax.inject.Inject


class MovieRepository @Inject constructor(private val movieHelper : MovieRepositoryHelper) {

    suspend fun  popularMovies(page:Int) = movieHelper.popularMovies(page)
    suspend fun  topRatedMovies(page:Int) = movieHelper.topRatedMovies(page = page)
    suspend fun getSimilar(id:Int) = movieHelper.getSimilar(id)
    suspend fun getSearchDetails(query:String,page:Int) = movieHelper.getSearchDetails(query = query, page = page)
    suspend fun getDetails(id :Int) = movieHelper.getDetails(id)
    suspend fun getImages(id:Int) = movieHelper.getImages(id)
    suspend fun getMovieWithGenre(id:Int) = movieHelper.getMovieWithGenre(id)

}