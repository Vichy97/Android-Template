plugins {
    id(BuildPlugins.ANDROID_APPLICATION_COMMON)
}

android {

    defaultConfig {
        testInstrumentationRunner = INSTRUMENTATION_TEST_RUNNER
    }

    buildTypes {
        all {
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    productFlavors {
        getByName(Flavors.DEVELOP) {
            applicationIdSuffix = ".develop"
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(Modules.CORE))
    implementation(project(Modules.CORE_UI))
    implementation(project(Modules.UTIL))
    implementation(project(Modules.NETWORK))
    implementation(project(Modules.DATABASE))

    implementation(Libraries.AndroidX.APP_COMPAT)

    testImplementation(project(Modules.CORE_TEST))

    debugImplementation(DebugLibraries.LEAK_CANARY)
}