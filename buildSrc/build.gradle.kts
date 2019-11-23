plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    implementation("com.android.tools.build:gradle:4.0.0-alpha04")
}

gradlePlugin {
    plugins {
        register("AndroidLibraryCommon") {
            id = "androidLibraryCommon"
            implementationClass = "plugin.AndroidLibraryCommon"
        }
        register("AndroidApplicationCommon") {
            id = "androidApplicationCommon"
            implementationClass = "plugin.AndroidApplicationCommon"
        }
    }
}