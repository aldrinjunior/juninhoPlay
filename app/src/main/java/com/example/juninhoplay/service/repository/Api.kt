package com.example.juninhoplay.service.repository

import com.example.juninhoplay.service.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "757e997011f41f8eec01b897752410ce",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}