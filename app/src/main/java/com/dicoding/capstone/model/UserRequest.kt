package com.dicoding.capstone.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRequest {
    @SerializedName("username")
    @Expose
    var username:String? = null

    @SerializedName("password")
    @Expose
    var password:String? = null

    @SerializedName("firstname")
    @Expose
    var firstname:String? = null

    @SerializedName("lastname")
    @Expose
    var lastname:String? = null

    @SerializedName("telephone")
    @Expose
    var telephone:String? = null
}