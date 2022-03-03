package com.arash.arashappcompose.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NYTimesDoc(
    @Json(name = "copyright")
    val copyright: String = "",
    @Json(name = "response")
    val response: Response = Response(),
    @Json(name = "status")
    val status: String = ""
)