plugins {
    `java-library`
    `maven-publish`
    signing
}

base.archivesName.set("atlas-mixin-compat")
group = "enterprises.stardust.atlas.mixin"
version = "0.0.1-alpha.1"

repositories {
    mavenCentral()
    maven("https://repo.spongepowered.org/repository/maven-public/")
}

dependencies {
    implementation("org.spongepowered:mixin:0.8.5")
    compileOnly("org.ow2.asm:asm-tree:9.4")
    compileOnly("org.apache.logging.log4j:log4j-api:2.19.0")
}