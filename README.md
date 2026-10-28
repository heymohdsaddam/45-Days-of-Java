# ☕ 45 Days of Java

A hands-on Java learning journey covering core programming concepts, object-oriented programming, exception handling, modern Java features, collections, multithreading, and Stream API.

This repository documents my progress as I learn Java through practical coding examples. Each program includes comments to explain the code, its logic, and important concepts.

## 🎯 Objectives

- Strengthen my understanding of Core Java.
- Learn object-oriented programming through practical examples.
- Understand how Java handles exceptions and errors.
- Explore collections, multithreading, and functional programming.
- Practice modern Java language features.
- Build a consistent coding habit and document my learning journey.

## 📚 Topics & Learning Notes

### 1. Core Java — `CoreJava/`

**Core Java** provides the foundation for writing Java applications.

Topics to understand:
- Java syntax and program structure
- Variables, data types, and type casting
- Operators and expressions
- Conditional statements and loops
- Methods and arrays
- Strings and basic input/output

**Key takeaway:** A strong understanding of Java fundamentals makes advanced concepts easier to learn and apply.

### 2. Object-Oriented Programming — `Oops/`

**Object-Oriented Programming (OOP)** organizes programs around objects that contain data and behavior.

Four pillars of OOP:
- **Encapsulation:** Bundling data and methods together while controlling access.
- **Inheritance:** Creating a class from an existing class to reuse or extend behavior.
- **Polymorphism:** Allowing the same interface or method call to have different behaviors.
- **Abstraction:** Hiding implementation details and exposing essential functionality.

Other important concepts:
- Classes and objects
- Constructors
- Method overloading and overriding
- `this` and `super`
- Static members
- Abstract classes and interfaces

**Key takeaway:** OOP helps create modular, reusable, and maintainable Java code.

### 3. Enums, Lambda Expressions & Exceptions — `EnumLambdaException/`

This section brings together language features and error-handling concepts.

- **Enums:** Represent a fixed set of named constants.
- **Lambda expressions:** Provide a concise way to implement functional interfaces.
- **Exceptions:** Represent conditions that interrupt normal program execution.

Important exception-handling concepts:
- `try`, `catch`, and `finally`
- `throw` and `throws`
- Checked and unchecked exceptions
- Custom exceptions
- Functional interfaces and lambda syntax

**Key takeaway:** These features improve code clarity, make error handling more structured, and support functional-style programming.

### 4. Stream API — `Stream_API/`

The **Stream API** processes data from collections and other sources using a sequence of operations.

Important concepts:
- `filter()` for selecting elements
- `map()` for transforming elements
- `sorted()` for ordering elements
- `distinct()` for removing duplicates
- `forEach()` for performing an action on each element
- `reduce()` for combining elements into a result
- `collect()` for gathering results
- Intermediate and terminal operations

**Key takeaway:** Streams make many collection-processing tasks more expressive and readable. A stream does not store data itself; it processes data from a source.

### 5. Threading & Collections — `ThreadingCollections/`

This section covers two important areas of Java development.

**Multithreading**
- Threads and the `Thread` class
- The `Runnable` interface
- Thread lifecycle and execution
- Synchronization
- Race conditions and shared data
- Basic concurrency concepts

**Collections Framework**
- `List`, `Set`, and `Map`
- Common implementations such as `ArrayList`, `HashSet`, and `HashMap`
- Iterating over collections
- Choosing data structures for different requirements

**Key takeaway:** Collections help manage groups of objects, while multithreading allows multiple tasks to make progress concurrently. Shared mutable data requires careful synchronization.

### 6. `var`, Sealed Classes & Records — `VarSealedRecord/`

This section explores selected modern Java language features.

- **`var`:** Allows local variable type inference when the compiler can determine the type from the initializer.
- **Records:** Provide a concise way to declare classes primarily intended to carry data.
- **Sealed classes:** Restrict which classes or interfaces may extend or implement a type.

**Key takeaway:** Modern Java features can reduce boilerplate and make code more expressive while preserving type safety.

Note: The exact Java version required depends on the features used. Records became a permanent feature in Java 16, sealed classes in Java 17, and local-variable type inference in Java 10.

## 💻 How to Run the Programs

1. Clone the repository:

   ```bash
   git clone https://github.com/heymohdsaddam/45-Days-of-Java.git
   ```

2. Open the project in your preferred Java IDE or code editor.

3. Make sure the required JDK version is installed.

4. Navigate to the relevant folder and open the Java source file you want to explore.

5. Compile and run a standalone Java program:

   ```bash
   javac ProgramName.java
   java ProgramName
   ```

   Replace `ProgramName` with the actual class name. Programs using packages or multiple source files may require a different command or IDE configuration.

## 📝 How to Use This Repository

- Start with Core Java if you are a beginner.
- Study the OOP concepts before moving to advanced topics.
- Read the comments in each Java program to understand its logic.
- Run the examples yourself and experiment with different inputs.
- Compare related concepts by studying their implementations.
- Revise the notes and revisit programs whenever needed.

## 🌱 My Learning Philosophy

I believe that learning Java requires more than memorizing syntax. Writing code, understanding why it works, experimenting with it, and explaining the logic are essential parts of the learning process.

This repository is my record of that process, one program and one concept at a time.

## 👨‍💻 Author

**Mohd Saddam**

GitHub: [@heymohdsaddam](https://github.com/heymohdsaddam)

---

⭐ If you find this repository useful for learning Java, consider giving it a star.
