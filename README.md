# Calculation Application Using Executor Framework

The **Executor Framework Application** is a Spring Boot application that demonstrates concurrent execution of various calculation tasks using Java's ExecutorService.

## Table of Contents

- [Overview](#overview)
- [Setup](#setup)
- [Usage](#usage)
- [Endpoints](#endpoints)

## Overview

This application utilizes Spring Boot and Java's Executor framework to perform concurrent calculations for tasks such as square, cube, factorial, checking for even numbers, prime numbers, Armstrong numbers, palindrome numbers, and reversing numbers.

## Setup

1. To run this application locally, ensure you have Java 21 and Gradle installed.
2.  Clone this repository and navigate to the project directory.
```bash
git clone `https://github.com/Jayesh2026/AssessmentTask_3_CalculationApplicationUsingExecutorFramework.git`
```
4.  Then, run:

```bash
`./gradlew bootRun`
```
- The application will start on localhost:8081.

## Usage
Once the application is running, you can trigger the execution of all tasks by making a GET request to the following endpoint:

`GET localhost:8080/calculation/run`

This will execute all calculation tasks concurrently using an ExecutorService with a fixed thread pool of 8 threads.

## Endpoints
The application provides the following endpoint:

GET `/calculation/run`: Initiates the execution of all calculation tasks concurrently.

## Additional Notes:
Dependencies: The project uses Spring Boot for dependency management and provides a REST API endpoint (`/calculation/run`) to trigger the execution of calculation tasks.

Concurrency: Tasks are executed concurrently using Java's ExecutorService to maximize efficiency.
