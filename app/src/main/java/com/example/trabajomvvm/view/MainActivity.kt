package com.example.trabajomvvm.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.trabajomvvm.databinding.ActivityMainBinding
import com.example.trabajomvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel:QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote->
            binding.tvQuote.text=currentQuote.quote
            binding.tvAutor.text=currentQuote.author
        })
        binding.viewContainer.setOnClickListener{quoteViewModel.randomQuote()}

    }
}
