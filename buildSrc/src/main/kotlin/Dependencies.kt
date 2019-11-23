const val KOTLIN_VERSION = "1.3.60-eap-25"
const val OBJECTBOX_VERSION = "2.4.1"
const val INSTRUMENTATION_TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

object BuildPlugins {

    private object Versions {
        const val GRADLE_BUILD_TOOLS = "4.0.0-alpha04"
    }

    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE_BUILD_TOOLS}"
    const val KOTLIN_GRADLE= "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    const val OBJECTBOX_GRADLE = "io.objectbox:objectbox-gradle-plugin:$OBJECTBOX_VERSION"

    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"

    const val KAPT = "kapt"
    const val OBJECTBOX = "io.objectbox"

    const val ANDROID_LIBRARY_COMMON = "androidLibraryCommon"
    const val ANDROID_APPLICATION_COMMON = "androidApplicationCommon"
}

object Libraries {

    private object Versions {
        const val MOSHI = "1.9.1"
        const val MATERIAL = "1.2.0-alpha02"
        const val TIMBER = "4.7.1"
        const val RETROFIT = "2.6.2"
        const val KOIN = "2.0.1"
    }

    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN_VERSION"
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val MOSHI_CODE_GEN = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"

    const val OBJECT_BOX_KOTLIN = "io.objectbox:objectbox-kotlin:$OBJECTBOX_VERSION"
    const val OBJECT_BOX_ANDROID = "io.objectbox:objectbox-android:$OBJECTBOX_VERSION"
    const val OBJECT_BOX_APT = "io.objectbox:objectbox-processor:$OBJECTBOX_VERSION"

    const val KOIN_ANDROID = "org.koin:koin-android:${Versions.KOIN}"
    const val KOIN_VIEW_MODEL = "org.koin:koin-androidx-viewmodel:${Versions.KOIN}"

    object AndroidX {

        private object Versions {
            const val CORE_KTX = "1.1.0"
            const val APP_COMPAT = "1.1.0"
            const val FRAGMENT = "1.2.0-rc02"
            const val NAVIGATION = "2.2.0-rc02"
            const val CONSTRAINT_LAYOUT = "1.1.3"
        }

        const val FRAGMENT = "androidx.fragment:fragment:${Versions.FRAGMENT}"
        const val FRAGMENT_EXT = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"

        const val NAVIGATION_UI = "androidx.navigation:navigation-ui:${Versions.NAVIGATION}"
        const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment:${Versions.NAVIGATION}"
        const val NAVIGATION_UI_EXT = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
        const val NAVIGATION_FRAGMENT_EXT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"

        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    }
}

object TestLibraries {

    private object Versions {
        const val JUNIT = "4.12"
        const val MOCKK = "1.9.3"
    }

    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"

    object AndroidX {

        private object Versions {
            const val JUNIT_EXT = "1.1.1"
            const val ESPRESSO_CORE = "3.2.0"
        }

        const val JUNIT_EXT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    }
}

object DebugLibraries {

    private object Versions {
        const val LEAK_CANARY = "2.0-beta-2"
    }

    const val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAK_CANARY}"
}

object Modules {

    const val APP = ":app"
    const val CORE = ":core"
    const val CORE_UI = ":core-ui"
    const val CORE_TEST = ":core-test"
    const val UTIL = ":util"
    const val NETWORK = ":network"
    const val DATABASE = ":database"
}



























