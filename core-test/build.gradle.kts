plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api("junit:junit:4.12")
    api("io.mockk:mockk:1.9.3")
    api("androidx.test.ext:junit:1.1.1")
    api("androidx.test.espresso:espresso-core:3.2.0")
}