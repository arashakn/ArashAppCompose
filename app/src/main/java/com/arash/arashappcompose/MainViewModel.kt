package com.arash.arashappcompose

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arash.arashapp.network.models.Article
import com.arash.arashapp.network.responsehandler.NetworkResultWrapper
import com.arash.arashapp.repositories.SearchRepository
import com.arash.arashappcompose.repositories.SearchRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: SearchRepositoryImpl
) : ViewModel(){
    val curVal : MutableLiveData<Int> = MutableLiveData(0)
    private val _articles = mutableStateOf<List<Article>>(emptyList())
    val articles: State<List<Article>> = _articles
    
    fun setArticles(a: List<Article>) {
        _articles.value = a
    }
    
    init {
        search()
    }

    private fun search (){
        viewModelScope.launch {
            val result = repository.search("russia")
            when(result){
                is NetworkResultWrapper.Success -> {Log.d("searchresult", "sucess")
                    result.value.response?.let {
                        setArticles(it.articles)
                    }
                }
                is NetworkResultWrapper.NetworkError -> Log.d("searchresult", "error")
            }
        }
    }
    fun increaseLivedata() {
        curVal.value = curVal.value?.plus(1)
    }
}