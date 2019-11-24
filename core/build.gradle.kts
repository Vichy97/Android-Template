plugins {
    id("java-library")
}

dependencies {
    api(Libraries.KOTLIN_STD_LIB)
    api(Libraries.AndroidX.CORE_KTX)

    api(Libraries.KOIN_ANDROID)
    api(Libraries.KOIN_VIEW_MODEL)
}