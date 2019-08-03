import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins { kotlin("jvm") version "1.3.41" }

group = "dev.lunarcoffee"
version = "0.1.0"

repositories { mavenCentral() }
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("junit:junit:4.11")
}

tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "1.8" }
