# Part 11 – Basics of Input and Output

This lecture covers the fundamental concepts of Input and Output (I/O) in Java, focusing on the `java.io` package. It explains how to handle both binary and text data, the importance of resource management, and how to interact with the console.

### What's the content?

The module is structured into several key areas:

-   **I/O Streams (Binary Data):**
    -   Introduction to `InputStream` and `OutputStream` as the base classes for all byte-oriented streams.
    -   Exploring the hierarchy: `FileInputStream`, `FileOutputStream`, `ByteArrayInputStream`, etc.
    -   **Buffering:** Using `BufferedInputStream` and `BufferedOutputStream` to improve performance by reducing the number of costly system calls.
    -   **Resource Management:** Ensuring streams are closed using **try-with-resources** to prevent memory and file descriptor leaks.
-   **Data Streams:**
    -   Using `DataInputStream` and `DataOutputStream` to read and write primitive Java data types (int, long, double, etc.) in a machine-independent binary format.
-   **Readers and Writers (Text Data):**
    -   Understanding the difference between bytes and characters.
    -   **Character Encodings:** A deep dive into `Charset`, `Unicode` (UTF-8, UTF-16), and why "there is no such thing as plain text."
    -   The `Reader` and `Writer` hierarchy: `InputStreamReader`, `OutputStreamWriter`, `FileReader`, `FileWriter`.
    -   **Buffered Text I/O:** Using `BufferedReader` (with its useful `readLine()` method) and `BufferedWriter`.
-   **Console I/O:**
    -   Working with standard streams: `System.in`, `System.out`, and `System.err`.
    -   Using the `java.io.Console` class for more advanced console interactions (like reading passwords).
-   **Print Streams:**
    -   The convenience of `PrintStream` and `PrintWriter` for formatted text output.

### What you are expected to learn

By the end of this lecture, you should be able to:

1.  **Differentiate between Byte and Character Streams:** Know when to use `InputStream`/`OutputStream` vs. `Reader`/`Writer`.
2.  **Efficient I/O:** Implement buffering to optimize data transfer.
3.  **Handle Encodings Correctly:** Understand how to specify charsets when reading or writing text files to avoid "mojibake."
4.  **Resource Safety:** Consistently use try-with-resources for all I/O operations.
5.  **Data Persistence:** Read and write primitive data and strings to files.
6.  **Console Interaction:** Build interactive CLI applications that read user input and display formatted output.

### Examples and Assignments

The provided code includes:
-   **Examples:** Demonstrations of various stream and reader/writer usage.
-   **Assignment 1 (HexDump):** A program that generates a hexadecimal representation of any file.
-   **Assignment 2 (Recode):** A tool to change the character encoding of a text file.
-   **Assignment 3 (Term Frequency):** A class that calculates word frequencies in a text file.
