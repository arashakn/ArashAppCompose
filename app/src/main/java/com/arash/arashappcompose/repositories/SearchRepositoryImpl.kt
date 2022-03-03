package com.arash.arashappcompose.repositories

import com.arash.arashapp.network.responsehandler.NetworkResultWrapper
import com.arash.arashapp.network.responsehandler.safeApiCall
import com.arash.arashapp.repositories.SearchRepository
import com.arash.arashappcompose.models.NYTimesDoc
import com.arash.arashappcompose.network.api.SearchAPI
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchRepositoryImpl @Inject constructor(private val searchAPI: SearchAPI)  : SearchRepository {
    override suspend fun search(query: String) : NetworkResultWrapper<NYTimesDoc> =
        safeApiCall(Dispatchers.IO) { searchAPI.getNyTimesDocuments(query)}
}