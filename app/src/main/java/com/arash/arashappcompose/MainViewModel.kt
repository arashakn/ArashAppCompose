package com.arash.arashappcompose

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arash.arashapp.network.responsehandler.NetworkResultWrapper
import com.arash.arashapp.repositories.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel(){
    val curVal : MutableLiveData<Int> = MutableLiveData(0)
    init {
        search()
    }

    private fun search (){
        viewModelScope.launch {
            val result = repository.searchArticles("russia")
            when(result){
                is NetworkResultWrapper.Success -> Log.d("searchresult", "sucess")
                is NetworkResultWrapper.NetworkError -> Log.d("searchresult", "error")
                else ->Log.d("searchresult", "else")
            }
        }
    }
    fun increaseLivedata() {
        curVal.value = curVal.value?.plus(1)
    }
}