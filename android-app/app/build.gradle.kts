plugins {
    alias(libs.plugins.android.application)
    id("io.freefair.lombok") version "8.14.2"
}

android {
    namespace = "com.se1853_jv.labverse"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.se1853_jv.labverse"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.recyclerview)
    implementation(libs.cardview)

    implementation(libs.room.runtime)
    compileOnly(libs.lombok.v11830)
    compileOnly(libs.room.compiler)
    annotationProcessor(libs.lombok.v11830)
    annotationProcessor(libs.room.compiler)

    implementation(libs.gson)
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.storage)
    implementation(libs.firebase.messaging)

    implementation(libs.android.pdf.viewer)

    implementation(libs.lottie)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}