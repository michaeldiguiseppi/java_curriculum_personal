# Setting Up a Java Development Environment

1. Install [Java8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To confirm, run `java -version`. The computer should display `java version "1.8.0_XX".
1. Install [Gradle](http://www.gradle.org/) using `brew update` then `brew install gradle`. 
To confirm, run `gradle -version`. The computer should display `Gradle 2.XX`.

# Java Challenges

While developers can choose to model their JavaScript applications after Functional programming or Object Oriented programming, Java will make that decision for you. That's why we are going to take a journey through some basic functionalities of OOP by writing basic Java programs.

By the end of this unit, you should be able to:

1. Create classes
2. Interpret error messages
3. Create methods that return values 
4. Create methods that don't return values
4. Describe encapsulation
5. Describe inheritance and how to override methods in subclasses
6. Write simple type casting
7. Write/consume interfaces

# Java Challenges

OO and algorithm challenges in Java.

## Setup

Make sure you have gradle installed:

```
brew update
brew install gradle
```

Configure the gradle build daemon, for faster builds:

```
touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties
```

## Running tests

Run all tests with:

```
gradle test
```

Run a single test with:

```
gradle test --tests challenges.MathServiceTest
```

## Resources

* https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_test