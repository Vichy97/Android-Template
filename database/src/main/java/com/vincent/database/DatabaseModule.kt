package com.vincent.database

import android.content.Context
import android.content.SharedPreferences
import com.vincent.database.preferences.Preferences

import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

private const val SHARED_PREFERENCES_NAME = "app-preferences"

val databaseModule = module {

    single<Preferences> {
        Preferences(get<SharedPreferences>())
    }

    single<SharedPreferences> {
        androidApplication().getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
    }
}