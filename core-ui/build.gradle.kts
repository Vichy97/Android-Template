plugins {
    id(BuildPlugins.ANDROID_LIBRARY_COMMON)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(Modules.CORE))
    implementation(project(Modules.UTIL))

    implementation(Libraries.AndroidX.FRAGMENT)
    implementation(Libraries.AndroidX.FRAGMENT_EXT)

    api(Libraries.AndroidX.CONSTRAINT_LAYOUT)
    api(Libraries.AndroidX.NAVIGATION_FRAGMENT)
    api(Libraries.AndroidX.NAVIGATION_FRAGMENT_EXT)
    api(Libraries.AndroidX.NAVIGATION_UI)
    api(Libraries.AndroidX.NAVIGATION_UI_EXT)
    api(Libraries.MATERIAL)
    api(Libraries.MOSHI)
}