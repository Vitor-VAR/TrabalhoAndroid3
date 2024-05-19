package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.services.listener

interface APIListener <T>{
    fun onSuccess(result: T)
    fun onFailure(message: String)
}