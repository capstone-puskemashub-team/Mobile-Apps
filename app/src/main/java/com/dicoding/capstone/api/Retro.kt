package com.dicoding.capstone.api

import retrofit2.Retrofit
import com.google.gson.GsonBuilder
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://34.121.199.14/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}