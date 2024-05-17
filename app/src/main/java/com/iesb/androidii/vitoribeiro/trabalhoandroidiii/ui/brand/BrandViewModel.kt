package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import android.util.Log
import androidx.lifecycle.LiveData
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
                    if (response.isSuccessful){
                        brandLiveDate.value = response.body()!!.brands
                    }
                }

                override fun onFailure(call: Call<Brand>, t: Throwable) {
                    Log.d("BrandViewModel", t.message.toString())
                }

            })
    }
    fun observerBrandLiveData(): LiveData<List<BrandItem>> {
        return brandLiveDate
    }
}