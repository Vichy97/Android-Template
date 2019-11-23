package plugin

import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class LibraryCommonPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.plugins.apply("com.android.library")
        target.plugins.apply("kotlin-android")
        target.plugins.apply("kotlin-android-extensions")
        val extension = target.extensions.getByType<LibraryExtension>()
        extension.configure()
    }

    private fun LibraryExtension.configure() {
        compileSdkVersion(29)

        defaultConfig {
            minSdkVersion(21)
            targetSdkVersion(29)

            versionCode = 1
            versionName = "1.0"

            consumerProguardFile("consumer-rules.pro")
        }

        buildTypes {
            all {
                isMinifyEnabled = false
            }
        }

        flavorDimensions("environment")
        productFlavors {
            create("develop") {}
            create("production") {}
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }
}