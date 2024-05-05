plugins {
    id("java")
    id("io.qameta.allure") version ("2.11.2")
    id("org.gradle.test-retry") version ("1.5.4")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("com.codeborne:selenide:6.17.1")
    testImplementation("org.slf4j:slf4j-simple:2.0.7")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.5.0")
    testImplementation("io.qameta.allure:allure-selenide:2.23.0")
    testImplementation("io.rest-assured:rest-assured:5.3.1")


    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")

}

tasks.test {
    useJUnitPlatform()
}