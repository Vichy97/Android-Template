plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)

        versionCode = 1
        versionName = "1.0"
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

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api("junit:junit:4.12")
    api("io.mockk:mockk:1.9.3")
    api("androidx.test.ext:junit:1.1.1")
    api("androidx.test.espresso:espresso-core:3.2.0")
}
