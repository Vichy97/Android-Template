package plugin

import com.android.build.gradle.AppExtension

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationCommon : Plugin<Project> {

    override fun apply(target: Project) {
        target.plugins.apply(BuildPlugins.ANDROID_APPLICATION)
        target.plugins.apply(BuildPlugins.KOTLIN_ANDROID)
        target.plugins.apply(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)

        target.extensions.getByType<AppExtension>().configure()
    }

    private fun AppExtension.configure() {
        compileSdkVersion(Android.COMPILE_SDK)

        defaultConfig {
            applicationId = Android.APPLICATION_ID

            minSdkVersion(Android.MIN_SDK)
            targetSdkVersion(Android.TARGET_SDK)

            versionCode = Version.VERSION_CODE
            versionName = Version.VERSION_NAME
        }

        buildTypes {
            getByName(BuildTypes.RELEASE) {
                isShrinkResources = true
                isMinifyEnabled = true
            }

            getByName(BuildTypes.DEBUG){
                isShrinkResources = false
                isMinifyEnabled = false
            }
        }

        flavorDimensions(Flavors.Dimensions.ENVIRONMENT)
        productFlavors {
            create(Flavors.DEVELOP)
            create(Flavors.PRODUCTION)
        }

        compileOptions {
            sourceCompatibility = Java.SOURCE_COMPATIBILITY
            targetCompatibility = Java.TARGET_COMPATIBILITY
        }
    }
}