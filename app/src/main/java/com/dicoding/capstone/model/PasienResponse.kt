package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class PasienResponse(

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class Patient(

	@field:SerializedName("umur")
	val umur: Int,

	@field:SerializedName("patientId")
	val patientId: String,

	@field:SerializedName("NRM")
	val nRM: String,

	@field:SerializedName("telephonePenanggungJawab")
	val telephonePenanggungJawab: String,

	@field:SerializedName("suhuTubuh")
	val suhuTubuh: Int,

	@field:SerializedName("tanggalLahir")
	val tanggalLahir: String,

	@field:SerializedName("nadi")
	val nadi: Int,

	@field:SerializedName("panjangLahir")
	val panjangLahir: Int,

	@field:SerializedName("tekananDarah")
	val tekananDarah: String,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("jenisKelamin")
	val jenisKelamin: String,

	@field:SerializedName("alergi")
	val alergi: List<String>,

	@field:SerializedName("updatedAt")
	val updatedAt: String,

	@field:SerializedName("JaminanKesehatan")
	val jaminanKesehatan: String,

	@field:SerializedName("noBPJS")
	val noBPJS: String,

	@field:SerializedName("telephone")
	val telephone: String,

	@field:SerializedName("hubunganPenanggungJawab")
	val hubunganPenanggungJawab: String,

	@field:SerializedName("tanggalPemeriksaan")
	val tanggalPemeriksaan: String,

	@field:SerializedName("keluhan")
	val keluhan: List<String>,

	@field:SerializedName("alamat")
	val alamat: String,

	@field:SerializedName("NIK")
	val nIK: String,

	@field:SerializedName("beratBadan")
	val beratBadan: Int,

	@field:SerializedName("nama")
	val nama: String,

	@field:SerializedName("beratLahir")
	val beratLahir: Int,

	@field:SerializedName("tempatLahir")
	val tempatLahir: String
)

data class Data(

	@field:SerializedName("patient")
	val patient: Patient
)
