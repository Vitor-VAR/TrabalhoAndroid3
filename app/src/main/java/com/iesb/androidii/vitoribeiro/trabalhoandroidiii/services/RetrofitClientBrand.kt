package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientBrand {

    companion object {
        private lateinit var INSTANCE: Retrofit
        private const val BASE_URL = "https://parallelum.com.br/fipe/api/v1"


        private fun getRetrofitInstance(): Retrofit {
            var httpClient = OkHttpClient.Builder()
            if (!::INSTANCE.isInitialized){
                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return INSTANCE

        }

        fun <T> getService(service: Class<T>): T{
            return getRetrofitInstance().create(service)
        }
}
}