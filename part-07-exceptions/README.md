# Part 07 – Exceptions

This lecture covers error handling in Java, focusing on the exception mechanism. It contrasts traditional error-reporting techniques with Java's robust exception hierarchy and explores strategies for recovery and resource management.

## Content
- **Reporting Error Conditions**:
    - **Error Codes**: Returning specific values (e.g., `0`, `-1`) to indicate status.
    - **Error Flags**: Setting internal state within a class (e.g., `System.out` uses this).
    - **Exceptions**: Interrupting execution to inform the caller of an exceptional condition.
- **The Exception Mechanism**:
    - **Throwing**: Using the `throw` keyword to create and propagate an exception object.
    - **Stack Trace**: Understanding the report of active method frames during an error.
- **The Exceptions Hierarchy**:
    - **Throwable**: The ancestor of all errors and exceptions.
    - **Error**: Indicates serious, usually unrecoverable JVM-level problems.
    - **Exception**: The base class for conditions that an application might want to catch.
    - **RuntimeException (Unchecked)**: Usually indicates programming bugs (e.g., `NullPointerException`).
    - **Checked Exceptions**: Anticipated conditions caused by external factors (e.g., `FileNotFoundException`); must be declared in the `throws` clause.
- **Handling Exceptions**:
    - **try-catch**: Encapsulating risky code and providing recovery logic.
    - **Multi-catch**: Handling multiple exception types in a single block (`catch (Ex1 | Ex2 e)`).
    - **finally**: Ensuring cleanup logic (like closing resources) always executes.
    - **Chaining and Rethrowing**: Wrapping low-level exceptions in higher-level ones to provide better context.
- **Exceptions in Interfaces**: Rules for overriding methods that declare exceptions (implementations can throw subclasses of the declared exceptions or fewer exceptions).

## Learning Objectives
By the end of this part, students are expected to:
- Choose the appropriate error-reporting strategy for a given scenario.
- Properly use `try`, `catch`, and `finally` blocks to handle runtime errors.
- Understand the difference between checked and unchecked exceptions and when to use each.
- Create custom exception classes to model domain-specific error conditions.
- Implement resource-safe code using the `finally` block or try-with-resources (preview).
