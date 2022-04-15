package com.example.kotlinmvvm

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApi {

    const val BASE_URL = "https://fakestoreapi.com"
    @JvmStatic
    fun <S> getInstance(serviceClass: Class<S>?): S {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
        return retrofit.create(serviceClass)

    }
}