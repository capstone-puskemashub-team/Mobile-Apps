package com.dicoding.capstone.model

import com.google.gson.annotations.SerializedName

data class PenyakitResponse(

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class DiseaseItem(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("nama")
	val nama: String,

	@field:SerializedName("nomor")
	val nomor: Int,

	@field:SerializedName("diseaseId")
	val diseaseId: String,

	@field:SerializedName("treatments")
	val treatments: Any,

	@field:SerializedName("keluhan")
	val keluhan: List<String>,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)

data class Data(

	@field:SerializedName("disease")
	val disease: List<DiseaseItem>
)
