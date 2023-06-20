package com.dicoding.capstone.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataPenyakit(
    val idPenyakit: Int,
    val namaPenyakit: String,
    val obat: String
): Parcelable
