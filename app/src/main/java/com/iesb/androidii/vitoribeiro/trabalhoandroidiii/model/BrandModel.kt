package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model

import com.google.gson.annotations.SerializedName

data class BrandModel(

    @SerializedName("codigo")
    val codigo: String,

    @SerializedName("nome")
    val nome: String
)