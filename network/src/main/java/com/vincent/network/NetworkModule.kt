package com.vincent.network

import com.squareup.moshi.Moshi
import com.vincent.network.interceptor.HeaderInterceptor

import okhttp3.OkHttpClient

import org.koin.dsl.module

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

import java.util.concurrent.TimeUnit

private const val CALL_TIMEOUT = 30L

val networkModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .addConverterFactory(get<MoshiConverterFactory>())
            .build()
    }

    single<OkHttpClient> {
        OkHttpClient.Builder().apply {
            callTimeout(CALL_TIMEOUT, TimeUnit.SECONDS)
            addNetworkInterceptor(get<HeaderInterceptor>())
        }.build()
    }

    single<HeaderInterceptor> {
        HeaderInterceptor()
    }

    single<MoshiConverterFactory> {
        MoshiConverterFactory.create(get<Moshi>())
    }

    single<Moshi> {
        Moshi.Builder()
            .build()
    }
}