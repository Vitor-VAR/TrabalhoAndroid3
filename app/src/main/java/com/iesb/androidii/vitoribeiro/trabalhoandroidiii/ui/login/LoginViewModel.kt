package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserRepository
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.ValidationModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.RetrofitClient
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener.APIListener

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val userRepository = UserRepository(application.applicationContext)

    private val _login = MutableLiveData<ValidationModel>()
    val login: LiveData<ValidationModel> = _login

    private val _failure = MutableLiveData<String>()
    val failure: LiveData<String> = _failure

//    fun login(): LiveData <Boolean>{
//        return login
//    }

    //Faz login usando API
    fun doLogin(email: String, password: String) {
        userRepository.login(email, password, object : APIListener<UserModel> {
            override fun onSuccess(result: UserModel) {
                _login.value = ValidationModel()
            }
            override fun onFailure(message: String) {
                _login.value = ValidationModel(message)
            }
        })
    }

}
