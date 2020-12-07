package com.example.revisaodesafio3.listagem.repository

import com.example.revisaodesafio3.data.api.NetworkUtils
import retrofit2.http.GET

interface CategoriaEndpoint {
    @GET("categories")
    suspend fun obterLista() : List<String>


    companion object{
        val endpoint = CategoriaEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(CategoriaEndpoint::class.java)
        }
    }
}