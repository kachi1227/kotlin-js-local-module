import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

afterEvaluate {
    rootProject.extensions.configure<NodeJsRootExtension> {
        versions.webpackDevServer.version = "4.0.0"
    }
}

plugins {
    kotlin("js") version "1.5.10"
}

group = "me.kachi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation(npm("my-module", directory = rootProject.projectDir.resolve("src/main/javascript")))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.0-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:5.2.0-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.0.5-pre.206-kotlin-1.5.10")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.3-pre.206-kotlin-1.5.10")
    implementation(devNpm("@babel/preset-react", "*"))
    implementation(devNpm("@babel/core", "*"))
    implementation(devNpm("@babel/preset-env", "*"))
    implementation(devNpm("babel-loader", "*"))
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}