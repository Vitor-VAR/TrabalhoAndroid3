package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services

import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface IBrandService {

    @GET("carros/marcas")
    fun listCar(): Call<List<BrandModel>>

    @GET("caminhoes/marcas")
    fun listTruk(): Call<List<BrandModel>>

    @GET("motos/marcas")
    fun listMotorcycle(): Call<List<BrandModel>>

    @GET("{string}/marcas?")
    fun listBrandCar(@Path(value = "string", encoded = true)string: String): Call<List<BrandModel>>
}