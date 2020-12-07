package com.example.revisaodesafio3.listagem.model

import com.google.gson.annotations.SerializedName

data class JokesModel (
    @SerializedName("icon_url")
    val iconUrl : String,
    val value : String
)