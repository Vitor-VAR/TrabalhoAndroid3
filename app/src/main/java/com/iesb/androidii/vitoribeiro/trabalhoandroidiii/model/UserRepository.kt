package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model

class UserRepository {

    fun login (email: String, password: String): Boolean{
        return(email != "" && password != "")
    }
}