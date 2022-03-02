package com.arash.arashapp.repositories

import com.arash.arashapp.network.models.NyTimesDocuments
import com.arash.arashapp.network.responsehandler.NetworkResultWrapper

interface SearchRepository {
    suspend fun search(token : String , page : Int , query : String) : NetworkResultWrapper<NyTimesDocuments>
}