import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm") version "1.6.21"
    id("com.google.protobuf") version "0.8.17"
    application
}

group = "org.memento"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val grpcVersion = "3.20.1"
val grpcKotlinVersion = "1.2.1"
val grpcProtoVersion = "1.46.0"

dependencies{
    implementation("io.grpc:grpc-stub:$grpcProtoVersion")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
    // protobuf-kotlin로 만들어지는 클라이언트 파일에서 필요한 메서드
    implementation("io.grpc:grpc-protobuf:$grpcProtoVersion")
    // protobuf-kotlin로 만들어지는 서버 파일에서 필요한 메서드
    implementation("com.google.protobuf:protobuf-kotlin:$grpcVersion")
    // protocol buffer 파일을 kotlin으로 컴파일
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}

//sourceSets{
//    getByName("main"){
//        java {
//            srcDirs(
//                "build/generated/source/proto/main/java",
//                "build/generated/source/proto/main/kotlin"
//            )
//        }
//    }
//}

protobuf {
    protoc {
        // protocol buffer를 컴파일하는 protoc 스펙 지정
        artifact = "com.google.protobuf:protoc:$grpcVersion"
    }

    // build 시점에 protobuf 생성 task 추가, java/kotlin stub 생성
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcProtoVersion"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk7@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            it.builtins {
                id("kotlin")
            }
        }
    }
}