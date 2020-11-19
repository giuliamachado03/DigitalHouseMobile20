package com.example.consumoapicorrecao.repository

import com.example.consumoapicorrecao.models.ApiResponseModel
import com.example.consumoapicorrecao.models.CharacterModel
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterEndpoint {

    @GET("character")
    fun obterPersonagens(): retrofit2.Call<ApiResponseModel<CharacterModel>>

    @GET("character/{id}")
    fun obterDetalhe(@Path("id") id : Int): retrofit2.Call<CharacterModel>

}