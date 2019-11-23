plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":core"))

    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.60-eap-25")
    api("androidx.core:core-ktx:1.1.0")
    api("com.jakewharton.timber:timber:4.7.1")
}