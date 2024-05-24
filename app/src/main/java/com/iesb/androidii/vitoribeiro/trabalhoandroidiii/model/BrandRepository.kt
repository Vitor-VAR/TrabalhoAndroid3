package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model

import android.content.Context
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.IBrandService
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClientBrand
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.security.AccessControlContext

class BrandRepository (val context: Context) {

    private val remote = RetrofitClientBrand.getService(IBrandService::class.java)

    fun listCar(listener: APIListener<List<BrandModel>>){
        val call = remote.listCar()
        list(call, listener)
    }

    fun listTruk(listener: APIListener<List<BrandModel>>){
        val call = remote.listTruk()
        list(call, listener)
    }

    fun listMotorcycle(listener: APIListener<List<BrandModel>>){
        val call = remote.listMotorcycle()
        list(call, listener)
    }

    private fun list(call: Call<List<BrandModel>>, listener: APIListener<List<BrandModel>>){
        call.enqueue(object : Callback<List<BrandModel>>{
            override fun onResponse(
                call: Call<List<BrandModel>>,
                response: Response<List<BrandModel>>
            ) {


            }
            override fun onFailure(call: Call<List<BrandModel>>, t: Throwable) {
                listener.onFailure("Um erro inesperado ocorreu. Tente novamente mais tarde.")
            }

        })

    }
}