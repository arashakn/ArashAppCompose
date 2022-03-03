package com.arash.arashappcompose.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Response(
    @Json(name = "docs")
    val docs: List<Doc> = listOf(),
    @Json(name = "meta")
    val meta: Meta = Meta()
)