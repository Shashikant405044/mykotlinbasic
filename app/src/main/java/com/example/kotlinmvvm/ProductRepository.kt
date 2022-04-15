package com.example.kotlinmvvm

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductRepository {

    var mutableLiveData = MutableLiveData<List<ProductModelData>>()

   val postData: MutableLiveData<List<ProductModelData>>
        get(){

     val list  =  listOf<ProductModelData>()

     val endPoint = RetrofitApi.getInstance(ProductApiEndPoint::class.java)
    var call: Call<List<ProductModelData>> = endPoint.allProductData
    call.enqueue(
    object : Callback<List<ProductModelData>> {
        override fun onResponse(
            call: Call<List<ProductModelData>>,
            response: Response<List<ProductModelData>>
        ) {

            mutableLiveData.postValue(response.body())
            TODO("Not yet implemented")
        }

        override fun onFailure(call: Call<List<ProductModelData>>, t: Throwable) {
            TODO("Not yet implemented")
        }

    })



    return postData
}


}