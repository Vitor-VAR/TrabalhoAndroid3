package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services

import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.Brand
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IBrandService {
    @GET("marcas?")
    fun getBrands(@Query("api_key")apiKey: String): Call<Brand>
}