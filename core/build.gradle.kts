plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.60-eap-25")
    api("androidx.core:core-ktx:1.1.0")
    api("org.koin:koin-android:2.0.1")
    api("org.koin:koin-androidx-viewmodel:2.0.1")
}