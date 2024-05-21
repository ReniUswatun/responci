package com.reni.universeitas.ui.university

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UniversityViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is university Fragment"
    }
    val text: LiveData<String> = _text
}