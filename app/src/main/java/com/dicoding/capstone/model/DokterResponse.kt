package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class DoctorsItem(

	@field:SerializedName("NIK")
	val nIK: String,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("umur")
	val umur: Int,

	@field:SerializedName("nama")
	val nama: String,

	@field:SerializedName("doctorId")
	val doctorId: String,

	@field:SerializedName("tempatLahir")
	val tempatLahir: String,

	@field:SerializedName("jenisKelamin")
	val jenisKelamin: String,

	@field:SerializedName("telephone")
	val telephone: String,

	@field:SerializedName("tanggalLahir")
	val tanggalLahir: String,

	@field:SerializedName("alamat")
	val alamat: String,

	@field:SerializedName("jadwalKerja")
	val jadwalKerja: List<String>,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)

data class Data(

	@field:SerializedName("doctors")
	val doctors: List<DoctorsItem>
)
