plugins {
    java
}

repositories {
    jcenter()
}

sourceSets {
    main {
        // Add resources from the java directory, so we can put input files next to the Java class.
        // This makes it easier in practise.
        resources {
            srcDir("src/main/java")
        }
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
