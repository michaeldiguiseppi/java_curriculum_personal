# Setting Up a Java Development Environment

1. Install [Java8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To confirm, run `java -version`. The computer should display `java version "1.8.0_XX".
1. Install [Gradle](http://www.gradle.org/) using `brew update` then `brew install gradle`. 
To confirm, run `gradle -version`. The computer should display `Gradle 2.XX`.

# Overview

While developers can choose to model their JavaScript applications after Functional programming or Object Oriented programming, Java will make that decision for you. That's why we are going to take a journey through some basic functionalities of OOP by writing basic Java programs.

By the end of this unit, you should be able to:

1. Create classes
1. Interpret error messages
1. Create methods that return values 
1. Create methods that don't return values
1. Work with Arrays and HashMaps
1. Describe encapsulation
1. Describe inheritance and how to override methods in subclasses
1. Write simple type casting
1. Write/consume interfaces (Describe polymorphism/abstraction)

# Zombie Apocalypse

![Zombie Apocalypse](http://vignette2.wikia.nocookie.net/zombie/images/4/41/Zombiegroup02.jpg/revision/latest?cb=20100111201702)

My worst nightmare has come true-- Zombies are taking over the world! Turns out, Galvanize students are the only ones who can help. Good thing we've got a bunch of those.

**Your task:** Write a program that fulfills several tests developed by the CDC so we can keep track of the Zombies, identify their victims, and learn Java doing it! It's the only way we can end the carnage and reestablish peace. Get going!

### CDC's Instructions

Start by forking and cloning this repo.

You should see a folder called `src`, which contains a `main` folder and a `test` folder. The former contains the code you will be implementing and the former contains the test file you'll be checking your work against. Explore both folders. 

Let's go over the `ZombieTest.java` file first.

```
@Test
public void createZombie_ShouldHaveName() {
	Zombie zombie = new Zombie("Killer");
    assertEquals("Killer", zombie.name);
}
```

You'll see that each test starts with an `@Test` suffix. Each test is a method whose name gives a good hint as to what should happen if the test method is executed successfully. For example, `createZombie_ShouldHaveName()` means that once you create a Zombie, it is expected that that Zombie has a name. The `assertEquals()` method takes two parameters, testing to see if they're the same with the following syntax: `assertEquals([message,] expected, actual)`.

Now that we understand the tests, let's take a look at the various files in the main folder.




### Running the Tests

Make sure you have gradle installed:

```
brew update
brew install gradle
```

Configure the gradle build daemon, for faster builds:

```
touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties
```

Run all tests with:

```
gradle test
```

<!-- 
Run a single test with:

```
gradle test --tests challenges.MathServiceTest
``` -->

## Resources

* https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_test
