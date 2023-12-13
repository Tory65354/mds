plugins {
    id("java")
}

group = "org.example"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("org.springframework.boot:spring-boot-starter-web:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.2.0")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}