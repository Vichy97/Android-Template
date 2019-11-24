package com.vincent.util

import android.content.ContentResolver
import android.content.pm.PackageManager
import android.content.res.AssetManager
import android.content.res.Resources

import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val utilsModule = module {

    factory<FileUtils> {
        FileUtils(androidContext())
    }

    factory<PackageUtils> {
        PackageUtils(get<PackageManager>())
    }

    single<Resources> {
        androidContext().resources
    }

    single<PackageManager> {
        androidApplication().packageManager
    }

    single<ContentResolver> {
        androidApplication().contentResolver
    }

    single<AssetManager> {
        androidApplication().assets
    }
}