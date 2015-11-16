# Setting Up a Java Development Environment

1. Install [Java8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To confirm, run `java -version`. The computer should display `java version "1.8.0_XX".
2. Install [IntelliJ Community Edition](http://www.jetbrains.com/idea/download/) or [Eclipse](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/R/eclipse-java-luna-R-win32-x86_64.zip)
3. Install [Gradle](http://www.gradle.org/) using `brew update` then `brew install gradle`. 
To confirm, run `gradle -version`. The computer should display `Gradle 2.XX`.

# Java Challenges

While developers can choose to model their JavaScript applications after Functional programming or Object Oriented programming, Java makes that decision for you and it always chooses Object Oriented. That's why we are going to take a journey through some basic functionalities of OOP by doing stuff. By the end of this unit, you should be able to:
1. Create classes
2. Interpret error messages
3a. Create methods that return values 
3b. Create methods that don't return values
4. Understand encapsulation
5. Understand inheritance and how to override methods in subclasses
6. Write simple type casting
7. Write/consume interfaces