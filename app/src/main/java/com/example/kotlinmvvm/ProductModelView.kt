package com.example.kotlinmvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductModelView(application: Application) : AndroidViewModel(application) {

    private val productRepository: ProductRepository
    val postData: MutableLiveData<List<ProductModelData>>
        get() = productRepository.postData

    init {
        productRepository = ProductRepository()
    }
}