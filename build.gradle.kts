plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.0.20"
  id("org.jetbrains.intellij.platform") version "2.2.1"
  id("org.jetbrains.grammarkit") version "2022.3.2.2"
}

group = "io.greycat"

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
    plugins("com.redhat.devtools.lsp4ij:0.16.1")
  }
  implementation("com.redhat.microprofile:com.redhat.qute.ls:0.21.0") {
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
  withType<org.jetbrains.grammarkit.tasks.GenerateLexerTask> {
    sourceFile.set(file("src/main/grammar/GreyCat.flex"))
    targetOutputDir.set(file("src/main/gen/io/greycat/language"))
    purgeOldFiles.set(true)
  }

  withType<org.jetbrains.grammarkit.tasks.GenerateParserTask> {
    sourceFile.set(file("src/main/grammar/GreyCat.bnf"))
    targetRootOutputDir.set(file("src/main/gen"))
    pathToParser.set("/io/greycat/language/GreyCatParser.java")
    pathToPsiRoot.set("/io/greycat/language/psi")
    purgeOldFiles.set(true)
  }

  // Make sure parser/lexer are generated before compiling
  compileJava {
    dependsOn(generateLexer, generateParser)
  }

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
