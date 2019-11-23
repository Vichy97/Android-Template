plugins {
    id("libraryCommonPlugin")
    kotlin(BuildPlugins.KAPT)
    id(BuildPlugins.OBJECTBOX)
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(Modules.CORE))

    api(Libraries.OBJECT_BOX_KOTLIN)
    api(Libraries.OBJECT_BOX_ANDROID)

    kapt(Libraries.OBJECT_BOX_APT)
}
