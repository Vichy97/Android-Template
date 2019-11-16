plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("io.objectbox")
}

android {
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
        create("develop") { }
        create("production") { }
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

    implementation(project(":core"))

    api("io.objectbox:objectbox-kotlin:2.4.1")
    api("io.objectbox:objectbox-android:2.4.1")
    api("io.objectbox:objectbox-rxjava:2.4.1")
    kapt("io.objectbox:objectbox-processor:2.4.1")
}
