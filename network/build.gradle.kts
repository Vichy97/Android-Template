plugins {
    id(BuildPlugins.ANDROID_LIBRARY_COMMON)
    kotlin(BuildPlugins.KAPT)
}

dependencies {
    implementation(project(Modules.CORE))

    implementation(Libraries.RETROFIT)
    implementation(Libraries.RETROFIT_MOSHI_CONVERTER)

    kapt(Libraries.MOSHI_CODE_GEN)
}
