package com.example.wifiqui.ui.Antecedentes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Antecedentes"
    }
    val text: LiveData<String> = _text
}