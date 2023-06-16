package com.dicoding.capstone.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ProfileViewModel {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Profile Fragment"
    }
    val text: LiveData<String> = _text
}