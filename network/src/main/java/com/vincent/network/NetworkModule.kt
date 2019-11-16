package com.vincent.network

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.squareup.moshi.Moshi
import com.vincent.network.interceptor.HeaderInterceptor

import okhttp3.OkHttpClient

import org.koin.dsl.module

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

import java.util.concurrent.TimeUnit

private const val CALL_TIMEOUT = 30L

val networkModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .client(get<OkHttpClient>())
            .addConverterFactory(get<MoshiConverterFactory>())
            .addCallAdapterFactory(get<RxJava2CallAdapterFactory>())
            .build()
    }

    single<OkHttpClient> {
        OkHttpClient.Builder().apply {
            callTimeout(CALL_TIMEOUT, TimeUnit.SECONDS)
            addNetworkInterceptor(get<HeaderInterceptor>())
            if (BuildConfig.DEBUG) { addNetworkInterceptor(get<StethoInterceptor>()) }
        }.build()
    }

    single<StethoInterceptor> {
        StethoInterceptor()
    }

    single<HeaderInterceptor> {
        HeaderInterceptor()
    }

    single<MoshiConverterFactory> {
        MoshiConverterFactory.create(get<Moshi>())
    }

    single<RxJava2CallAdapterFactory> {
        RxJava2CallAdapterFactory.create()
    }

    single<Moshi> {
        Moshi.Builder()
            .build()
    }
}