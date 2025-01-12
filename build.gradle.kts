plugins {
	java
	war
	id("org.springframework.boot") version "3.1.8"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.backend.handt"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}


repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	// https://mvnrepository.com/artifact/mysql/mysql-connector-java
	implementation("mysql:mysql-connector-java:8.0.31")
	implementation("org.springframework.boot:spring-boot-starter-jdbc:2.6.8")

}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.bootWar {
	archiveBaseName.set("handt")
}

tasks.bootBuildImage {
	builder.set("paketobuildpacks/builder-jammy-base:latest")
}
