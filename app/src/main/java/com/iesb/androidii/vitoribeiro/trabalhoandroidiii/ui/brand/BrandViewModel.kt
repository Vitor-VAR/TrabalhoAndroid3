package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.Brand
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandItem
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.IBrandService
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BrandViewModel: ViewModel() {
    private var brandLiveDate = MutableLiveData<List<BrandItem>>()

    fun getBrand(){
        RetrofitClient.createService(IBrandService::class.java).getBrands("")
            .enqueue(object: Callback<Brand>{
                override fun onResponse(call: Call<Brand>, response: Response<Brand>) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<Brand>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }
}