package com.arash.arashappcompose.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Meta(
    @Json(name = "hits")
    val hits: Int = 0,
    @Json(name = "offset")
    val offset: Int = 0,
    @Json(name = "time")
    val time: Int = 0
)