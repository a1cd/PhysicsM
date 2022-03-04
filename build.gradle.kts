plugins {
    kotlin("js") version "1.6.10"
}

group = "me.a1cd"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.pyknic:vector:1.0.0")
    testImplementation(kotlin("test"))
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        nodejs {
        }
    }
}