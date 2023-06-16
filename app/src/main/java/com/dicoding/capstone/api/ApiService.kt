package com.dicoding.capstone.api


import com.dicoding.capstone.model.UserDetail
import com.dicoding.capstone.model.UserRequest
import com.dicoding.capstone.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

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

    //GET all users
    @GET("/api/v0/users")
    @Headers("Authorization: token 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")
    fun getUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    //Get user by id
    @GET("/api/v0/users/{id}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("id") query: String
    ): Call<UserDetail>
}