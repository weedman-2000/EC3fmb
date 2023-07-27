package com.example.ec3fmb.model

import android.graphics.Color
import com.google.gson.annotations.SerializedName

data class ec3(
    val title: String,
    val content: String,
    val labels: List<String>,
    val color: String,

    @SerializedName("created_on")
    val createdOn: String
){
    fun getColor():Int = Color.parseColor(color)
}

fun getData(): List<ec3>{
    return listOf(
        ec3("e1","Prueba", listOf("scientific","space"), "#B5CEA4" ,"13/07/2023"),
        ec3("e2","Prueba2", listOf("scientific2","space2"), "#B5CEA4","12/07/2023")
    )
}
