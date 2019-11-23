import org.gradle.api.JavaVersion

object Java {

    val SOURCE_COMPATIBILITY = JavaVersion.VERSION_1_8
    val TARGET_COMPATIBILITY = JavaVersion.VERSION_1_8
}

object Android {

    const val COMPILE_SDK = 29
    const val MIN_SDK = 21
    const val TARGET_SDK = 29
}

object Version {

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Flavors {

    object Dimensions {
        const val ENVIRONMENT = "environment"
    }

    const val DEVELOP = "develop"
    const val PRODUCTION = "production"
}
