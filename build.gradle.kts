plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.0.20"
  id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "io.greycat"
version = "7.0.0"

repositories {
  mavenLocal()
  mavenCentral()
  maven { url = uri("https://repository.jboss.org/nexus/content/repositories/snapshots") }
  maven { url = uri("https://repository.jboss.org/nexus/content/groups/public") }
  maven { url = uri("https://repo.eclipse.org/content/repositories/lsp4mp-snapshots") }
  maven { url = uri("https://repo.eclipse.org/content/repositories/lsp4mp-releases") }
  intellijPlatform {
    defaultRepositories()
  }
}

sourceSets {
  main {
    java {
      srcDirs("src/main/gen")
    }
  }
}

dependencies {
  intellijPlatform {
    intellijIdeaCommunity("2023.3")
    plugins("com.redhat.devtools.lsp4ij:0.12.0")
  }
  implementation("com.redhat.microprofile:com.redhat.qute.ls:0.17.0") {
    exclude("org.eclipse.lsp4j")
  }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
//intellij {
  //version.set("2024.1")
  //type.set("CL") // Target IDE Platform

  //plugins.set(listOf("NodeJS"))
//}

tasks {
  // Set the JVM compatibility versions
  withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
  }
//  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//    kotlinOptions.jvmTarget = "17"
//  }

  patchPluginXml {
    sinceBuild.set("232")
    untilBuild.set("260.*")
  }

  signPlugin {
    certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
    privateKey.set(System.getenv("PRIVATE_KEY"))
    password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
  }

  publishPlugin {
    token.set(System.getenv("PUBLISH_TOKEN"))
  }
}
