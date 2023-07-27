package com.example.ec3fmb.data

import java.lang.Exception

sealed class Ec3ServiceResult<T>(data: T?= null,  error: Exception?= null) {
    data class Success<T>(val data: T): Ec3ServiceResult<T>(data, null)
    data class Error<T>(val error: Exception): Ec3ServiceResult<T>(null , error)
}


