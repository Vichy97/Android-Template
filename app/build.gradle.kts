plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {

        applicationId = "com.vincent.template"

        minSdkVersion(21)
        targetSdkVersion(29)

        versionCode = 3
        versionName = "1.0"

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

    flavorDimensions("environment")
    productFlavors {
        create("develop") {
            applicationIdSuffix = ".develop"
        }

        create("production") {

        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
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