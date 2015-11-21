http://docs.oracle.com/javase/tutorial/java/TOC.html

```
javac AClass.java
java AClass
```

http://docs.oracle.com/javase/tutorial/java/TOC.html

Great Quiz:

http://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html

http://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_variables.html

http://docs.oracle.com/javase/tutorial/java/javaOO/QandE/creating-questions.html

method signatures

1.What are 3 primitive data types supported by the Java programming language?
Possible Answers: byte, short, int, long, float, double, boolean, char

2.What is the difference between an Array and an ArrayList
Possible Answer:Arrays have a fixed length and an ArrayList can be added on to

3.When creating a method , what does the keyword void do?
Possible Answer:It tells the compiler that the function does not return a value.


Examples:

Inheritance:

- Employees
  - all have names (state)
  - Managers
  - Individual Contributors

- Logger
  - Log to a file
  - Log to STDOUT
  - Log to a database
  - All have common things such as log levels (WARN, DEBUG, etc...) and formats

Polymorphism (one thing, many forms | one idea, many implementations)

- Compile time
  - HTMLTag Builder
    - you can instantiate with a self-closing tag, or not (overloading)
- Runtime
  - ETL (extract, transform, load)
    - you can override methods in each
    - Multiple extractors
    - Multiple transformers
      - CSV transformer
      - TSV transformer
    - Multiple loaders
    - one class that can take them, run them, report errors and log
