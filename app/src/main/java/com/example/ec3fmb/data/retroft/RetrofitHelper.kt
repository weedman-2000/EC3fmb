package com.example.ec3fmb.data.retroft

import com.example.ec3fmb.data.response.ListEc3Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper
{
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val ec3Service: Ec3Service = retrofit.create(Ec3Service::class.java)

}
    //https://run.mocky.io/v3/48d1f2bc-c7bb-455e-b7e4-64c2307ed821