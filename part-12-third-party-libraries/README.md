# Part 12 – Working with third-party libraries

This lecture introduces how to extend the functionality of Java applications by using third-party libraries. It focuses on the practical aspects of dependency management and explores the **JSON** format as a primary example.

### What's the content?

The module covers the following topics:

-   **Introduction to Dependency Management:**
    -   Why we use third-party libraries.
    -   The role of build tools like **Gradle** and **Maven** in managing dependencies.
    -   Understanding central repositories like **Maven Central**.
-   **Configuring Gradle:**
    -   Adding dependencies to `build.gradle.kts`.
    -   Understanding implementation vs. test implementation scopes.
    -   Using `libs.versions.toml` (Version Catalogs) for centralized version management.
-   **JSON (JavaScript Object Notation):**
    -   JSON as a lightweight data-interchange format.
    -   Syntax rules: objects, arrays, strings, numbers, booleans, and null.
-   **Practical Example: The `org.json` Library:**
    -   Integrating the `org.json` library into a project.
    -   Creating and manipulating JSON objects (`JSONObject`).
    -   Handling JSON arrays (`JSONArray`).
    -   Serializing Java data structures to JSON strings.

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Manage Dependencies:** Add and update third-party libraries in your Java projects using Gradle.
2.  **Understand JSON:** Read and manually construct JSON data.
3.  **JSON Processing:** Use the `org.json` library to programmatically create and parse JSON content.
4.  **Version Control of Dependencies:** Understand the best practices for specifying library versions in build configurations.

### Example

The `JsonTest.java` file provides a simple demonstration of how to use `JSONObject` to store various data types (numbers, arrays) and print the resulting JSON string.
