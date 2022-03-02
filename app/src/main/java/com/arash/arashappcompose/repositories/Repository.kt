package com.arash.arashapp.repositories

import com.arash.arashapp.network.models.NyTimesDocuments
import com.arash.arashapp.network.responsehandler.NetworkResultWrapper
import com.arash.arashapp.network.responsehandler.safeApiCall
import com.arash.arashappcompose.network.api.SearchAPI
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Repository @Inject constructor(
    private val searchAPI: SearchAPI
) {
    suspend fun searchArticles(query: String) : NetworkResultWrapper<NyTimesDocuments> =
        safeApiCall(Dispatchers.IO) { searchAPI.getNyTimesDocuments(query)}
}