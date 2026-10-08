# Part 10 – Streams

This lecture introduces the **Java Stream API**, a powerful tool for processing sequences of elements in a declarative and functional style. The transition from imperative to declarative programming is explored, highlighting the benefits of code readability, maintainability, and parallelization.

### What's the content?

The module covers the fundamental concepts and practical applications of Streams in Java:

-   **Introduction to Streams:** Understanding the difference between Collections (data) and Streams (computation).
-   **Imperative vs. Declarative Processing:** Comparing traditional loop-based approaches with stream-based pipelines.
-   **Stream Pipelines:** The structure of a stream operation, consisting of a source, intermediate operations, and a terminal operation.
-   **Intermediate Operations:**
    -   **Filtering and Slicing:** `filter`, `distinct`, `limit`, `skip`, `takeWhile`, `dropWhile`.
    -   **Mapping:** `map` and `flatMap` (for flattening nested structures).
    -   **Sorting:** `sorted` using natural order or custom `Comparator`.
-   **Terminal Operations:**
    -   **Matching and Finding:** `anyMatch`, `allMatch`, `noneMatch`, `findAny`, `findFirst`.
    -   **Iteration:** `forEach`.
    -   **Reduction:** `reduce` for general-purpose aggregation (e.g., sum, max, string concatenation).
    -   **Collecting:** Using `Collectors` for sophisticated aggregations like `toList`, `joining`, `groupingBy`, and `partitioningBy`.
-   **Infinite Streams:** Generating sequences like the Fibonacci series using `Stream.iterate` and `Stream.generate`.
-   **Optional Class:** A brief look at how `Optional` is used to handle potential null values in stream results (e.g., `findAny`).

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Thinking Declaratively:** Shift your mindset from *how* to process data (loops, manual state management) to *what* should be done with the data.
2.  **Building Stream Pipelines:** Compose multiple intermediate operations to transform data and use terminal operations to produce a result.
3.  **Advanced Aggregations:** Use `Collectors` to group, partition, and summarize data efficiently.
4.  **Handling Infinite Data:** Understand how to work with potentially infinite sequences using lazy evaluation.
5.  **Clean Code:** Write more concise and expressive code by replacing complex nested loops and conditional logic with stream-based solutions.

### Examples

The provided source code includes practical examples for each of these concepts, including a "Menu" example (inspired by *Java 8 in Action*) to demonstrate filtering, mapping, and grouping of dishes based on their attributes.
