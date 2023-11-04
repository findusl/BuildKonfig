plugins {
    kotlin("multiplatform")
    id("com.codingfeline.buildkonfig") version "0.14.0"
}

kotlin {
    jvm()

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting
    }
}

buildkonfig {
    packageName = "com.codingfeline.buildkonfigsample"

    defaultConfigs {
    }
}
