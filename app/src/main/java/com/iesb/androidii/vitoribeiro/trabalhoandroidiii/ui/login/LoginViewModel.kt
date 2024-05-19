package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserRepository
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener

class LoginViewModel : ViewModel() {

    //private var login = MutableLiveData<Boolean>()
    private val userRepository = UserRepository()

//    fun login(): LiveData <Boolean>{
//        return login
//    }

    fun doLogin(email: String, password: String) {
        userRepository.login(email, password, object : APIListener<UserModel> {
            override fun onSuccess(result: UserModel) {

            }

            override fun onFailure(message: String) {

            }
        })
    }

}
