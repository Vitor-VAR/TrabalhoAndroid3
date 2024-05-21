package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.IBrandService
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BrandViewModel: ViewModel() {
    private var brandLiveDate = MutableLiveData<List<BrandModel>>()


    fun observerBrandLiveData(): LiveData<List<BrandModel>> {
        return brandLiveDate
    }
}