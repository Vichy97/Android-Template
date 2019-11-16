package com.vincent.util

import android.content.res.Resources
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

class ResourceProvider(private val resources: Resources) {

    fun getString(@StringRes id: Int): String {
        return resources.getString(id)
    }

    fun getInteger(@IntegerRes id: Int): Int {
        return resources.getInteger(id)
    }
}