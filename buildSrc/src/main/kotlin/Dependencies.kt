object Dependencies {
    //stblib
    const val stblib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.stblib}"

    //core
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompact = "androidx.appcompat:appcompat:${Versions.appCompact}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"

    //testing
    const val junit = "junit:junit:${Versions.junit}"
    const val textExtJunit = "androidx.test.ext:junit:${Versions.textExtJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val composeTestJunit = "androidx.compose.ui:ui-test-junit4"
    const val composeTestManifest = "androidx.compose.ui:ui-test-manifest"

    //compose UI
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val composeMaterial = "androidx.compose.material3:material3"
    const val composeToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUI = "androidx.compose.ui:ui"
    const val composeUITooling = "androidx.compose.ui:ui-tooling"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"

    //android material
    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"

    //dagger
    const val hiltAgp = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

