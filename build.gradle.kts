buildscript {

    repositories {
        google()
        jcenter()
        maven("https://maven.fabric.io/public")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }

    dependencies {
        classpath(BuildPlugins.ANDROID_GRADLE)
        classpath(BuildPlugins.KOTLIN_GRADLE)
        classpath(BuildPlugins.GOOGLE_SERVICES)
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
