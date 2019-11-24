plugins {
    id(BuildPlugins.ANDROID_LIBRARY_COMMON)
}

dependencies {
    implementation(project(Modules.CORE))

    api(Libraries.TIMBER)
}