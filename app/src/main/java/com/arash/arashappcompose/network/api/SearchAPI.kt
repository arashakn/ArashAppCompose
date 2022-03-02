package com.arash.arashappcompose.network.api


import com.arash.arashapp.network.models.NyTimesDocuments
import com.arash.arashappcompose.utils.SEARCH_URL
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchAPI {
    @GET(SEARCH_URL)
    suspend fun getNyTimesDocuments(@Query("q") query: String): NyTimesDocuments
}