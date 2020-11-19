package com.example.consumoapicorrecao.models

data class ApiResponseModel<T>(
    val info: PageInfoModel,
    val results : List<CharacterModel>
)