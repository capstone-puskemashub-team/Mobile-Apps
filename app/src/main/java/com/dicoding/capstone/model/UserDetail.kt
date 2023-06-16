package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class UserDetail(
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("login")
    val login: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("avatar_url")
    val avatarUrl: String? = null,

    @field:SerializedName("followers")
    val followers: Int? = null,

    @field:SerializedName("following")
    val following: Int? = null
)
