package com.example.kotlinmvvm

import retrofit2.Call
import retrofit2.http.GET

interface ProductApiEndPoint {

    @get:GET("/products")
     val allProductData: Call<List<ProductModelData>>


}