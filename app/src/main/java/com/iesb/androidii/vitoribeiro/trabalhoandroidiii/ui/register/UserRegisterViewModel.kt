package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.register

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserRepository
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.ValidationModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener

class UserRegisterViewModel (application: Application) : AndroidViewModel(application){

    private val userRepository = UserRepository(application.applicationContext)
    private val _user = MutableLiveData<ValidationModel>()
    val user: LiveData<ValidationModel> = _user
    fun crete(name: String, email: String, password: String){
        userRepository.create(name, email, password, object : APIListener<UserModel>{
            override fun onSuccess(result: UserModel) {
                _user.value = ValidationModel()

            }

            override fun onFailure(message: String) {
                _user.value = ValidationModel(message)

            }

        })

    }


}