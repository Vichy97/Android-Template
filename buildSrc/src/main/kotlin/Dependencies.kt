const val KOTLIN_VERSION = "1.3.60-eap-25"

object BuildPlugins {

    private object Versions {
        const val GRADLE_BUILD_TOOLS = "4.0.0-alpha04"
        const val GOOGLE_SERVICES = "4.3.2"
    }

    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE_BUILD_TOOLS}"
    const val KOTLIN_GRADLE= "org.jetbrains.kotlin:kotlin-gradle-plugin:${KOTLIN_VERSION}"
    const val GOOGLE_SERVICES = "com.google.gms:google-services:${Versions.GOOGLE_SERVICES}"
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
}

object Libraries {

    private object Versions {

    }
}
