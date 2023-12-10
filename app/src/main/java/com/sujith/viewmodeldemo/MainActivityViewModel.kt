package com.sujith.viewmodeldemo

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingSum: Int) : ViewModel() {
    private var sum = 0

    init {
        sum = startingSum
    }

    private var textBoxValue = "0"
    fun getSum(): Int {
        return sum
    }

    fun add(value: Int): Int {
        sum += value
        return sum;
    }

    fun getTextBoxValue(): String {
        return textBoxValue
    }

    fun setTextBoxValue(value: String) {
        textBoxValue = value
    }
}