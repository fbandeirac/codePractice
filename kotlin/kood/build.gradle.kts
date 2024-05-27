plugins {
    kotlin("jvm") version "1.9.22"
}

group = "dev.fbandeira"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation ("io.kotest:kotest-runner-junit5:4.6.3")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}