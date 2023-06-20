package com.dicoding.capstone.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataObat(
    val noObat: Int,
    val namaObat: String,
    val jumlahObat: Int
): Parcelable
