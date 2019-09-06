plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    api("io.kubernetes", "client-java", "5.0.0")
    implementation("javax.annotation", "javax.annotation-api", "1.3.2")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
