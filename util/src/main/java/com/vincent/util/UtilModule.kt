package com.vincent.util

import android.content.res.Resources

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val utilsModule = module {

    single<ResourceProvider> {
        ResourceProvider(get<Resources>())
    }

    single<Resources> {
        androidContext().resources
    }
}