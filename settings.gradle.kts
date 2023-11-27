pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "reproduce_kt_63460"

val kotlinVer = "2.0.255-SNAPSHOT"
//val kotlinVer = "2.0.0-Beta1"

buildCache {
    local {
        directory = File(rootDir, "build-cache-$kotlinVer")
        removeUnusedEntriesAfterDays = 30
    }
}