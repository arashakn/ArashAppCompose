package com.arash.arashapp.repositories

import com.arash.arashapp.network.responsehandler.NetworkResultWrapper
import com.arash.arashappcompose.models.NYTimesDoc

interface SearchRepository {
    suspend fun search(query : String) : NetworkResultWrapper<NYTimesDoc>
}