package com.arash.arashappcompose.network.api

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject


class OkHttpInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val url: HttpUrl = chain.request().url.newBuilder().addQueryParameter("api-key", "OKsEwghCzAPR3kRr7Hp51cFn2tMfXWgj").build()
        return chain.proceed(request.newBuilder().url(url).build())
    }
}