package com.vincent.network

import com.squareup.moshi.Moshi
import com.vincent.network.interceptor.AuthInterceptor
import com.vincent.network.interceptor.HeaderInterceptor

import okhttp3.OkHttpClient
import org.koin.dsl.module

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

import java.util.concurrent.TimeUnit

private const val CONNECT_TIMEOUT = 30L
private const val READ_TIMEOUT = 10L
private const val WRITE_TIMEOUT = 10L

val networkModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .addConverterFactory(get<MoshiConverterFactory>())
            .build()
    }

    single<OkHttpClient> {
        OkHttpClient.Builder().apply {
            connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
            readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            addNetworkInterceptor(get<HeaderInterceptor>())
            addNetworkInterceptor(get<AuthInterceptor>())
        }.build()
    }

    single<HeaderInterceptor> {
        HeaderInterceptor()
    }

    single<AuthInterceptor> {
        AuthInterceptor()
    }

    single<MoshiConverterFactory> {
        MoshiConverterFactory.create(get<Moshi>())
    }

    single<Moshi> {
        Moshi.Builder()
            .build()
    }
}