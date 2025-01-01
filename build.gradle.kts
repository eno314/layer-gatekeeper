plugins {
    kotlin("jvm") version "2.0.21"
    id("com.gradle.plugin-publish") version "1.2.1"
    `java-gradle-plugin`
}

group = "jp.eno314"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    website = "https://github.com/eno314"
    vcsUrl = "https://github.com/eno314/package-gatekeeper.git"
    plugins {
        create("PackageGatekeeperPlugin") {
            id = "jp.eno314.package-gatekeeper"
            implementationClass = "jp.eno314.PackageGatekeeperPlugin"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("PackageGatekeeperPlugin") {
            from(components["java"])
            version = project.version.toString()
            groupId = project.group.toString()
        }
    }
}
