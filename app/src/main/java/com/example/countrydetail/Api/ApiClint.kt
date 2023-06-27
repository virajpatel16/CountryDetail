package com.example.countrydetail.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClint {

    companion object{
        var base_url="https://restcountries.com/"


        lateinit var retrofit: Retrofit

        fun getapi(): Retrofit {

            retrofit=Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit

        }

    }

}