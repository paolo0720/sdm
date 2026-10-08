# Part 13 – Basics of Swing

This lecture introduces **Swing**, the standard Java library for creating Graphical User Interfaces (GUIs). It covers the fundamental principles of GUI programming, the structure of Swing applications, and the importance of layout management.

### What's the content?

The module is divided into two main sections:

-   **Hello, World!:**
    -   Creating your first window using `JFrame`.
    -   Adding basic components: `JLabel` (text) and `JButton` (actions).
    -   **The Event Dispatch Thread (EDT):** Understanding why all GUI code must run on a specific thread and how to use `SwingUtilities.invokeLater` to ensure thread safety.
    -   Basic event handling with `ActionListener`.
-   **The Rules of the Game:**
    -   **Containment Hierarchy:** How components are organized in a tree structure, starting from a top-level container (like `JFrame`) down to individual widgets.
    -   **Inheritance Hierarchy:** Exploring the relationship between AWT and Swing (`Component` -> `Container` -> `JComponent`).
    -   **Swing Windows:** Comparing `JFrame`, `JDialog`, and `JWindow`, and understanding their specific use cases (e.g., modality in dialogs).
    -   **Window Lifecycle:** The difference between hiding a window and disposing of its native resources using `dispose()`.
    -   **Layout Management:** 
        -   The philosophy of "no fixed layout": why we avoid absolute positioning.
        -   Deep dive into `BorderLayout` (the default for `JFrame`).
        -   Introduction to `GridBagLayout` for complex, flexible grids.
        -   Overview of other managers like `BoxLayout` and `CardLayout`.

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Build Basic GUIs:** Create functional windows with labels and buttons.
2.  **Ensure Thread Safety:** Correctlly use the Event Dispatch Thread for all UI updates.
3.  **Manage Component Organization:** Construct a proper containment hierarchy using `JPanel` and other containers.
4.  **Master Layouts:** Use `BorderLayout` and `GridBagLayout` to create responsive interfaces that adapt to window resizing.
5.  **Understand Window Types:** Choose the right type of window (`JFrame` vs `JDialog`) for different application needs.

### Examples

The provided source code includes:
-   `HelloWorld.java`: A minimal Swing application.
-   `BorderLayoutDemo.java`: A visual guide to how `BorderLayout` partitions a container.
-   `GridBagLayoutDemo.java`: A demonstration of the powerful (but complex) `GridBagLayout`.
-   `DisposedFrame.java` and `HiddenFrame.java`: Examples showing how window closing affects program termination.
