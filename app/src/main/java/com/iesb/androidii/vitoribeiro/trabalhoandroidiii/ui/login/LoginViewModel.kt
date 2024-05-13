package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserRepository

class LoginViewModel : ViewModel() {

    private var login = MutableLiveData<Boolean>()
    private val userRepository = UserRepository()

    fun login(): LiveData <Boolean>{
        return login
    }

    fun doLogin(email: String, password: String){
        login.value= userRepository.login(email, password)

    }
}