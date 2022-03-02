package com.arash.arashapp.network.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Article(
    @Json(name = "abstract")
    val abstract: String? = "",
    @Json(name = "web_url")
    val webURL: String? = "",
    @Json(name = "snippet")
    val snippet: String? = "",
    @Json(name = "lead_paragraph")
    val leadParagraph: String? = "",
    @Json(name = "print_section")
    val printSection: String?,
    @Json(name = "print_page")
    val printPage: String? = "",
    @Json(name = "source")
    val source: String? = "",
    @Json(name = "multimedia")
    val multimedia: List<Multimedia>? = listOf(),
    @Json(name = "headline")
    val headLine: HeadLine?
)

data class Multimedia(
    @Json(name = "type")
    val type: String? = "",
    @Json(name = "url")
    val url: String? = "",

    )

data class HeadLine(
    @Json(name = "main")
    val main: String? = "",
    @Json(name = "print_headline")
    val printHeadline: String? = ""
)