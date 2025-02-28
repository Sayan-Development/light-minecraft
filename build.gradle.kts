plugins {
    kotlin("jvm") version "2.1.10"
    `java-library`
    `maven-publish`
}

allprojects {
    group = "org.sayandev"
    version = "1.0.0-SNAPSHOT"

    plugins.apply("java-library")
    plugins.apply("maven-publish")
    plugins.apply("kotlin")

    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = rootProject.group as String

                from(components["java"])
            }
        }
    }

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        api("org.sayandev:light-core:1.0.0-SNAPSHOT")
    }
}

kotlin {
    jvmToolchain(17)
}