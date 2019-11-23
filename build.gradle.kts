buildscript {
    extra["kotlin_version"] = "1.3.60-eap-25"
    repositories {
        google()
        jcenter()
        maven(url = "https://maven.fabric.io/public")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0-alpha04")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.60-eap-25")
        classpath("com.google.gms:google-services:4.3.2")
        classpath("io.fabric.tools:gradle:1.31.1")
        classpath("io.objectbox:objectbox-gradle-plugin:2.4.1")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
