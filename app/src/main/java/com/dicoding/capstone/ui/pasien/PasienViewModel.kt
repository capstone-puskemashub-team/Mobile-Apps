package com.dicoding.capstone.ui.pasien

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PasienViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pasien Fragment"
    }
    val text: LiveData<String> = _text
}