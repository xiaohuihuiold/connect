import com.xhhold.plugin.version.AndroidConfig
import com.xhhold.plugin.version.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.xhhold.plugin.version")
}

android {
    namespace = AndroidConfig.namespaceApp
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = AndroidConfig.applicationId
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Libs.coreKtx)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.activityCompose)
    implementation(Libs.composeUi)
    implementation(Libs.composeUiPreview)
    implementation(Libs.composeMaterial3)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.testExt)
    androidTestImplementation(Libs.testEspresso)
    androidTestImplementation(Libs.testComposeUiJunit)
    debugImplementation(Libs.composeUiTooling)
    debugImplementation(Libs.testComposeUiManifest)
}