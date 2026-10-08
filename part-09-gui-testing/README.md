# Part 15 – GUI Testing

This lecture focuses on the challenges and best practices for testing Graphical User Interfaces (GUIs). It introduces architectural patterns that facilitate testability and demonstrates how to unit test the logic of a GUI application using test doubles.

### What's the content?

Testing GUIs is notoriously difficult because they are often tightly coupled to the underlying operating system and require asynchronous event handling. This module explores:

-   **The Problem with Tight Coupling:** Why putting all application logic inside `ActionListener`s or custom components makes testing nearly impossible.
-   **Separation of Concerns:** Decoupling the *what* (application logic) from the *how* (GUI implementation).
-   **Architectural Patterns for Testability:**
    -   Introduction to patterns like **Passive View** (a variation of Model-View-Presenter).
    -   Defining the View as an **interface** (`HelloWorldView`) to hide the Swing implementation details.
    -   Creating a **Logic** class (`HelloWorldLogic`) that manages the flow of the application and interacts with the View interface.
-   **Unit Testing with Test Doubles:**
    -   Using **Spies** or **Mocks** to verify that the Logic class calls the correct methods on the View in response to user actions.
    -   Writing fast, deterministic unit tests that run without ever opening a window.
-   **Implementing the View:** Using Swing to implement the `HelloWorldView` interface, keeping the implementation focused solely on widget creation and event forwarding.

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Design Testable GUIs:** Apply architectural patterns to separate logic from the presentation layer.
2.  **Use View Interfaces:** Define clear contracts for what the UI should do, without specifying how it's rendered.
3.  **Implement Test Doubles:** Create simple "Spy" classes to record interactions during unit tests.
4.  **Write Clean UI Logic:** Keep your application logic clean and independent of Swing classes, making it easier to maintain and refactor.
5.  **Understand the Benefits of Decoupling:** See how a well-structured application can be tested more effectively than a "monolithic" GUI class.

### Examples

The provided source code demonstrates this separation:
-   `HelloWorldView.java`: An interface defining the UI capabilities.
-   `HelloWorldLogic.java`: The core logic that responds to events and directs the view.
-   `SwingHelloWorld.java`: The concrete Swing implementation of the view.
-   `HelloWorldLogicTest.java`: A JUnit test suite that uses a `HelloWorldViewSpy` to validate the logic's behavior.