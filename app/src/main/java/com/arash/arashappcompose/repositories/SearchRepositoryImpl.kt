package com.arash.arashapp.repositories

import com.arash.arashapp.network.models.NyTimesDocuments
import com.arash.arashapp.network.responsehandler.NetworkResultWrapper

class SearchRepositoryImpl()  : SearchRepository{
    override suspend fun search(
        token: String,
        page: Int,
        query: String
    ): NetworkResultWrapper<NyTimesDocuments> {
        TODO("Not yet implemented")
    }
}