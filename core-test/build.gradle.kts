plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api(TestLibraries.JUNIT)
    api(TestLibraries.MOCKK)
    api(TestLibraries.AndroidX.JUNIT_EXT)
    api(TestLibraries.AndroidX.ESPRESSO_CORE)
}