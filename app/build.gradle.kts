plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.roomwordsample"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.roomwordsample"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude("META-INF/atomicfu.kotlin_module")
    }/**/
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    /**/implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.room:room-common:2.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.appcompat:appcompat:$rootProject.appCompatVersion")
    implementation("androidx.activity:activity-ktx:$rootProject.activityVersion")

    // Dependencies for working with Architecture components
    // You'll probably have to update the version numbers in build.gradle (Project)

    // Room components
    implementation("androidx.room:room-ktx:$rootProject.roomVersion")
    kapt("androidx.room:room-compiler:$rootProject.roomVersion")
    androidTestImplementation("androidx.room:room-testing:$rootProject.roomVersion")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$rootProject.lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$rootProject.lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-common-java8:$rootProject.lifecycleVersion")

    // Kotlin components
    //implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$rootProject.coroutines")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:$rootProject.coroutines")

    // UI
    implementation("androidx.constraintlayout:constraintlayout:$rootProject.constraintLayoutVersion")
    implementation("com.google.android.material:material:$rootProject.materialVersion")

    // Testing
    testImplementation("junit:junit:$rootProject.junitVersion")
    androidTestImplementation("androidx.arch.core:core-testing:$rootProject.coreTestingVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$rootProject.espressoVersion"/*,
        exclude group: 'com.android.support', module: 'support-annotations'
    }*/)
    androidTestImplementation("androidx.test.ext:junit:$rootProject.androidxJunitVersion")
}