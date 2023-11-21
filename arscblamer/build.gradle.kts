import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java")
    id("com.vanniktech.maven.publish") version "0.25.3"
}

group = "io.github.shiqos"
version = "1.2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01)

    signAllPublications()

    pom {
        name.set("ArscBlamer")
        description.set("A Tool for APK arsc editor")
        inceptionYear.set("2024")
        url.set("https://github.com/shiqos/ArscBlamer")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("shiq")
                name.set("shiqos")
                url.set("https://github.com/shiqos/")
            }
        }
        scm {
            url.set("https://github.com/shiqos/ArscBlamer/")
            connection.set("scm:git:git://github.com/shiqos/ArscBlamer.git")
            developerConnection.set("scm:git:ssh://git@github.com/shiqos/ArscBlamer.git")
        }
    }
}