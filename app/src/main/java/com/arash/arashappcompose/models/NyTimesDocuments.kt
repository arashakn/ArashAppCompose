package com.arash.arashapp.network.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class NyTimesDocuments(
    @Json(name = "status")
    val status: String? = "",
    @Json(name = "copyright")
    val copyRight: String? = "",
    @Json(name = "response")
    val response: SearchResponse?
)

data class SearchResponse(
    @Json(name = "docs")
    val articles: List<Article> = arrayListOf(),
    @Json(name = "meta")
    val metaData: MetaData?
)

data class MetaData(
    @Json(name = "hits")
    val hits: Long? = 0L,
    @Json(name = "offset")
    val offset: Long? = 0L,
    @Json(name = "time")
    val time: Long? = 0L,
)

