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

As you go through the exercise, try and note the similarities and differences between Java and JavaScript. That'll help you develop a more well-rounded understanding of what language should be used when.

# Zombie Apocalypse

![Zombie Apocalypse](http://vignette2.wikia.nocookie.net/zombie/images/4/41/Zombiegroup02.jpg/revision/latest?cb=20100111201702)

My worst nightmare has come true-- Zombies are taking over the world! Turns out, Galvanize students are the only ones who can help. Good thing we've got a bunch of those.

**Your task:** Write a program that fulfills several tests developed by the CDC so we can keep track of the Zombies, identify their victims, and learn Java doing it! It's the only way we can end the carnage and reestablish peace. Get going!

### CDC's Instructions

Start by forking and cloning this repo.

You should see a folder named `src`, which contains a `main` folder and a `test` folder. The former contains the code you will be implementing and the latter contains the test file you'll be checking your work against. Explore both folders on your own. 

Let's go over the `ZombieTest.java` file first.

```
@Test
public void createZombie_ShouldHaveName() {
	Zombie zombie = new Zombie("Killer");
    assertEquals("Killer", zombie.name);
}
```

You'll see that the tests start with an `@Test` suffix. Each test is a method whose name gives a good hint as to what should happen if the test method is executed successfully. For example, `createZombie_ShouldHaveName()` means that once you instantiate a Zombie, it is expected that it will have a name. The validity of the test is measured with the `assertEquals()` method, which takes two parameters, testing to see if the parameters are the same, using the following syntax: `assertEquals(expected, actual)`.

Now that we understand the tests, let's take a look at the various files in the main/java/challenges folder.

You should find the `Person.java`, `Zombie.java`, and `Human.java` files in the challenges folder. Take note of how they interact with each other. What do you think `Zombie implements Person` means?

While the `Human.java` and `Zombie.java` files are classes, the `Person.java` file is an `interface`. This means that whatever class *implements* the interface will *inherit* the methods and variables created in that interface. The interesting thing about interfaces is that you can't actually instantiate any of the variables or methods. You will have to do that in the classes that implement the interface. This enables something called *abstraction*. 

###### Example of abstraction: 

As you're looking at the files, you should see that they all have at least one thing in common: an isDead() method. However, the two classes(Human and Zombie) also have an `@Override` suffix and some logic in the method. This is inheritance and abstraction at work. Human and Zombie *inherit* the method from the Person interface and define it in their own way. After all, Humans and Zombies are People, right? So, while the Zombie logic is written for you, you will have to write the logic to declare a Human dead. Hint: they're most likely dead if they've been eaten.

Seems like we understand interfaces, inheritance, and abstraction. Let's move onto Constructors.

In order to create/construct a Zombie, you will need to instantiate one. As you can see in the test file, this is done by using the `new` keyword. For Java to understand exactly what you're trying to create, you need to write a constructor method in your Zombie class. This has already been started for you:

```
public Zombie(String name){
}

public Zombie(String name, int health){
}
```
Both of these methods are valid constructors and can be used simultaneously. 




### Running the Tests

COMMENT OUT the tests that you're not working on. After completing one test and recieving a `BUILD SUCCESSFUL` message from gradle, uncomment the subsequent test, one at a time.  

Make sure you have gradle installed:

```
brew update
brew install gradle
```

Configure the gradle build daemon, for faster builds:

```
touch ~/.gradle/gradle.properties && echo "org.gradle.daemon=true" >> ~/.gradle/gradle.properties
```

Run all tests from the root folder with:

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
