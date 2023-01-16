package com.xhhold.plugin.version

object Libs {

    private const val coreKtxVersion = "1.7.0"
    private const val lifecycleRuntimeVersion = "2.4.1"
    private const val composeVersion = "1.1.1"
    private const val activityComposeVersion = "1.4.0"
    private const val composeMaterial3Version = "1.0.0-alpha08"
    private const val appcompatVersion = "1.4.1"
    private const val junitVersion = "4.13.2"
    private const val testExtVersion = "1.1.3"
    private const val testEspressoVersion = "3.4.0"

    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeVersion"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val composeUi = "androidx.compose.ui:ui:$composeVersion"
    const val composeUiPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val composeMaterial3 = "androidx.compose.material3:material3:$composeMaterial3Version"
    const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val junit = "junit:junit:$junitVersion"
    const val testExt = "androidx.test.ext:junit:$testExtVersion"
    const val testEspresso = "androidx.test.espresso:espresso-core:$testEspressoVersion"
    const val testComposeUiJunit = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val testComposeUiManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"

    object Local {
        const val core = ":core"
        const val bridge = ":bridge"
    }
}