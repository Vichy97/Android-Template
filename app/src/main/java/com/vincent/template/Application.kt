package com.vincent.template

import android.app.Application

import com.vincent.database.databaseModule
import com.vincent.network.networkModule
import com.vincent.util.utilsModule

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

import timber.log.Timber

class Application : Application() {

    private val modules = listOf(
        utilsModule,
        networkModule,
        databaseModule
    )

    override fun onCreate() {
        super.onCreate()

        setupLogging()
        setupDependencyInjection()
    }

    private fun setupLogging() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun setupDependencyInjection() {
        startKoin {
            androidLogger()
            androidContext(this@Application)
            modules(modules)
        }
    }
}