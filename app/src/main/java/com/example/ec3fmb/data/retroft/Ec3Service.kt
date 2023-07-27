package com.example.ec3fmb.data.retroft

import com.example.ec3fmb.data.response.ListEc3Response
import retrofit2.http.GET

interface Ec3Service {
    @GET("48d1f2bc-c7bb-455e-b7e4-64c2307ed821")
    fun getAllEc3(): ListEc3Response
}