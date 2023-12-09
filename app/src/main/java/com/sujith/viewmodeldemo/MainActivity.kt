package com.sujith.viewmodeldemo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sujith.viewmodeldemo.databinding.ActivityMainBinding
import com.sujith.viewmodeldemo.ui.theme.ViewModelDemoTheme

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]


        binding.editText.setText(viewModel.getTextBoxValue())
        binding.sumTxt.text = viewModel.getSum().toString()
        binding.addBtn.setOnClickListener {
            binding.sumTxt.text = viewModel.add(viewModel.getTextBoxValue().toInt()).toString()
        }
        binding.editText.doOnTextChanged { text, start, before, count ->
            viewModel.setTextBoxValue(
                text.toString()
            )
        }
    }
}



