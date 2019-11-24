plugins {
    id(BuildPlugins.ANDROID_LIBRARY_COMMON)
}

dependencies {
    implementation(project(Modules.CORE))

    api(TestLibraries.JUNIT)
    api(TestLibraries.MOCKK)
    api(TestLibraries.AndroidX.JUNIT_EXT)
    api(TestLibraries.AndroidX.ESPRESSO_CORE)
}