package com.sujith.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingSum: Int) : ViewModel() {
    private val sum = MutableLiveData<Int>()
    val sumData: LiveData<Int>
        get() = sum

    init {
        sum.value = startingSum
    }

    private var textBoxValue = "0"


    fun add(value: Int) {
        sum.value = (sum.value)?.plus(value)
    }

    fun getTextBoxValue(): String {
        return textBoxValue
    }

    fun setTextBoxValue(value: String) {
        textBoxValue = value
    }
}