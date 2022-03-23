package com.generation.appdecliques


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var num = MutableLiveData(0)

    fun adicionar() {
        num.value = num.value!! + 1
    }
}