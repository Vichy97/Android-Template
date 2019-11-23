package plugin

import com.android.build.gradle.LibraryExtension

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryCommon : Plugin<Project> {

    override fun apply(target: Project) {
        target.plugins.apply(BuildPlugins.ANDROID_LIBRARY)
        target.plugins.apply(BuildPlugins.KOTLIN_ANDROID)
        target.plugins.apply(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)

        target.extensions.getByType<LibraryExtension>().configure()
    }

    private fun LibraryExtension.configure() {
        compileSdkVersion(Android.COMPILE_SDK)

        defaultConfig {
            minSdkVersion(Android.MIN_SDK)
            targetSdkVersion(Android.TARGET_SDK)

            versionCode = Version.VERSION_CODE
            versionName = Version.VERSION_NAME

            consumerProguardFile("consumer-rules.pro")
        }

        buildTypes {
            all {
                isMinifyEnabled = false
            }
        }

        compileOptions {
            sourceCompatibility = Java.SOURCE_COMPATIBILITY
            targetCompatibility = Java.TARGET_COMPATIBILITY
        }
    }
}