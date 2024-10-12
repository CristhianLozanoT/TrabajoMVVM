package com.example.trabajomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trabajomvvm.model.QuoteModel
import com.example.trabajomvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    val quoteModel=MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote:QuoteModel=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}