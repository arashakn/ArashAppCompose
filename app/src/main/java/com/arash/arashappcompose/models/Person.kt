package com.arash.arashappcompose.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "firstname")
    val firstname: String = "",
    @Json(name = "lastname")
    val lastname: String = "",
    @Json(name = "middlename")
    val middlename: Any = Any(),
    @Json(name = "organization")
    val organization: String = "",
    @Json(name = "qualifier")
    val qualifier: Any = Any(),
    @Json(name = "rank")
    val rank: Int = 0,
    @Json(name = "role")
    val role: String = "",
    @Json(name = "title")
    val title: Any = Any()
)