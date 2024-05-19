package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services

import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IUserService {

    @POST("Autentication/Login")
    @FormUrlEncoded
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<UserModel>

    @POST("Autentication/Create")
    @FormUrlEncoded
    fun create(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<UserModel>
}