package com.dicoding.capstone.api


import com.dicoding.capstone.model.UserRequest
import com.dicoding.capstone.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/auth/signin")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>

    @POST("api/auth/signup")
    fun register(
        @Body userRequest: UserRequest
    ): Call<UserResponse>

    @POST("api/auth/signout")
    fun logout(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}