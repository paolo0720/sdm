# Part 06 – Collections

This lecture introduces the **Java Collections Framework**, a unified architecture for representing and manipulating groups of objects. It covers high-performance data structures, consistent APIs, and the fundamental principles of object equivalence and ordering.

## Content
- **Collections Overview**:
    - Standardization of group handling in the `java.util` package.
    - Interoperability and high performance.
    - All interfaces and classes are generic.
- **Core Interfaces**:
    - **List**: Ordered access by index (e.g., `ArrayList`, `LinkedList`).
    - **Set**: No duplicate elements (e.g., `HashSet`, `LinkedHashSet`, `TreeSet`, `EnumSet`).
    - **Map**: Key-value pairs (associative arrays) (e.g., `HashMap`, `TreeMap`).
    - **Queue/Deque**: FIFO/LIFO access (e.g., `PriorityQueue`, `ArrayDeque`).
- **Ordering vs. Sorting**:
    - **Ordered**: Follows insertion order or an imposed sequence.
    - **Sorted**: Arranged based on a comparative order (Natural order vs. Comparator).
- **Object Equivalence**:
    - **`equals()`**: Implementing the equivalence relation (reflexive, symmetric, transitive, consistent).
    - **`hashCode()`**: The contract between `equals()` and hash-based collections.
    - **Equivalence of Collections**: How lists and sets determine if they are equal.
- **Ordering Mechanisms**:
    - **`Comparable`**: Defining a class's natural order via `compareTo()`.
    - **`Comparator`**: Imposing custom orders via `compare()`.
- **Best Practices**: 
    - Avoiding legacy classes like `Vector`, `Stack`, `Hashtable`, and `Dictionary`.
    - Understanding `ConcurrentModificationException` when modifying a collection during iteration.

## Exercises
- **Term Frequency Table**: Write a system of classes to produce a frequency table of terms from a given string, including tokenization, normalization, and filtering (stop words).

## Learning Objectives
By the end of this part, students are expected to:
- Select the most appropriate collection type for a specific problem.
- Implement `equals()` and `hashCode()` correctly to ensure data structure integrity.
- Use `Comparable` and `Comparator` to sort data in various ways.
- Efficiently iterate through collections and handle edge cases like concurrent modifications.