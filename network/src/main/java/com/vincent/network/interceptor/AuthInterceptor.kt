package com.vincent.network.interceptor

import com.vincent.network.constants.AUTHORIZATION
import com.vincent.network.constants.BEARER

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    var accessToken = ""

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()

        val request = original.newBuilder()
                .apply {
                    method(original.method(), original.body())
                    header(AUTHORIZATION, "$BEARER $accessToken")
                }
                .build()
        return chain.proceed(request)
    }
}