package com.example.wifiqui.ui.Videos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VideosViewModel {

    private val _text = MutableLiveData<String>().apply {
        value = "Videos WiFiQui"
    }
    val text: LiveData<String> = _text
}