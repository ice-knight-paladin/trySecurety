plugins {
    id("java")
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.example"
version = "1.0-SNAPSHOT"
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

dependencies {
    // Spring Boot Starter Web
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Boot Starter Security
    implementation("org.springframework.boot:spring-boot-starter-security")

    // Spring Boot Starter Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // Spring Security Test for Testing Security Configurations
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.test {
    useJUnitPlatform()
}