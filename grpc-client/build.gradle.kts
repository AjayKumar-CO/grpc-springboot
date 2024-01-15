plugins {
    id("java")
}

group = "com.catalystone.grpc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":grpc-server"))
    implementation("io.grpc:grpc-protobuf:1.60.1")

    implementation("io.grpc:grpc-stub:1.60.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}