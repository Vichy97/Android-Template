plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":util"))

    implementation("androidx.fragment:fragment:1.2.0-rc02")
    implementation("androidx.fragment:fragment-ktx:1.2.0-rc02")
    implementation(project(":core"))

    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.60-eap-25")
    api("com.google.android.material:material:1.2.0-alpha01")
    api("androidx.constraintlayout:constraintlayout:1.1.3")
    api("androidx.core:core-ktx:1.1.0")
    api("androidx.navigation:navigation-fragment-ktx:2.2.0-rc02")
    api("androidx.navigation:navigation-ui-ktx:2.2.0-rc02")
    api("org.koin:koin-android:2.0.1")
    api("com.squareup.moshi:moshi:1.9.1")
}