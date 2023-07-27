package com.example.ec3fmb.data.repository

import com.example.ec3fmb.data.Ec3ServiceResult
import com.example.ec3fmb.data.response.ListEc3Response
import com.example.ec3fmb.data.retroft.RetrofitHelper
import java.lang.Exception

class Ec3Respository {

    suspend fun getEc3(): Ec3ServiceResult<ListEc3Response> {
        return try {
            val response = RetrofitHelper.ec3Service.getAllEc3()
            Ec3ServiceResult.Success(response)

        }catch (e: Exception){
            Ec3ServiceResult.Error(e)
        }

    }

}