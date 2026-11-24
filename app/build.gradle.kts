plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.purplerange.docgenius"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.purplerange.docgenius"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
