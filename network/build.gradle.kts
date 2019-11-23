plugins {
    id("libraryCommonPlugin")
    kotlin("kapt")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":core"))

    implementation("com.squareup.retrofit2:retrofit:2.6.2")
    implementation("com.squareup.retrofit2:converter-moshi:2.6.2")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.6.1")
    implementation("com.facebook.stetho:stetho-okhttp3:1.5.1")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.9.1")
}
