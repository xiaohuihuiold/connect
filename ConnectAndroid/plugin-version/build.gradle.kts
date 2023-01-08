plugins {
    id("java-gradle-plugin")
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}

gradlePlugin {
    plugins {
        create("version") {
            id = "com.xhhold.plugin.version"
            implementationClass = "com.xhhold.plugin.version.VersionPlugin"
        }
    }
}
