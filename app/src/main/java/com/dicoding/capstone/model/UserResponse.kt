package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @field:SerializedName("data")
    val data: UserData
)
data class UserData(
    val user: User,
    val token: String
)
data class User(
    val userId: String,
    val username: String,
    val roles: List<String>
)
