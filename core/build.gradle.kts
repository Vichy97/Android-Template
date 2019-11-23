plugins {
    id("libraryCommonPlugin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api(Libraries.KOTLIN_STD_LIB)
    api(Libraries.AndroidX.CORE_KTX)

    api(Libraries.KOIN_ANDROID)
    api(Libraries.KOIN_VIEW_MODEL)
}