# From JavaScript to Java

Upon first glance, Java and Javascript seem to be similar languages. Each contains the word java in their names and they both share a similar C style syntax. A deeper look reveals that this observation is incorrect; there are several distinctive differences between the languages.

Since most of the similarities are self evident, let's write some code that highlights the differences while leveraging the similarities. This way we can begin to understand Java having only learned Javascript.

## Objectives

By the end of this lesson you should be able to:

- Understand the differences between a statically typed language and a loosely typed language.
- Compile and run basic Java programs
- Convert basic JavaScript program to Java programs

## Hello Java!

In Javascript, a hello world can be expressed in a single expression:

```javascript
// filename: hello.js
console.log('Hello, Javascript!');
```

**You Do:** Create a file called `hello.js` and fill it with the code in the above example.


In Java, it takes a lot more than a single expression:

```java
// filename: Hello.java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello, Java!");
    }

}
```

**You Do:** Create a file called `Hello.java` and fill it with the code from the above example.
 - Tip: You are here to learn and become a strong developer, instead of copying and pasting the provided code type it up.
 - Notice: the filename's first character is capitalized. This is a very common Java convention for naming files.

Okay - it takes a lot more to write a hello world in Java than Javascript. So now that we have a '.java' file, how do we run it?

## Java is Compiled

JavaScript code is initially **interpreted**. This is convenient because we can just send the code *as it is written* to a browser, the browser will read and execute the code line by line.

**You Do:** We can use node to interpret our `hello.js`:

```bash
node hello.js
// prints: Hello, Javascript!
```

Java works a bit different. Java code is **compiled** to **bytecode**. Bytecode is a set of instructions that a machine can understand. We can then use the Java Virtual Machine (JVM) to **execute** the compiled bytecode. This is really nice, because we can run our Java code anywhere we can have a JVM.

**You Do:** So in order to run our `hello.java` we first have to compile it. We can do that using the `javac` (**java c**ompiler) command:

```bash
javac Hello.java
```

**You Do:** If there was no visible output, great! You did everything correct. Javac took our `hello.java` and compiled it to bytecode stored a file named `Hello.class`. Check that the file is there using the `ls` command.

**You Do:** Now that we have the bytecode we can tell the Java Virtual Machine (JVM) to execute it using the `java` command:

```bash
java Hello
// prints: Hello, Java!
```
 - notice: We didn't type the `.class`. The java command knows it is looking for a `class` file so we can just type the name of the file without the extension.

You should now see our lovely output of `Hello, Java!`. Good work.

We now know:
 - Java is compiled to bytecode, a type of machine readable code.
 - The Java Virtual Machine (JVM) executes the bytecode.
 - Javascript is interpreted, the JS engine reads and executes the code line by line as it is written.

Now that we can compile and run Java, what the hell does all this code mean?

## Quick and dirty break down

The Java hello world program seems to have a lot of stuff. Let's break it down and see what it all means.

```java
//filename: Hello.java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello, Java!");
    }

}
```

In Java, all code must be wrapped within a **class**. An example class definition would look like this: `public class ClassName`. We'll talk more about what a class is, and why they can be useful later on. So in our `Hello.java` we define our class with this line of code:

```java
// define a class that is named Hello
public class Hello {
// … other stuff …
}
```

A class can contain **methods**, in this case we have a method named `main`.
```java
//define a method called main
//it expects a parameter called args
public static void main(String [] args){
//… method body goes here
}
```

we can compare this to the equivalent Javascript:

```javascript
// define a function called main
// it may take a parameter called args
function main(args){
    //..function body goes here
}
```

main is a special method that executes whenever you run the class using the `java` command. So when we typed `java Hello` we essentially said, "execute the main method in the class named Hello".

**You Do:** Try playing around with the `main` method in your `Hello` class. See what happens when you try to print `1 + 1` or `"hello" + 555`. Try to print multiple lines.

We now know:
- Java code must be contained within a class.
- A class may contain methods.
- The main method is a special method that is executed when you run the class file with the `java` command.

So, we now understand what some of the code means, but there's still a lot left that hasn't been explained.


## Java is Statically Typed

JavaScript is **dynamically typed**,  you don't have to tell the interpreter anything about which data _types_ exist, which _type_ a variable contains or which type a function is going to return.  JavaScript just figures it out automatically. So you can write code like this:

```javascript
function add(x, y) {
  return x + y;
};

var resultOne = add(1, 2) // => 3
var resultTwo = add('hello', 'world') // => helloworld
```

Java is **statically typed**, meaning you need to explicitly specify the _type_ of the following:

- variables
- parameters of methods
- return values of methods
- Arrays, HashMaps etc…

Let's show an example, I want to declare a method named `sum` that returns an `int`:

```java
//define a method called sum that returns an int
public static int sum ( /* params go here */ )
```

Now to take it one step further, I want it to to have a parameter named x that is a type `int` and a parameter named y that is type `int`:

```java
// define a method called sum that returns an int
// it has a parameter named x that is of type int
// it has a parameter named y that is of type int
public static int sum (int x, int y)
```

**You Do:** create a file called `Ops.java` with the following code. Compile and execute.
 - Tip: You are here to learn and become a strong developer, instead of copying and pasting the provided code type it up.

```java
//filename: Ops.java
// define a class called Ops
public class Ops {

  // define a method called sum
  // this method returns an int
  // it has a parameter named x that is of type int
  // it has a parameter named y that is of type int
  public static int sum(int x, int y) {
    return x + y;
  }

  // main gets executed when we run this class with the java command
  public static void main(String [] args){
    // invoke sum, passing in 1 and 2 as arguments and print the results
    System.out.println( sum(1, 2) );
  }

}
```

**You Do:** Add a method to `Ops.java` called `multiply`.
  - It has 3 parameters that are all of type `int`.
  - It returns a type `int`.
  - Invoke and print `multiply` in the `main` method.

**You Do:** Take a minute to figure out what `main` returns, write it down before reading ahead.

In JavaScript, all functions return a result. If no return statement is provided in the function it will return `undefined`.

```javascript
function helloWorld(){
    console.log('Hello, World!');
}
helloWorld();
// => returns undefined
```

In Java, we must specify that a method does not return anything by setting the return type to `void`. `main` does not return anything, so it always has a return type of `void`.

```java
public static void main(String [] args ){
  //...
}
```

Java has both **primitive** and **reference** types. Here is a list of some common types with simplified definitions:

  - **int:** primitive, natural numbers: 10, 0, 1, 3, 5 etc...
  - **float:** primitive, decimal numbers: 3.1415 , 1.0, -17.4 etc...
  - **double:** primitive, floats with higher precision.
  - **char:** primitive, single characters: 'a', 'b', 'c', etc...
    - **notice:** `char`s are single-quoted.
  - **String:** reference, 0 or more characters grouped together: "Hello", "How are you?"
    - **notice**: `String`s are double-quoted.

We now know:
 - methods must have a return type.
  - if a method does not return anything, it must have a return type of `void`.
 - variables must have a type.
 - parameters must have a type.

Things are starting to come together now! We've written our own method, we could take our applications a lot further if we knew how to use variables…

## Variables

Javascript makes variables declarations are fairly straightforward,

```javascript
var myVar = 'Javascript variables are easy!';
```

Instead of using **var** or **let** in Java we put what **type** we would like to use,

```java
//filename: Ops.java
public class Ops {

  public static int sum(int x, int y) {
    return x + y;
  }


  public static void main(String [] args){

    // declare a variable called first of type int
    int first;

    //assign first a value of 1
    first = 1;

    // declare a variable called second of type int
    // assign it a value of 2
    int second = 2;

    // declare a variable called result of type int
    int result = sum(first, second);

    // print the value stored in variable result

    System.out.println(result);

  }
}
```

## Classes

In Javascript, when we want to create a reusable Object we create a **prototype**, and then we invoke the constructor to get a usable object.

```js
// create constructor for Person
function Person(first, last) {
  // create fields first and last
  this.first = first;
  this.last = last;
}

// create prototype method for Person
Person.prototype.fullName = function () {
  return this.first + " " + this.last;
};

// create a new Person by invoking the constructor
var will = new Person("Will", "Schuester");

// invoke the Method
will.fullName();
```

In Java, we create reusable objects using **classes** we still need to invoke the constructor:

```java
//filename: Person.java
public class Person {

  //We can create class level variables
  public String first;
  public String last;

  // Constructor Method. We invoke this using the new keyword instantiate an object.
  Person(String first, String last) {
    // since the instance variable `first`
    // "shadows" the parameter `first`, you need to use `this.first`
    this.first = first;
    this.last = last;
  }

  // the `fullName` method is added inside the class definition
  // NOTE that you do not need `this` here
  String fullName() {
    return first + " " + last;
  }

  // we can use the main method to test our class
  public static void main(String[] args){

    // create a variable of type Person
    // invoke the constructor to instantiate / create a new Person object.
    Person rambo = new Person("Sylvester", "Stallone");

    // invoke the method on Rambo
    rambo.fullName();

  }

}
```

**You Do:**  Recreate the following Javascript object using Java:

```javascript
function Rect(width, length){
  this.width = width;
  this.length = length;
}

Rect.prototype.area = function(){
  return this.width * this.length;
}

var myRect = new Rect(100,100);

console.log(myRect.area());
```

You might have had more trouble than you expected, that's because there's a few major differences:

In JavaScript:

- every function _can_ be called as a constructor (using `new`)
- you can define properties right in the constructor
- you have to add methods to the prototype
- you can add properties at any point
- you _must_ use `this` to refer to properties inside methods

In Java:

- classes and constructors are separate
- properties (called "fields" or "instance variables") need to be defined as part of the class definition
- you cannot define new fields at runtime, like you can with JavaScript objects
- methods are defined inside the class definition
- you don't need `this` unless there's parameter shadowing happening

## Java has a simpler `this`

In JavaScript, the `this` keyword is determined by a complex set of rules based on how the function was _invoked_.

In Java, `this` is very simple - it always just refers to that _instance_.


## Java properties and method invocations

In JavaScript, if you reference a function, but don't _invoke_ it with parenthesis, you just get a reference to the function:

```js
var foo = function(){};
var bar = foo; // bar is a reference to the `foo` function
bar();
```

In Java, if you call a method name without parenthesis, it will think it's a _field_.  Otherwise it'll blow up.

```java
public class Car {

  public int miles = 0;

  public int miles() {
    return 12;
  }

  public static void main(String[] args){
    Car car = new Car();
    car.miles; // 0
    car.miles(); // 12
  }
}
```



## Java Arrays are more primitive

In JavaScript, Arrays are objects.  You can add as many properties (indices) as you want, and you can put whatever you want into them, like so:

```js
var a = []
a.push("a string")
a.push(1)
a.push(true)
a.push({some: "object"})
```

In Java, Arrays are extremely primitive.  They have no methods, and only a `length` property.  You have to tell Java both _how many_ things you want to put in the Array, and also _what type_.  Like so:

```java
String[] names = new String[4]; // creates a new Array that will only take Strings, and will only take 4 items
System.out.println(names.length); // 4
names[0] = "Hello";
names[1] = "World";
System.out.println(names.length); // 4
System.out.println(names); // [Ljava.lang.String;@7852e922
```

NOTE: `System.out.println` is not _quite_ as nice as `console.log` is in JavaScript.  See [here](http://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array) for some ways to print arrays in a more useful way.

There are other classes such as `ArrayList` that provide additional functionality.

## Java Array literals use curlies

In JavaScript you can create new arrays using literal syntax like so:

```js
var names = ["Su", "Will"];

var fullNames = [
  ["First", "Su"],
  ["Last", "Sylvester"],
];
```

In Java, Array literal syntax uses curly braces, and you still need to define the _type_ of thing that will go in the array, and also how deeply nested the array will be.

```java
String[] names = { "Su", "Will", };
System.out.println(names[0]);

String[][] fullNames = {
  {"First", "Su"},
  {"Last", "Sylvester"},
};
System.out.println(fullNames[0][0]);
```

## Resources

- http://www.open.ac.uk/StudentWeb/m874/!synterr.htm

## A quick comic strip

![](http://i.imgur.com/76Wtthy.jpg)
