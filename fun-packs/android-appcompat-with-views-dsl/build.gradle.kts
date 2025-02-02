@file:Suppress("SpellCheckingInspection")

/*
 * Copyright 2019-2021 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    publish
}

android {
    setDefaults()
}

kotlin {
    android()

    configure(targets) { configureMavenPublication() }
    sourceSets {
        androidMain.dependencies {
            api(splittiesFunPack("android-appcompat"))
            api(splittiesFunPack("android-base-with-views-dsl"))
            api(splitties("views-dsl-appcompat"))
        }
    }
}
