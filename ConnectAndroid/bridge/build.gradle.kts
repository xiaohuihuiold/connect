import com.xhhold.plugin.version.AndroidConfig
import com.xhhold.plugin.version.Libs
import com.google.protobuf.gradle.*

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.xhhold.plugin.version")
    id("com.google.protobuf")
}

android {
    namespace = AndroidConfig.namespaceBridge
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {
    protobuf(files("../../proto/"))
    implementation(Libs.protobuf)
    implementation(Libs.coreKtx)
    implementation(Libs.appcompat)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.testExt)
    androidTestImplementation(Libs.testEspresso)
}

protobuf {

    protoc {
        artifact = "com.google.protobuf:protoc:3.21.12"
    }

    generateProtoTasks {
        all().forEach {
            it.builtins {
                id("java") {
                    option("lite")
                }

                id("kotlin") {
                    option("lite")
                }
            }
        }
    }
}