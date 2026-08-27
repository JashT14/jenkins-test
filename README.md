# Jenkins Test - Java Maven CI Project

A minimal Java 17 and Maven project specifically designed for testing and verifying Jenkins CI/CD pipelines.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [How to Run Tests](#how-to-run-tests)
- [How to Build the Project](#how-to-build-the-project)
- [How to Run the Application](#how-to-run-the-application)

## Overview

This repository contains a simple, lightweight Java application managed with Apache Maven. It is intentionally kept minimal with no external service dependencies or complex frameworks, making it ideal for testing Jenkins build, test, and packaging stages.

When executed, the application outputs:

```text
Hello from Jenkins Maven CI!
```

## Project Structure

```text
jenkins-test/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── App.java
    └── test/
        └── java/
            └── com/
                └── example/
                    └── AppTest.java
```

## Prerequisites

- **Java Development Kit (JDK)**: Version 17 or higher
- **Apache Maven**: Version 3.8+ or higher

Verify installation:

```bash
java -version
mvn -version
```

## How to Run Tests

To compile and run JUnit 5 unit tests:

```bash
mvn test
```

To clean previous build artifacts and run tests:

```bash
mvn clean test
```

---

## How to Build the Project

To compile, test, and package the project into an executable JAR file:

```bash
mvn clean package
```

The compiled JAR file will be generated in the `target/` directory:

```text
target/jenkins-test-1.0-SNAPSHOT.jar
```

## How to Run the Application

### Option 1: Run with `java -jar`

After packaging:

```bash
java -jar target/jenkins-test-1.0-SNAPSHOT.jar
```

### Option 2: Run directly with Java classpath

After compiling:

```bash
java -cp target/classes com.example.App
```
