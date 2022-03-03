package com.arash.arashappcompose.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Legacy(
    @Json(name = "thumbnail")
    val thumbnail: String = "",
    @Json(name = "thumbnailheight")
    val thumbnailheight: Int = 0,
    @Json(name = "thumbnailwidth")
    val thumbnailwidth: Int = 0,
    @Json(name = "wide")
    val wide: String = "",
    @Json(name = "wideheight")
    val wideheight: Int = 0,
    @Json(name = "widewidth")
    val widewidth: Int = 0,
    @Json(name = "xlarge")
    val xlarge: String = "",
    @Json(name = "xlargeheight")
    val xlargeheight: Int = 0,
    @Json(name = "xlargewidth")
    val xlargewidth: Int = 0
)