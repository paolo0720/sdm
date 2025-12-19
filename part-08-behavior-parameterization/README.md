# Part 08 – Behavior parameterization

This lecture introduces **behavior parameterization**, a powerful software development pattern that allows a method to receive different behaviors as parameters. This concept is the foundation for modern Java features like lambda expressions and the Streams API.

## Content
- **Types of Parameterization**:
    - **Data Parameterization**: Passing values (e.g., `int`, `String`).
    - **Parametrized Types (Generics)**: Specifying types of data upon which classes/methods operate.
    - **Behavior Parameterization**: Passing an object that implements a behavior (e.g., a `Comparator` or `Runnable`).
- **Design Patterns and Principles**:
    - **Strategy Pattern**: Using composition to swap algorithms at runtime.
    - **Template Method**: Using inheritance to defer specific steps to subclasses.
    - **Open-Closed Principle**: Software entities should be open for extension but closed for modification.
- **Lambda Expressions**:
    - **Definition**: Concise implementations of **Functional Interfaces** (interfaces with exactly one abstract method).
    - **Syntax**: Arrow notation (`->`), parameter inference, and block vs. expression styles.
    - **Capturing Lambdas**: Accessing variables from the enclosing scope (must be `final` or effectively final for local variables).
- **Method References**:
    - Shorthand syntax (`::`) for lambda expressions that simply call existing methods.
    - Types: Static method references, instance method references (of a particular object or an arbitrary object), and constructor references (`new`).
- **The `java.util.function` Package**:
    - Core interfaces: `Function<T, R>`, `Consumer<T>`, `Supplier<T>`, `Predicate<T>`.
    - Variations: `BiFunction`, `UnaryOperator`, `BinaryOperator`.
    - Primitive specializations (e.g., `ToIntFunction`, `DoubleConsumer`) for performance.

## Exercises
- **Term Frequency Revisited**: Reimplementing the previous exercise using lambda expressions and method references to support flexible sorting strategies.

## Learning Objectives
By the end of this part, students are expected to:
- Write flexible code that can accept behavior as a parameter.
- Understand and apply the Strategy and Template Method design patterns.
- Master lambda expression syntax and understand the "effectively final" restriction.
- Use method references to make code more readable and concise.
- Leverage the standard functional interfaces provided by the Java API.
