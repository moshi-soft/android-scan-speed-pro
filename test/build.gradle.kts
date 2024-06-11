plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    //id("com.google.devtools.ksp") version "1.8.10-1.0.9"
}

android {
    namespace = "com.example.test"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.test"
        minSdk = 24
        targetSdk = 34
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
//    buildFeatures {
//        compose = true
//    }
//
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.14"
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val room_version = "2.6.1"
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.room.runtime)
    annotationProcessor(libs.androidx.room.compiler)
//    ksp(libs.androidx.room.compiler)


    implementation(libs.core)
    implementation(libs.ui)
    implementation(libs.androidx.material)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    //implementation("androidx.room:room-runtime:2.6.1")
    //ksp("androidx.room:room-compiler:$room_version")
    //ksp(libs.androidx.room.compiler)
//    implementation(libs.androidx.room.compiler)

}