# Part 14 – Working with Swing components

This lecture delves deeper into the Swing library, focusing on the wide array of available components and the critical relationship between GUI programming and **multithreading**. It also covers how to create custom components and handle animations.

### What's the content?

The module is structured into three main areas:

-   **Basics of Multithreading:**
    -   Understanding **Processes vs. Threads**.
    -   The `java.lang.Thread` class and the `Runnable` interface.
    -   Thread lifecycle: `start()`, `sleep()`, `join()`, and `interrupt()`.
    -   **Virtual Threads (Java 21):** An introduction to lightweight threads for high-throughput applications.
    -   The challenges of concurrency: critical sections, mutual exclusion, and race conditions.
-   **Advanced Swing Components:**
    -   Using standard dialogs with `JOptionPane` (message, confirm, input dialogs).
    -   Enhancing interfaces with `JScrollPane`, `JTextField`, `JSlider`, `JCheckBox`, and `JComboBox`.
    -   Color selection with `JColorChooser`.
    -   **Look-and-Feel (L&F):** How to change the global appearance of a Swing application.
    -   **Swing and Thread Safety:** A deep dive into why Swing is not thread-safe and the strict rules for interacting with the **Event Dispatch Thread (EDT)**.
-   **Writing Custom Components:**
    -   Extending `JComponent` to create entirely new widgets.
    -   **Painting:** Overriding `paintComponent(Graphics g)` and using `Graphics2D` for advanced rendering (shapes, text, images, antialiasing).
    -   **Event Management:** Handling low-level mouse and keyboard events directly within a component.
    -   **Animation:** Using `javax.swing.Timer` to create smooth, thread-safe animations.

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Utilize a Wide Range of Components:** Select and implement the appropriate Swing widgets for complex user inputs and data displays.
2.  **Understand Concurrency:** Grasp the basics of how Java manages multiple threads of execution.
3.  **Prevent UI Freezes:** Identify long-running tasks and ensure they don't block the EDT, keeping the interface responsive.
4.  **Create Custom Visuals:** Use the `Graphics2D` API to draw custom shapes and implement unique component behaviors.
5.  **Implement Basic Animations:** Use timers to update the UI state periodically for dynamic effects.

### Examples and Assignments

The provided source code includes:
-   `JOptionPaneDemo.java`: Simple interaction with standard dialogs.
-   `SwingDemo.java`: A comprehensive application combining various components (sliders, checkboxes, combo boxes).
-   `PaintDemo.java`: Basics of custom painting by drawing lines.
-   `EventDemo.java`: Demonstrating low-level mouse event processing.
-   `AnimationDemo.java`: A "bouncing ball" example using `JComponent` and `Timer`.
-   **Assignment (Calculator):** Building a functional calculator GUI.
-   **Assignment (Clock):** Implementing an analog or digital clock.
