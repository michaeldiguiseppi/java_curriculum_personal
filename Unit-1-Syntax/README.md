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
 - Notice: the filename's first character is capitalized. This is a Java convention for naming files.

Okay - it takes a lot more to write a hello world in Java than Javascript. So now that we have a '.java' file, how do we run it?

## Java is Compiled

JavaScript code is initially **interpreted**. This is convenient because we can just send the code *as it is written* to a browser, the browser will read and execute the code line by line.

**You Do:** Use node to interpret our `hello.js`:

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

**We Now Know:**
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

`main` is a special method that executes whenever you run the class using the `java` command. So when we typed `java Hello` we essentially said, "execute the main method in the class named Hello".

**You Do:** Try playing around with the `main` method in your `Hello` class. See what happens when you try to print `1 + 1` or `"hello" + 555`. Try to print multiple lines.

**We Now Know:**
 - Java code must be contained within a `class`.
 - A class may contain methods.
 - The `main` method is a special method that is executed when you run the class file with the `java` command.

So, we now understand what some of the code means, but there's still a lot left that hasn't been explained.


## Types and Methods

JavaScript is **dynamically typed**,  you don't have to tell the interpreter anything about which data _types_ exist, which _type_ a variable contains or which _type_ a function is going to return.  JavaScript just figures it out automatically. So you can write code like this:

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

In addition, once a variable has been declared its type cannot be changed.

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

Java has both **primitive** and **reference** types.

Here is a chart of the most commonly used primitive types:

<table>
  <tr>
    <th>Type</th>
    <th>Precision</th>
    <th>Example</th>
  </tr>
  <tr>
    <td>`int` & `long`</td>
    <td>natural numbers</td>
    <td>0, -10, 2, -2000, 10, 1</td>
  </tr>
  <tr>
    <td>`float` & `double`</td>
    <td>floating point numbers</td>
    <td>3.14156f, -52f, 59957422.234234f</td>
  </tr>
  <tr>
    <td>`boolean`</td>
    <td>binary logic</td>
    <td>true, false</td>
  </tr>
  <tr>
    <td>`char`</td>
    <td>A single Unicode character</td>
    <td>'a', 'b', 'c'</td>
  </tr>
  <tr>
    <td>`String` (see note)</td>
    <td>A string of chars</td>
    <td>"abcdefg", "hello world", "i am immutable"</td>
  </tr>
</table>

 - **notice:** `char`s are single-quoted while `String`s are double-quoted.
 - **notice:** `String`s are actually a reference type, but they have the behavior of a primitive type.

**We Now Know:**
 - methods must have a return type.
  - if a method does not return anything, it must have a return type of `void`.
 - variables must have a type.
 - parameters must have a type.

Things are starting to come together now! We've written our own method, we could take our applications a lot further if we knew how to use variables…

## Variables

Javascript makes variable declarations are fairly straightforward,

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

When we declare a variable inside a method these are known as **local variables** and can only be used within that method.

**You Do**: Convert the following Javascript function into Java and add it to `Ops.java`
 - Test it in your `main` method.
 - **Hint:** `i` seems like a local variable.

```javascript
function power(x){
  int y = 2;
  for(var i = 0; i < y; i++){
      x = x * x;
  }
  return x;
}
```

**We Now Know:**
 - variables must have a type.
 - variables declared inside of methods are known as local variables.

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

  // We can create instance level variables.
  // These can be used anywhere in the class
  public String first;
  public String last;

  // Constructor Method.
  // We invoke this using the new keyword instantiate an object.
  // It does not need a return type.
  public Person(String first, String last) {
    // since the instance variable `first`
    // "shadows" the parameter `first`, you need to use `this.first`
    this.first = first;
    this.last = last;
  }

  // the `fullName` method is added inside the class definition
  // NOTE that you do not need `this` here (but it is recommended practice)
  public String fullName() {
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

Woah, that is cool. We used `Person` as a type for our variable `rambo`, just like we can use `int` or `String`.

```java
Person rambo;
int foo;
String bar;
```

One other thing to notice is we declared variables `first` & `last` at the top of the class file:

```java
//filename: Person.java
public class Person{

  public String first;
  public String last;
  //..
}
```

These are known as **instance variables**. They can be used in any _non-static_ method or constructor within the entire class. They can be used just by name (unless a parameter or variable in the method has the same name):

```java
public String fullName() {
  return first + " " + last;
}
```

As a better practice though, we can refer to them using `this` (which will be discussed more later).

```java
public String fullName() {
  return this.first + " " + this.last;
}
```

**You Do:** Reread the `Person` class example now that some of the parts have been explained.

**You Do:** Recreate the following Javascript object using Java:

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

You might have had more trouble than you expected, that is because there are a few major differences:

<table>
  <tr>
    <th>JavaScript</th>
    <th>Java</th>
  </tr>
  <tr>
    <td>Every function _can_ be called as a constructor (using `new`)</td>
    <td>Classes and constructors are separate</td>
  </tr>
  <tr>
    <td>you can define properties right inside the constructor</td>
    <td>properties (called "fields" or "instance variables") need to be defined as part of the class definition</td>
  </tr>
  <tr>
    <td>you have to add methods to the prototype</td>
    <td>you cannot define new fields at runtime, like you can with JavaScript objects</td>
  </tr>
  <tr>
    <td>you can add properties at any point</td>
    <td>methods are defined inside the class definition</td>
  </tr>
  <tr>
    <td>you _must_ use `this` to refer to properties inside methods</td>
    <td>you don't need `this` unless there's parameter shadowing happening</td>
  </tr>
</table>


**We Now Know:**
 - Classes are blueprints for objects.
 - Classes can be used as types.
 - Constructors are named the same as the class.
 - Constructor definitions do not have a return return type.
 - Objects are instantiated / created by invoking the constructor.

## Static vs. Instance

Notice how we didn't use **static** inside our class. Static methods and variables can be used without instantiating (creating) the object from the class. On the other hand, non-static variables and methods are only accessible from an instantiated object.

Static is really useful for creating utility objects or libraries, where you want to use methods without having to invoke the constructor:

```java
// Math is a class that comes with Java.
// Math.random() is a static method.
// This means we can use it without instantiating the Math object.
if( Math.random() < 0.5 ){
  // do stuff
}
```

Static variables can also be useful, these are known as **Class Variables**. Class variables are like instance variables, but instead are static.

```java
//filename: PageCount.java
public class PageCount{

  // create a class variable called count
  public static int count = 0;

}

//filename: MyApp.java
public class DemoApp{

  public static void main(String[] args){

    System.out.print('PageCount starting value: ');
    System.out.println(PageCount.count);

    PageCount.count++;
    PageCount.count++;

    System.out.print('PageCount ending value: ');
    System.out.println(PageCount.count);
  }

}
```

On the other hand, static fields are dangerous on objects that should be unique:

```java
//filename: User.java
public class User{

  public static String userName;

  public User(String _userName){
    userName = _userName;
  }

}

//filename: DemoApp.java
public class DemoApp{

  public static void main(String[] args){

    // create User with name Chewbacca
    User chewie = new User("Chewbacca");

    System.out.println(chewie.userName);// prints Chewbacca
    System.out.println(User.userName);  // prints Chewbacca

    // create User with name Vadar
    User vadar = new User("Vadar");

    System.out.println(vadar.userName); // prints Vadar
    System.out.println(chewie.userName);// prints Vadar
    System.out.println(User.userName);  // prints Vadar
  }
}
```

Notice how both `User` and `Chewie` print "Vadar". This is because static fields belong to the class and not the object instances, so all object instances will share the same static variable.

**You Do:** Describe when you would want a method or variable to be static (class fields) and when you would want it to be non-static (instance fields).

**We Now Know:**
 - Static fields are attached to the class.
 - Static fields can be used with out instantiating the class (without constructing an object.)
 - Static fields are shared across all object instances constructed from the class.
 - Static variables are known as Class variables.
 - Instance fields are attached to the object instances constructed from the class.
 - Instance fields are unique to each instance of the object.


## Java has a simpler `this`

In JavaScript, the `this` keyword is determined by a complex set of rules based on how the function was _invoked_.

```javascript

var demoObject = {
    printMe: function(){
      // this refers to demoObject
      console.log(this);
    },
    printOther: function(){
      setTimout(function(){
        // this refers to set timeout
        console.log(this);
      }, 1);
    }
};

demoObject.printMe();
demoObject.printOther();
```

In Java, `this` is very simple - it always just refers to that _instance_.

```java
//filename: DemoApp.java
public class DemoObject {

  public int foo;

  public DemoObject(int _foo){
    // this = object instance
    // this.foo = object instance variable
    this.foo = _foo;
  }

  public void printMe(){
    // prints the memory address and type of the object instance
    System.out.println(this);
  }

  public void printFoo(){
    // prints the value of the object instance's foo variable
    System.out.println(this.foo);
  }

  public static void main(){

    DemoObject objOne = new DemoObject(1);
    objOne.printMe();
    objOne.printFoo();

    DemoObject objTwo = new DemoObject(2);
    objTwo.printMe();
    objTwo.printFoo();
  }
}
```

**You Do:** Think of one instance where you battled `this` in Javascript.

That won't happen in Java.

**We Now Know:**
  - `this` is predictable and consistent in Java.
  - `this` always refers the object instance.

## Java properties and method invocations

In JavaScript, a function is a reference. If you reference a function, but don't _invoke_ it with parenthesis, you just get a reference to the function:

```js
var foo = function(){};
var bar = foo; // bar is a reference to the `foo` function
bar();
```

In Java, a method is a field that cannot be referenced, only invoked. If you call a method name without parenthesis, it will think it is a _variable_. This allows us to have variables that share the same name as a method, Java will differentiate:

```java
public class Car {

  public int miles = 0;

  public int miles() {
    return 12;
  }

  public static void main(String[] args){
    Car car = new Car();
    // miles variable
    System.out.println( car.miles ); // prints 0
    // miles() method
    System.out.println( car.miles() ); // prints 12
  }
}
```

**You Do:** Write down the answer to the following question:
  - If methods cannot be referenced, can Java have higher order functions (methods passed into methods)?

**We Now Know:**
  - Methods are not references.
  - Variables cannot have a method as a value.
  - Methods cannot be passed into other methods.

## Java Arrays

In JavaScript, Arrays are objects. You can add as many properties (indices) as you want, and you can put whatever you want into them, like so:

```js
var a = []
a.push("a string")
a.push(1)
a.push(true)
a.push({some: "object"})
```

In Java, Arrays are extremely primitive. They have no methods; only a `length` property. You have to tell Java both _how many_ things you want to put in the Array, and also _what type_ the things are.

Here the general syntax for how you would create an array:

```
<item type in array> [] <name> = new <item type in array> [ <max items in array> ];
```

So if I wanted to create an array to contain 10 Strings:

```java
String [] myArray = new String [10];
```

Here is another example:

```java
// creates an array that will only take Strings, and will only take 4 items
String [] names = new String[4];
// even though we haven't put anything in the array, it has a length of 4
System.out.println(names.length); // 4

// put string "Hello" in the 0th index;
names[0] = "Hello";
// put string "Wrold" in the 1st index;
names[1] = "World";

// length is still 4, even though we put 2 items in it.
System.out.println(names.length); // 4
// prints the memory address
System.out.println(names); // [Ljava.lang.String;@7852e922
```

NOTE: `System.out.println` is not _quite_ as nice as `console.log` is in JavaScript. See [here](http://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array) for some ways to print arrays in a more useful way.

Java arrays don't have much functionality built in. There are classes such as `ArrayList` that provide additional functionality.

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

// array of type array of type String.
String[][] fullNames = {
  {"First", "Su"},
  {"Last", "Sylvester"},
};
System.out.println(fullNames[0][0]);
```

**You Do:** Create a class called ArrayDemo with a main method.
 - Create an array of ints with a length of 10.
 - Create an array of Strings using literal syntax.
  - It contains Strings "Han Solo", "Luke Skywalker", "R2D2"

**We Now Know:**
 - Java arrays do not have helper methods.
 - Java arrays have a specified length.
 - Java arrays may only contain a single type.
 - Java array literal syntax uses curly braces.

## Resources

- http://www.open.ac.uk/StudentWeb/m874/!synterr.htm

## A quick comic strip

![](http://i.imgur.com/76Wtthy.jpg)
