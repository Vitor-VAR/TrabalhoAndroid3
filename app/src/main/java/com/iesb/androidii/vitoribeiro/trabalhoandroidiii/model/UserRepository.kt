package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model

import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.IUserService
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {

    private val remote = RetrofitClient.getService(IUserService::class.java)

    fun login(email: String, password: String, listener: APIListener<UserModel>) {
        val call = remote.login(email, password)
        call.enqueue(object : Callback<UserModel>{
            override fun onResponse(call: Call<UserModel>, response: Response<UserModel>) {
                if(response.code() == 200){
                    response.body()?.let { listener.onSuccess(it) }
                } else{
                    listener.onFailure(response.errorBody()!!.string())
                }
            }

            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                listener.onFailure("Erro inesperado")
            }

        })

    }

}


