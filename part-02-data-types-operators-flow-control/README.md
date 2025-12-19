# Part 02 – Data types, operators, and flow control

This lecture covers the fundamental building blocks of Java programs: how data is represented, how it can be manipulated using operators, and how to control the execution flow of an application.

## Content
- **Variables and Data Types**:
    - **Java Types**: Distinction between primitive data types (keywords) and reference types (instances of classes).
    - **Primitive Types**: Numeric integral (`byte`, `short`, `int`, `long`, `char`), floating point (`float`, `double`), and `boolean`.
    - **Constants and Inference**: Using `final` for constants and `var` for local variable type inference.
- **Type Conversion and Casting**: Automatic widening conversions vs. compulsory narrowing conversions using the `cast ()` operator.
- **Strings**: Understanding that strings are objects, the behavior of the `+` operator (left-associative), and string concatenation.
- **Arrays**: 
    - Allocation with the `new` operator and 0-based indexing.
    - Using the `length` field and array initializers.
    - **Multidimensional Arrays**: Arrays of arrays, including the definition of "jagged" arrays.
- **Operators and Expressions**: 
    - Arithmetic, assignment, relational, and logical operators.
    - **Advanced Concepts**: Type promotion in expressions, operator overloading, short-circuiting (`&&` vs `&`), and bit-level operators.
    - The ternary `? :` operator.
- **Flow Control Statements**:
    - **Selection**: `if-then-else` and the evolution of `switch` (traditional, grouped cases, enhanced syntax with `->`, and switch expressions with `yield`).
    - **Iteration**: `while`, `do-while`, `for`, and the `for-each` loop for arrays.
    - **Jump**: `break`, `continue`, and `return` (including returning values from methods).

## Exercises
- **Revised «Hello, World!»**: A program that greets people by name using command-line arguments.
- **Oxford Comma**: Implementing a program to say hello to multiple people, correctly formatting the list with commas and "and".
- **Calculator**: Implementing a program to perform arithmetic operations, eventually supporting concatenated operations.

## Learning Objectives
By the end of this part, students are expected to:
- Choose the correct primitive or reference type for a given task.
- Understand memory allocation for arrays and how references work.
- Master all Java operators and their precedence/promotion rules.
- Implement complex logic using selection and iteration statements, including modern switch expressions.
