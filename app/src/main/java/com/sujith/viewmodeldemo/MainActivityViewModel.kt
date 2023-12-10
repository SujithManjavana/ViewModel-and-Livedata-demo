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

   var textBoxValue = MutableLiveData("0")

    fun add() {
        sum.value = (sum.value)?.plus(textBoxValue.value!!.toInt())
    }

}