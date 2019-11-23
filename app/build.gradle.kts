plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
}

android {
    compileSdkVersion(Android.COMPILE_SDK)

    defaultConfig {

        applicationId = "com.vincent.template"

        minSdkVersion(Android.MIN_SDK)
        targetSdkVersion(Android.TARGET_SDK)

        versionCode = Version.VERSION_CODE
        versionName = Version.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        all {
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }

        getByName("release") {
            isShrinkResources = true
            isMinifyEnabled = true
        }

        getByName("debug"){
            isShrinkResources = false
            isMinifyEnabled = false
        }
    }

    flavorDimensions(Flavors.Dimensions.ENVIRONMENT)
    productFlavors {
        create(Flavors.DEVELOP) {
            applicationIdSuffix = ".develop"
        }

        create(Flavors.PRODUCTION)
    }

    compileOptions {
        sourceCompatibility = Java.SOURCE_COMPATIBILITY
        targetCompatibility = Java.TARGET_COMPATIBILITY
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":network"))
    implementation(project(":database"))
    implementation(project(":core-ui"))
    implementation(project(":util"))
    implementation(project(":core"))

    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.facebook.stetho:stetho:1.5.1")

    testImplementation(project(":core-test"))

    debugImplementation("com.squareup.leakcanary:leakcanary-android:2.0-beta-2")
}