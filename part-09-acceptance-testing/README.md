# Part 09 – Acceptance tests

This lecture introduces the role of **Acceptance Tests** in the software development lifecycle, particularly within the context of **Test-Driven Development (TDD)** and **Acceptance Test-Driven Development (ATDD)**.

## Content
- **The TDD Cycle**: Write a failing test -> Make the test pass -> Refactor.
- **Acceptance Test-Driven Development (ATDD)**:
    - Starting new features with an acceptance test.
    - Exercising the system end-to-end (with conceptual exceptions like the GUI).
    - Acceptance tests as **Executable Specifications**: automated, verifiable definitions of requirements.
- **The Proposed Process**:
    1. Pick a requirement (user story).
    2. Write a failing acceptance test.
    3. Automate the acceptance test.
    4. Use TDD to implement the logic until the acceptance test passes.
- **Problem Solving & Design**:
    - Refining a problem statement (e.g., Tic-Tac-Toe) into specific requirements.
    - Using graphic mock-ups for initial UI design.
    - **Broad-brush design**: Identifying key interfaces (`TicTacToeView`), classes (`TicTacToeGame`), and enumerations (`Position`) before implementation.
- **Unit Tests vs. Acceptance Tests**:
    - Unit tests: Assure we are building the system in the **right way** (internal correctness).
    - Acceptance tests: Assure we are building the **right system** (verifying requirements).
    - They are complementary, not exclusive.

## Exercises
- **Tic-Tac-Toe**: Developing an application using an executable specification that models a complete game scenario where a player wins.

## Learning Objectives
By the end of this part, students are expected to:
- Explain the benefits of writing acceptance tests before implementation.
- Distinguish between the goals of unit testing and acceptance testing.
- Translate a set of requirements into an automated, end-to-end test scenario.
- Design a system using a top-down approach starting from high-level requirements.
