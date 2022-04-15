package com.example.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


   var vieModel: ProductModelView? = null

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vieModel = ViewModelProvider(this)[ProductModelView::class.java]
        vieModel!!.postData.observe(this){ list ->

            Log.d("TAG", "onCreate: $list")
        }




    }
}