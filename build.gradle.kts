// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("com.android.library") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.dagger.hilt.android") version "2.46.1" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.9.0" apply false
    kotlin("jvm") version "1.8.0"
}