package com.iesb.androidii.vitoribeiro.trabalhoandroidiii

import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.Brand
import retrofit2.http.GET
import retrofit2.http.Query

interface IBrandService {
    @GET("marcas?")
    fun getBrands(@Query("api_key")apiKey: String): Call<Brand>
}