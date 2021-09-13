package com.angel.itunessearch

import kotlinx.serialization.*

@Serializable
data class SearchDTO (
    val resultCount: Long? = null,
    val results: List<Result>? = null
)

@Serializable
data class Result (
    val wrapperType: String? = null,
    val kind: String? = null,

    @SerialName("artistId")
    val artistID: Long? = null,

    @SerialName("collectionId")
    val collectionID: Long? = null,

    @SerialName("trackId")
    val trackID: Long? = null,

    val artistName: String? = null,
    val collectionName: String? = null,
    val trackName: String? = null,
    val collectionCensoredName: String? = null,
    val trackCensoredName: String? = null,

    @SerialName("artistViewUrl")
    val artistViewURL: String? = null,

    @SerialName("collectionViewUrl")
    val collectionViewURL: String? = null,

    @SerialName("trackViewUrl")
    val trackViewURL: String? = null,

    @SerialName("previewUrl")
    val previewURL: String? = null,

    val artworkUrl30: String? = null,
    val artworkUrl60: String? = null,
    val artworkUrl100: String? = null,
    val collectionPrice: Double? = null,
    val trackPrice: Double? = null,
    val releaseDate: String? = null,
    val collectionExplicitness: String? = null,
    val trackExplicitness: String? = null,
    val discCount: Long? = null,
    val discNumber: Long? = null,
    val trackCount: Long? = null,
    val trackNumber: Long? = null,
    val trackTimeMillis: Long? = null,
    val country: String? = null,
    val currency: String? = null,
    val primaryGenreName: String? = null,
    val isStreamable: Boolean? = null
)
