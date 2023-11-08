import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.compose(){
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeGraphics)
    implementation(Dependencies.composeToolingPreview)
    implementation(Dependencies.composeMaterial)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.composeTestJunit)
    debugImplementation(Dependencies.composeUITooling)
    debugImplementation(Dependencies.composeTestManifest)
}

fun DependencyHandler.testing(){
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.textExtJunit)
    androidTestImplementation(Dependencies.espresso)
}

fun DependencyHandler.room(){

}

fun DependencyHandler.retrofit(){

}