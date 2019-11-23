plugins {
    id(BuildPlugins.ANDROID_LIBRARY_COMMON)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(Modules.CORE))

    api(Libraries.TIMBER)
}