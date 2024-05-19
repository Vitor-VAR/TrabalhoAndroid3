package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model

import com.google.gson.annotations.SerializedName

class UserModel {

    @SerializedName("token")
    lateinit var token: String

    @SerializedName("userKey")
    lateinit var userKey: String

    @SerializedName("name")
    lateinit var name: String
}