plugins {
    id("libraryCommonPlugin")
    kotlin("kapt")
    id("io.objectbox")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":core"))

    api("io.objectbox:objectbox-kotlin:2.4.1")
    api("io.objectbox:objectbox-android:2.4.1")
    api("io.objectbox:objectbox-rxjava:2.4.1")
    kapt("io.objectbox:objectbox-processor:2.4.1")
}
