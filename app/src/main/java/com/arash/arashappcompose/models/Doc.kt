package com.arash.arashappcompose.models


import com.arash.arashapp.network.models.Multimedia
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Doc(
    @Json(name = "abstract")
    val `abstract`: String = "",
    @Json(name = "document_type")
    val documentType: String = "",
    @Json(name = "_id")
    val id: String = "",
    @Json(name = "lead_paragraph")
    val leadParagraph: String = "",
    @Json(name = "news_desk")
    val newsDesk: String = "",
    @Json(name = "print_page")
    val printPage: String = "",
    @Json(name = "print_section")
    val printSection: String = "",
    @Json(name = "pub_date")
    val pubDate: String = "",
    @Json(name = "section_name")
    val sectionName: String = "",
    @Json(name = "snippet")
    val snippet: String = "",
    @Json(name = "source")
    val source: String = "",
    @Json(name = "subsection_name")
    val subsectionName: String = "",
    @Json(name = "type_of_material")
    val typeOfMaterial: String = "",
    @Json(name = "uri")
    val uri: String = "",
    @Json(name = "web_url")
    val webUrl: String = "",
    @Json(name = "word_count")
    val wordCount: Int = 0
)