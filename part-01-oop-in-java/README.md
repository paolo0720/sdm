# Part 04 – OOP in Java

This lecture translates Object-Oriented Programming (OOP) theory into practical Java implementation. It covers how to define classes, manage object lifecycles, organize code into packages, and use advanced features like inheritance and interfaces.

## Content
- **Classes and Objects**:
    - **Members**: Instance variables (fields) and instance methods.
    - **Object Lifecycle**: Creation using `new`, memory allocation in the **Java Heap Space**, and the role of the **Garbage Collector**.
    - **Constructors**: Default constructors, overloading, and chaining using `this()`.
- **Method Semantics**:
    - **Parameter Passing**: Java uses **call-by-value** (for references, this is often called **call-by-sharing**).
    - **Overloading**: Multiple methods with the same name but different signatures.
- **Static Members**: Variables and methods belonging to the class rather than instances (utility classes).
- **Organization**:
    - **Packages**: Managing namespaces and hierarchical structures.
    - **Imports**: Using simple names vs. fully-qualified names.
    - **java.lang**: The core package imported by default.
- **Inheritance and Extension**:
    - Using `extends` to establish **is-a** relationships.
    - The `Object` class as the root of all Java hierarchies.
    - **Method Overriding**: Redefining superclass behavior and using `super`.
    - **Polymorphism**: Dynamic dispatch/late binding at runtime.
- **Access Control and Encapsulation**:
    - Modifiers: `public`, `protected`, `private`, and the default (package-private).
    - Data hiding and the importance of choosing the most restrictive access level.
- **Advanced Modifiers**:
    - `final`: Preventing extension (classes) or overriding (methods).
    - `abstract`: Forcing extension (classes) or implementation (methods).
- **Interfaces**:
    - Defining "what" a class must do vs. "how" it does it.
    - Implementing multiple interfaces and interface extension.
    - **Anonymous Classes**: Inline implementations of interfaces or class extensions.
- **Conceptual Comparison**: Duck typing (Python) vs. explicit polymorphism (Java).

## Exercises
- **Calculator**: Implementing a calculator that sends output to a `Display` interface.
- **Collections**: Implementing `Stack` and `List` interfaces using both inheritance and composition.
- **Script Runner**: Conceptual implementation of a script interpreter.

## Learning Objectives
By the end of this part, students are expected to:
- Implement robust, encapsulated classes with appropriate constructors and access modifiers.
- Design class hierarchies using inheritance and interfaces to leverage polymorphism.
- Understand memory management and how Java handles method calls and parameters.
- Organize complex projects using packages and external libraries (JAR files).