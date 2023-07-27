package com.example.ec3fmb.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ec3fmb.data.repository.Ec3Respository
import com.example.ec3fmb.data.Ec3ServiceResult
import com.example.ec3fmb.model.ec3
import com.example.ec3fmb.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Ec3ListViewModel: ViewModel() {
    val ec3: MutableLiveData<List<ec3>> = MutableLiveData<List<ec3>>()
    val repository = Ec3Respository()

    fun getAllEc3(){
        val ec3List = getData()
        ec3.value = ec3List
    }

    fun getEc3FromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response  = repository.getEc3()
            when(response){
                is Ec3ServiceResult.Success ->{
                    ec3.postValue(response.data.ec3)
                }
                is Ec3ServiceResult.Error ->{
                    //
                }
            }
        }
    }
}