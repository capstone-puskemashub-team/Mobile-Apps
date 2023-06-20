package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class ObatResponse(

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class Medicine(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("nama")
	val nama: String,

	@field:SerializedName("harga")
	val harga: Int,

	@field:SerializedName("medicineId")
	val medicineId: String,

	@field:SerializedName("stok")
	val stok: Int,

	@field:SerializedName("deskripsi")
	val deskripsi: String,

	@field:SerializedName("nomor")
	val nomor: Int,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)

data class Data(

	@field:SerializedName("medicine")
	val medicine: Medicine
)
