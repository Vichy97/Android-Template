package com.vincent.util

import android.content.Intent
import android.content.pm.PackageManager

class PackageUtils(private val packageManager: PackageManager) {

    fun isPackageInstalled(packageName: String) = try {
        packageManager.getPackageInfo(packageName, 0)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }

    fun isPackageInstalledForIntent(intent: Intent) = intent.resolveActivity(packageManager) != null

    fun getLaunchIntentForPackage(packageName: String) =
        packageManager.getLaunchIntentForPackage(packageName)
}