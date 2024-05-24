package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.BrandRepository
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener


class BrandViewModel (application: Application): AndroidViewModel(application) {
    private val brandRepository = BrandRepository(application.applicationContext)

    private val _brands = MutableLiveData<List<BrandModel>>()
    val brands: LiveData<List<BrandModel>> = _brands


    fun list(){
        brandRepository.listCar(object : APIListener<List<BrandModel>>{
            override fun onSuccess(result: List<BrandModel>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(message: String) {
                TODO("Not yet implemented")
            }

        })

    }

}


