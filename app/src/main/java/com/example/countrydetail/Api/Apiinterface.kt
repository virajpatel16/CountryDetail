package com.example.countrydetail.Api

import com.example.countrydetail.Model.Countrymodel
import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {

    @GET("v2/all")
    fun getcountry() : Call<List<Countrymodel>>
}