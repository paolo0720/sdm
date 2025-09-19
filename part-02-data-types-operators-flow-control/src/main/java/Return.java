void main() {
    for (int counter = 0; counter < 10; counter++) {
        // start a new iteration if the counter is odd
        if (counter % 2 == 1) continue;
        // exit the method if the counter is equal to 8
        if (counter == 8) return;
        IO.println(counter);
    }
    IO.println("done.");
}
