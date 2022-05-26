package com.example.movieapplication.di

import com.example.movieapplication.database.MovieRepoHelperImpl
import com.example.movieapplication.database.MovieRepositoryHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMovieApiHelper(movieRepoHelperImpl: MovieRepoHelperImpl): MovieRepositoryHelper = movieRepoHelperImpl
}