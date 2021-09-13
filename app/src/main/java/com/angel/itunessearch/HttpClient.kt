package com.angel.itunessearch

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Request.Builder

//https://itunes.apple.com/search?term=mew%20frengers

var client = OkHttpClient()

fun run(url: String): String {
    val request: Request = Builder().build()

    client.newCall(request).execute().use { response ->
        return response.body!!.string()
    }
}