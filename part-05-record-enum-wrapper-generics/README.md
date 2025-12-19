# Part 05 – Enums, records, wrappers, and generics

This lecture explores advanced Java type constructs that help in writing more expressive, safe, and concise code.

## Content
- **Enumerations**:
    - **Basics**: Defining a fixed set of named constants as a new data type.
    - **First-class Classes**: Enums can have fields, constructors, and methods. They can also implement interfaces.
    - **Special Methods**: `values()`, `valueOf(String)`, and `ordinal()`.
    - **Switch Integration**: Using enums in modern switch statements with arrow notation.
- **Records**:
    - **Data Carriers**: Classes designed primarily to hold immutable data (Data Transfer Objects).
    - **Auto-generation**: Java automatically provides a canonical constructor, accessors, `equals()`, `hashCode()`, and `toString()`.
    - **Constraints**: Records are final and cannot be subclassed or have a mutable state.
- **Primitive Type Wrappers**:
    - **Object Representation**: Wrapping primitive types (e.g., `int` to `Integer`, `boolean` to `Boolean`) to use them where objects are required.
    - **The Number Hierarchy**: Understanding how numeric wrappers inherit from the `Number` abstract class.
    - **Auto-boxing and Unboxing**: Automatic conversion between primitives and their corresponding wrapper objects.
    - **Caching**: Performance optimizations for certain ranges of values (e.g., -128 to 127 for Integers).
- **Generics**:
    - **Type Safety**: Parameterizing classes, interfaces, and methods to operate on specific types without unsafe casting.
    - **Wildcards**: Using `?` and `? extends T` for flexible parameterization.
    - **Bounding**: Restricting type parameters (e.g., `<N extends Number>`).
    - **Generic Methods**: Defining type parameters specifically for individual methods.

## Learning Objectives
By the end of this part, students are expected to:
- Use enums to represent fixed sets of constants with associated behavior.
- Leverage records to reduce boilerplate when creating data-centric classes.
- Understand the trade-offs between primitives and wrapper objects, including the pitfalls of unboxing.
- Write generic classes and methods to create reusable and type-safe components.
